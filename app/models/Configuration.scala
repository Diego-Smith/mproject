package models

import anorm.SqlParser._
import java.util.Date
import anorm._
import anorm.~

/**
 * 
 * User: Diego Fabbro
 * Date: 08/01/13
 * Time: 11.58
 *
 */
case class Configuration (var id: Pk[Long]  = NotAssigned, var key: String, var value: String) 
    
object Configuration {
  
  val conf = {
    get[Pk[Long]]("id") ~
      get[String]("key") ~
      get[String]("value") map {
      case id~key~value => new Configuration(id, key, value)
    }
  }
  import play.api.db._
  import play.api.Play.current
  def findById(id: Long) : Option[Configuration] = DB.withConnection { implicit c =>
    SQL("select * from configuration where id = " + id + " order by dateCreation").as(Configuration.conf.singleOpt)
  }
  
  def posts() : List[Configuration] =  DB.withConnection { implicit c =>
    SQL("select * from post order by id").as(conf *)
  }

//  def createPost(fkUser: Long, content: String, title: String) {
//    DB.withConnection( implicit c =>
//
//      SQL("insert into post (id, dateCreation, fkUser, content, title) values ({id}, {dateCreation}, {author}, {content}, {title}").
//        on('id -> getNextId, 'dateCreation -> new java.util.Date(), 'fkUser -> fkUser, 'content -> content, 'title -> title)
//        .executeInsert()
//    )
//  }
  
  def update(key: String, value: String) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update Configuration
          set value = {value}
          where key = {key}
        """
      ).on(
        'value -> value,
        'key -> key
      ).executeUpdate()
    }
  }
  
  
//  def delete(id: Long) = {
//    DB.withConnection { implicit connection =>
//      SQL("delete from post  where id = {id}").on('id -> id).executeUpdate()
//    }
//  }
}