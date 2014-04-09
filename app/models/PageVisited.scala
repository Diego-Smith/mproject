package models
import java.util.Date

case class PageVisited(var id: Long, var pagename: String, var ip: String, var dateVisited: Date, var fkUser: Long)
object PageVisited {
  import anorm._
  import anorm.SqlParser._

  val page = {
		  get[Long]("id") ~ 
		  get[String]("pagename") ~ 
		  get[String]("ip") ~
		  get[Date]("dateVisited") ~
		  get[Long]("fkUser")  map {
		    case id~pagename~ip~dateVisited~fkUser => PageVisited(id, pagename, ip, dateVisited, fkUser)
		  }
  }
  import play.api.db._
  import play.api.Play.current
//  def getPage(id: Long) : User = DB.withConnection { implicit c =>
//  	SQL("select * from user where id = " + id).single(user)
//  }
  
  def create(pagename: String, ip: String, fkUser: Long) {
      val today = new Date
	  DB.withConnection( implicit c =>
      SQL("insert into pages_visited (pagename, ip, dateVisited, fkUser) values ({pagename}, {ip}, {dateVisited}, {fkUser})").
      on('pagename -> pagename, 'ip -> ip, 'dateVisited -> today, 'fkUser -> fkUser).executeInsert()
    )
  }
  
//  def getNextId(): Long = DB.withConnection { implicit c =>
//      SQL("select max(id) + 1 as maxId from order").apply().head[Long]("maxId")
//      SQL("select max(id) + 1 as maxId from pages_visited").as(get[Option[Long]]("maxId") ?).getOrElse(1)
//      SQL("select pagevisited_id_seq.NEXTVAL from DUAL").as(scalar[Long].single)
//  }
//  def delete(id: Long) {}
  
  def all(): List[PageVisited] = DB.withConnection { implicit c =>
  	SQL("select * from pages_visited").as(page *)
  }


}


