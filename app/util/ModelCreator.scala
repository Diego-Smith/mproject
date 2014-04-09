package play

object ModelCreator {

  def main(args: Array[String]): Unit = {
    //    var text = tabulize("ciao\nprova")
    //    print(getVarName("TEST_PROVA"))
    //    println(listMethod("mails", List(("id", "Pk[Long]"), ("test", "String"), ("var", "String"))))
    print(createModelClass("CONSIGLI", List(("id", "Pk[Long]"),
      ("titolo", "String"), ("descrizione", "String"), ("autore", "String"), ("posizione", "Long"))))
  }

  val cr = "\n"
  val quoteChar = "\""
  val tilde = "~"
  val commaAndSpace = ", "
  val space = " "

  def createModelClass(tableName: String, listFields: List[(String, String)]): String = {
    
    generateSqlScript(tableName, listFields) + cr + cr + "-------------------" + cr + cr +
    imports() + cr +
    generateClass(tableName, listFields) + cr + cr +
    generateObject(tableName, listFields)
  }
  
  
  private def imports() : String = {
    "import anorm.SqlParser._" + cr +
    "import java.util.Date" + cr +
    "import anorm._" + cr +
    "import anorm.~" + cr +
    "import play.api.db._" + cr +
    "import play.api.Play.current" + cr
  }
  
  private def generateSqlScript(tableName: String, listFields: List[(String, String)]): String = {
    s"# Tasks schema" + cr + cr +
      s"# --- !Ups" + cr + cr + "" +
      s"CREATE SEQUENCE ${tableName}_id_seq;" + cr +
      s"CREATE TABLE ${tableName} (" + cr +
      tabulize(
        getSqlTableFields(tableName, listFields)) + cr +
        s");" + cr + cr + "# --- !Downs" + cr + s"DROP TABLE ${tableName};" + cr + s"DROP SEQUENCE ${tableName}_id_seq;";

  }

  private def getSqlTableFields(tableName: String, listFields: List[(String, String)]): String = {
    listFields.map(a => a._1 + " " + getSqlVar(tableName, a._2)).mkString(",\n")
  }
  
  private def getSqlVar(tableName: String, scalaVar: String) : String = {
    scalaVar match  {
      case "String" => "varchar(200)"
      case "Pk[Long]" => s"integer NOT NULL DEFAULT nextval('${tableName}_id_seq') UNIQUE"
      case "java.util.Date" | "Date" => "datetime"
      case "Long" => "integer"
      case s => ""
    }
  }

  private def generateClass(implicit tableName: String, listFields: List[(String, String)]): String = {
    s"case class ${getClassName}(${getSignature(listFields)})"
  }

  private def generateObject(implicit tableName: String, listFields: List[(String, String)]): String = {
    s"object ${getClassName} {${cr}" +
      tabulize(s"val ${getVarName} = { ${cr}" +
        tabulize(s"${getVarFields(getClassName, listFields)}") + cr + "}" + cr
        + cr +
        generateListMethod(tableName, listFields) + cr + cr +
        generateCreateMethod(tableName, listFields.filterNot(a => a._1.equalsIgnoreCase("id"))) + cr + cr) + cr + "}"
  }

  private def generateListMethod(implicit tableName: String, listFields: List[(String, String)]): String = {

    s"def list(): List[${getClassName}] = DB.withConnection { implicit c => ${cr}" +
      tabulize(s"SQL(${quoteChar}select * from ${tableName}${quoteChar}).as(${getVarName} *)  ${cr}") + cr +
      s"}"
  }

  private def generateCreateMethod(tableName: String, listFields: List[(String, String)]): String = {

    val seqNameVars = listFields.map(a => a._1)
    val fieldsWithComma = seqNameVars.mkString(commaAndSpace)
    val fieldsWithCommaAndGraphs = seqNameVars.map(a => "{" + a + "}").mkString(commaAndSpace)
    val varSubs = seqNameVars.map(a => s"'${a} -> ${a}").mkString(commaAndSpace)
    s"def create(${getSignature(listFields)}) = {${cr}" + tabulize(s"DB.withConnection {" +
      s" implicit c =>${cr}" +
      tabulize(s"SQL(${quoteChar}insert into ${tableName}(${fieldsWithComma})" +
        s" values (${fieldsWithCommaAndGraphs})${quoteChar}).${cr}" +
        s"on(${varSubs}).executeInsert() ") + cr + "}") + cr + "}"

  }

  private def getVarName(implicit tableName: String): String = {
    val splitUnderscore = tableName.toLowerCase().split("_")
    splitUnderscore.head + splitUnderscore.tail.map(_.capitalize).mkString("")
  }

  private def getClassName(implicit tableName: String): String = {
    getVarName.capitalize
  }

  private def tabulize(text: String): String = {
    text.split("\n").map(a => space + space + space + a).mkString("\n")

  }

  private def getSignature(listFields: List[(String, String)]): String = {
    listFields.map(a => s"${a._1}: ${a._2}").mkString(commaAndSpace)
  }

  private def getVarFields(nameClass: String, listFields: List[(String, String)]): String = {
    val seqNameVars = listFields.map(a => a._1)
    listFields.map(a => s"get[${a._2}](${quoteChar}${a._1}${quoteChar}) ").mkString("~ \n") + s"map { ${cr}" +
      tabulize("case " + seqNameVars.mkString(tilde) + s" => new ${nameClass}(" + seqNameVars.mkString(",") + ")") +
      cr + "}"
  }

}

