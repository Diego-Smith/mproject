package models

import anorm.SqlParser._
import java.util.Date
import anorm._
import anorm.~
import org.apache.commons.lang3.time.DateFormatUtils

/**
 * 
 * User: Diego Fabbro
 * Date: 08/01/13
 * Time: 11.58
 *
 */
case class Mail (id: Pk[Long]  = NotAssigned, to: String, cc: Option[String], obj: String, 
    subject: String, dateCreation: Date, dateUpdated: Date, status: Long) 
    
object Mail {
  
  val mail = {
    get[Pk[Long]]("id") ~
    get[String]("to") ~
    get[Option[String]]("cc") ~
    get[String]("obj") ~
    get[String]("subject") ~
    get[Date]("dateCreation") ~
    get[Date]("dateUpdated") ~
    get[Long]("status") map {
      case id~to~cc~obj~subject~dateCreation~dateUpdated~status => 
        new Mail(id, to, cc, obj, subject, dateCreation, dateUpdated, status)
    }
  }
  import play.api.db._
  import play.api.Play.current
//  def findById(id: Long) : Option[Post] = DB.withConnection { implicit c =>
//    SQL("select * from post where id = " + id + " order by dateCreation").as(Post.post.singleOpt)
//  }
//  
//  def posts() : List[Post] =  DB.withConnection { implicit c =>
//    SQL("select * from post order by dateCreation").as(post *)
//  }

  def create(to: String, cc: String, obj: String, subject: String) = {
	val tday = new Date
    DB.withConnection( implicit c =>
      SQL("insert into mail (to, cc, obj, subject, dateCreation, dateUpdated, status) " +
      		"values ({to}, {cc}, {obj}, {subject}, {dateCreation}, {dateUpdated}, {status})").
        on('to -> to, 'cc -> cc, 'obj -> obj, 'subject -> subject, 'dateCreation -> tday, 'dateUpdated -> tday, 'status -> 0)
        .executeInsert()
    )
  }
  
  def list(): List[Mail] = DB.withConnection { implicit c =>
    SQL("select * from mail").as(mail *)
  }
  
//  def update(id: Long, post: Post) = {
//    DB.withConnection { implicit connection =>
//      SQL(
//        """
//          update post
//          set title = {title}, content = {content}, dateCreation = {dateCreation}
//          where id = {id}
//        """
//      ).on(
//        'id -> id,
//        'title -> post.title,
//        'content -> post.content,
//        'dateCreation -> post.dateCreation
//      ).executeUpdate()
//    }
//  }
  
}