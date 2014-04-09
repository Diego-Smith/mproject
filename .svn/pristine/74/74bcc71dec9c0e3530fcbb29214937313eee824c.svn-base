package models

import scala.util.Random
import play.api.Play
import util.MProjectLogger
import util.MProjectLogger

case class User(val id: Long, val username: String, password: String, val role: Role.Type, val name: String, val surname: String, val active: Option[String])
//case class UserInfo(val id: Long, val username:String, val email:String, val role: Role.Type)

object User extends MProjectLogger {
  import anorm._
  import anorm.SqlParser._

  val user = {
    get[Long]("id") ~
      get[String]("username") ~
      get[String]("password") ~
      get[Option[String]]("role") ~
      get[String]("name") ~
      get[String]("surname") ~
      get[Option[String]]("active") map {
        case id ~ username ~ password ~ role ~ name ~ surname ~ active => User(id, username, password,
          Role.withName(role.getOrElse(Role.NoRole.toString())), name, surname, active)
      }
  }
  import play.api.db._

  import play.api.Play.current
  def getUser(id: Long): User = DB.withConnection { implicit c =>
    SQL("select * from user where id = " + id).single(user)
  }
  
  def create(email: String, password: String, name: String, surname: String) = {
    val activation = generateActivation()
    mLog(activation)
    DB.withConnection { implicit c =>
      {
        SQL("insert into user (username, password, role, name, surname, active) values " +
        		"({username}, {password}, {role}, {name}, {surname}, {active})")
          .on('username -> email, 'password -> password, 'role -> Role.NoRole.toString(), 'name -> name, 'surname -> surname, 'active -> activation)
          .executeInsert()
      }
    }
    val baseurl = Play.application.configuration.getString("application.baseurl")
    Mail.create(email, "diego.naali@gmail.com", "Creazione utente", "Utente creato. Accedere al seguente link per l'attivazione: " + baseurl + "\\" + activation)
  }

  private def generateActivation(): String = {
    Random.alphanumeric take 15 mkString ""
  }
  def delete(id: Long) {}
  def all(): List[User] = DB.withConnection { implicit c =>
    SQL("select * from user").as(user *)
  }

  //  def getUserInfo(u: User): UserInfo = {
  //    u match {
  //      case null => null
  //      case user => UserInfo(user.id, user.username, user.email, user.role)
  //    }
  //  }

  /**
   * Authenticate a User.
   */
  def authenticate(email: String, password: String): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
         select * from user where
         username = {username} and password = {password}
         -- and active is null
        """).on(
          'username -> email,
          'password -> password).as(User.user.singleOpt)
    }
  }
  /**
   * Retrieve a User from email.
   */
  def findByEmail(email: String): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL("select * from user where username = {email}").on(
        'email -> email).as(User.user.singleOpt)
    }
  }

  def find(id: Long): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL("select * from user where id = {id}").on(
        'id -> id).as(User.user.singleOpt)
    }
  }
}

object Role extends Enumeration {
  type Type = Value
  val Admin, User, NoRole = Value
}