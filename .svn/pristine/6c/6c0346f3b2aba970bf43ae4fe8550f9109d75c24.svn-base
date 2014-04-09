package util

import controllers.routes
import scala.Predef.String
import play.api.mvc._
import models.User

/**
 * Provide security features
 * User: Diego Fabbro
 * Date: 08/01/13
 * Time: 15.57
 *
 */
trait Secured {

  /**
   * Retrieve the connected user email.
   */
  def username(request: RequestHeader) = request.session.get("email")

  /**
   * Redirect to login if the user in not authorized.
   */
  def onUnauthorized(request: RequestHeader) = Results.Redirect(routes.Application.login)

  // --

  /**
   * Action for authenticated users.
   */
  def IsAuth(f: String => Request[AnyContent] => Result) = Security.Authenticated(username, onUnauthorized) { user =>
    Action(request => f(user)(request))
  }
  
  def IsAuthenticated(r: Request[AnyContent] => Result) = IsAuth(username => r)
  
  
  /**
   * metodo alternativo
   * TODO: c'è da impostare la default page
   */
  def IsAuthenticated2(r: Request[AnyContent] => Result) = Security.Authenticated(username => Action(r(_)))
  /**
   * Check if the connected user is a member of this project.
   */
  //  def IsMemberOf(project: Long)(f: => String => Request[AnyContent] => Result) = IsAuthenticated { user => request =>
  //    if(Project.isMember(project, user)) {
  //      f(user)(request)
  //    } else {
  //      Results.Forbidden
  //    }
  //  }

  /**
   * Check if the connected user is a owner of this task.
   */
  //  def IsOwnerOf(task: Long)(f: => String => Request[AnyContent] => Result) = IsAuthenticated { user => request =>
  //    if(Task.isOwner(task, user)) {
  //      f(user)(request)
  //    } else {
  //      Results.Forbidden
  //    }
  //  }

}
