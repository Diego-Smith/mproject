package enums

object Oggetto extends Enumeration {
  //	object Oggetto extends Enumeration("prova", "Libro", "Oggetto") {

  case class TipoOggetto(controlText: String, val label: String) extends Val(controlText)

  val LIBRO = TipoOggettoInternalValue("Libro", "Librooz")
  val OGGETTO = TipoOggettoInternalValue("Oggetto", "Object")

  //  type TipoOggetto(label: String) = Value
  //  val provaa("test"), Libro, Oggetto = Value

  protected final def TipoOggettoInternalValue(controlText: String, label: String): TipoOggetto = {
    TipoOggetto(controlText, label)
  }
}
