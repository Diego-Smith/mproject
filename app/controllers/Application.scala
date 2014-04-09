package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.User
import views.html
import util.Secured
import models.PageVisited
import play.core.Execution
import util.SessionManager
import util.Defines
import util.MProjectLogger
import util.MailUtil
import models.Mail
import models.Post
import models.Consigli
object Application extends Controller with MProjectLogger with Secured {

  val loginForm = Form(
    tuple(
      "email" -> text,
      "password" -> text) verifying ("Mail o password non valida", result => result match {
        case (email, password) => User.authenticate(email, password).isDefined
      }))

  val searchForm = Form(
    tuple(
      "text" -> text,
      "fitt" -> optional(text)))

  val registrazioneForm = Form(
    tuple(
      "nome" -> text,
      "cognome" -> text,
      "email" -> text,
      "password" -> text) verifying ("Mail gia' usata", _ match {
        case (nome, cognome, email, password) => {
          User.findByEmail(email).map(_ => false).getOrElse(true)
        }
      }) 
      
//      verifying("Utente nuovo", _ match {
//         case (nome, cognome, email, password) => {
//          User.findByEmail(email).map(_ => true).getOrElse(false)
//        }})
      
  )

  def consigli = Action { implicit request =>
    Ok(html.consigli(Consigli.listFirstTen))
  }
  
  def chisiamo = TODO
  
  def login = Action { implicit request =>
    Ok(html.login(loginForm))
  }

  def noContent = Action {
    //prova copia
    Unauthorized
  }

  def index = Action {
    implicit request =>
      {
        SessionManager.logWebPage(Defines.WEB_PAGE_DASHBOARD, request)

        //        mLog(  MailUtil.sendEmail("test", "test", "test", "test").toString)
        Ok(html.index("Dashboard"))
      }
  }

  def registration = Action {
    implicit request =>
      {
        SessionManager.logWebPage(Defines.WEB_PAGE_DASHBOARD, request)
        Ok(html.registration(registrazioneForm))
      }
  }

  def registrationSubmit = Action {
    implicit request =>
      {
        registrazioneForm.bindFromRequest.fold(
          formWithErrors => BadRequest(html.registration(formWithErrors)),
          form => {
            User.create(form._3, form._4, form._1, form._2)
            Redirect(routes.Application.registration).flashing("success" -> "Utente creato con successo")
          })
      }
  }
  /**
   * Handle login form submission.
   */
  def authenticate = Action {
    implicit request =>
      loginForm.bindFromRequest.fold(
        formWithErrors => BadRequest(html.login(formWithErrors)),
        user => redirectAndSetUser(user))
  }

  def redirectAndSetUser(user: (String, String)) = {
    val u = User.findByEmail(user._1)
    SessionManager.addUserSession(u.map(_.id).getOrElse(0), u.getOrElse(null))
    Redirect(routes.Application.index).withSession("email" -> user._1, Defines.SESSION_USER_ID -> u.map(_.id.toString).getOrElse("0"))
  }

  /**
   * Logout and clean the session.
   */
  def logout = Action {
    Redirect(routes.Application.login).withNewSession.flashing(
      "success" -> "You've been logged out")
  }

  def search() = Action { implicit request =>
    val anyData = Map("text" -> "test", "fitt" -> "secret")
    val (text, fitt) = searchForm.bindFromRequest.get
    Redirect(routes.Application.news(0, 2, text))
  }

  def news(page: Int, orderBy: Int, filter: String) = Action { implicit request =>
    SessionManager.logWebPage(Defines.WEB_PAGE_NEWS_LIST, request)
    Ok(html.news(
      Post.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%")),
      orderBy, filter, request))
  }
  
  def redirect(uri: String) = Action { implicit request =>
    mLog(uri) 
    Redirect(uri)
  }

}