package util

import models.Role
import play.api.mvc.Request
import models.User

/**
 * 
 * User: Diego Fabbro
 * Date: 08/01/13
 * Time: 12.10
 *
 */

object UserHelper extends MProjectLogger {
	def getUserRoleFromSession(request: Request[play.api.mvc.AnyContent]) : Option[Role.Type] = {
			SessionManager.getUserSession(request.session) match {
				case None => Option.apply(Role.NoRole)
				case o: Option[Object] => {
					o.getOrElse(Defines.DEFAULT_USER_ID) match {
						case u: User => {
						  Option.apply(u.role)
						}
						case default => Option.apply(Role.NoRole)
					}
				}
			case default => Option.apply(Role.NoRole)
			}
	}
	
	def getUserID(request: Request[play.api.mvc.AnyContent]) : Option[String] = {
		request.session.get(Defines.SESSION_USER_ID)
	}
  
}