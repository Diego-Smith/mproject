package util

import play.api.mvc.Session
import play.mvc.Http
import scala.collection.mutable.Map
import models.User
import models.PageVisited
import play.api.mvc.Request

object SessionManager extends MProjectLogger {
  var map = Map[String, Object]()


  private def addSession(key: String, value: Object) = {
    key match {
      case null => {null}
      case a => {
        val session = Http.Context.current().session()
        map.put(key, value)
      }
    }
  }

  def logWebPage(webPage: String, request: Request[play.api.mvc.AnyContent]) {
    val idUser = SessionManager.getUserSession(request.session) match {
      case None => Defines.DEFAULT_USER_ID
      case o: Option[Object] => {
        o.getOrElse(Defines.DEFAULT_USER_ID) match {
          case u: User => u.id
          case default => Defines.DEFAULT_USER_ID
        }
      }
      case default => Defines.DEFAULT_USER_ID
    }
    PageVisited.create(webPage, request.remoteAddress, idUser)
  }

  def addUserSession(id: Long, user: User) = {
    map.put(getUserKey(id), user)
  }

  private def getUserKey(idUser: String): String = {
    Defines.SESSION_USER_KEY + idUser
  }
  private def getUserKey(idUser: Long): String = {
    getUserKey(idUser.toString)
  }

  def getUserSession(session: Session): Option[Object] = {
    val idUser = session.get(Defines.SESSION_USER_ID).getOrElse(Defines.DEFAULT_USER_ID.toString)
//    mLog("iduser:" + idUser + "\nmap:" + map.toString + "\nsession:" + session + "\n")
    get(getUserKey(idUser)) match {
      case None => {
        if ("0".equals(idUser)) {
          null
        } else {
          map.put(getUserKey(idUser), User.find(idUser.toLong).getOrElse(null))
          getUserSession(session)
        }
      }
      case default => default
    }
  }

  private def get(key: String): Option[Object] = {
    map.get(key)
  }
}

