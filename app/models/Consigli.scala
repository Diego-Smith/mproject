package models

import anorm.SqlParser._
import java.util.Date
import anorm._
import anorm.~
import play.api.db._
import play.api.Play.current
import enums.Oggetto


case class Consigli(id: Pk[Long], val titolo: String, val descrizione: String, val autore: Option[String], val tipo: Oggetto.TipoOggetto, val posizione: Long)

object Consigli {
   val consigli = { 
      get[Pk[Long]]("id") ~ 
      get[String]("titolo") ~ 
      get[String]("descrizione") ~ 
      get[Option[String]]("autore") ~ 
      get[String]("tipo") ~ 
      get[Long]("posizione") map { 
        case id~titolo~descrizione~autore~tipo~posizione => new Consigli(id,titolo,descrizione,autore, Oggetto.withName(tipo).asInstanceOf[Oggetto.TipoOggetto],posizione)
      }
   }
   
   def list(): List[Consigli] = DB.withConnection { implicit c => 
      SQL("select * from CONSIGLI").as(consigli *)  
   }
   
   def listFirstTen(): List[Consigli] = DB.withConnection { implicit c => 
      SQL("select * from CONSIGLI order by posizione limit 0,10").as(consigli *)  
   }
   
   def create(titolo: String, descrizione: String, autore: String, posizione: Long) = {
      DB.withConnection { implicit c =>
         SQL("insert into CONSIGLI(titolo, descrizione, autore, posizione) values ({titolo}, {descrizione}, {autore}, {posizione})").
         on('titolo -> titolo, 'descrizione -> descrizione, 'autore -> autore, 'posizione -> posizione).executeInsert() 
      }
   }
}

