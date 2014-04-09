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
case class Post (val id: Pk[Long]  = NotAssigned, var dateCreation: java.util.Date, var fkUser: Pk[Long], 
    val content: String, val title: String) 
/**
 * Helper for pagination.
 */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long, pageSize: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val prevPrev =  Option(page - 2).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
  lazy val nextNext = Option(page + 2).filter(_ => (offset + items.size + pageSize) < total)
  lazy val first = Option(0)
  lazy val last = Option((total / pageSize).toInt)
}
    
    
object Post {
  
  val post = {
    get[Pk[Long]]("id") ~
      get[Date]("dateCreation") ~
      get[Pk[Long]]("fkUser") ~
      get[String]("content") ~
      get[String]("title") map {
      case id~dateCreation~fkUser~content~title => new Post(id, dateCreation, fkUser, content, title)
    }
  }
  import play.api.db._
  import play.api.Play.current
  def findById(id: Long) : Option[Post] = DB.withConnection { implicit c =>
    SQL("select * from post where id = " + id + " order by dateCreation").as(Post.post.singleOpt)
  }
  
  def posts() : List[Post] =  DB.withConnection { implicit c =>
    SQL("select * from post order by dateCreation").as(post *)
  }

  def createPost(content: String, title: String, fkUser: Long) {
    DB.withConnection( implicit c =>

      SQL("insert into post (dateCreation, fkUser, content, title) values ({dateCreation}, {fkUser}, {content}, {title})").
        on('dateCreation -> new java.util.Date(), 'fkUser -> fkUser, 'content -> content, 'title -> title)
        .executeInsert()
    )
  }
  
  def list(page: Int = 0, pageSize: Int = 5, orderBy: Int = 2, filter: String = "%"): Page[(Post)] = {
    
    val offset = pageSize * page
    
    DB.withConnection { implicit connection =>
      
      val posts = SQL(
        """
          select id,dateCreation,fkUser,content,title from post 
          where upper(title) like upper({filter}) or upper(content) like upper({filter})
          order by {orderBy} desc nulls last
          limit {pageSize} offset {offset}
        """
      ).on(
        'pageSize -> pageSize, 
        'offset -> offset,
        'filter -> filter,
        'orderBy -> orderBy
      ).as(post *)

      val totalRows = SQL(
        """
          select count(*) from post 
          where upper(title) like upper({filter})
        """
      ).on(
        'filter -> filter
      ).as(scalar[Long].single)

      Page(posts, page, offset, totalRows, pageSize)
      
    }
    
  }
  
  
  def update(id: Long, post: Post) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update post
          set title = {title}, content = {content}, dateCreation = {dateCreation}
          where id = {id}
        """
      ).on(
        'id -> id,
        'title -> post.title,
        'content -> post.content,
        'dateCreation -> post.dateCreation
      ).executeUpdate()
    }
  }
  
  def delete(id: Long) = {
    DB.withConnection { implicit connection =>
      SQL("delete from post  where id = {id}").on('id -> id).executeUpdate()
    }
  }
}