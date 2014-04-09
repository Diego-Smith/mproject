package controllers
import play.api._
import views.html
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import util.Secured
import models.User
import models.Post
import anorm.Pk
import anorm.NotAssigned
import models.PageVisited
import util.SessionManager
import util.Defines
import util.MProjectLogger
import models.Mail
import util.UserHelper
import play.i18n.Messages

object Admin extends Controller with Secured with MProjectLogger {

  val Home = Redirect(routes.Admin.posts)

  val admin = posts

  def posts = {

    IsAuth { username =>
      implicit request => User.findByEmail(username).map { user =>
        SessionManager.logWebPage(Defines.WEB_PAGE_ADMIN_NEWS, request)
        Ok(views.html.admin.news(Post.posts()))
      }.getOrElse(Forbidden)
    }
  }

  def pages = {
    IsAuth { username =>
      implicit request => User.findByEmail(username).map { user =>
        Ok(views.html.admin.page_visited(PageVisited.all))
        //	    	    .news(Post.posts()))

      }.getOrElse(Forbidden)
    }
  }

  def mails = IsAuthenticated { implicit request =>
    mLog(Mail.list.toString)
    Ok(html.index("Mails"))
  }

  val editColors = TODO
  //	{
  //		IsAuthenticated { username => implicit request => User.findByEmail(username).map { user =>
  //	    	Ok(views.html.admin.edit_colors("test"))
  //	    	}.getOrElse(Forbidden)
  //		}

  //	}

  val newsForm = Form(
    mapping(
      "id" -> ignored(NotAssigned: Pk[Long]),
//      "dateCreation" -> date("yyyy-MM-dd").verifying("Bad phone number", _ => false),
      "dateCreation" -> date("yyyy-MM-dd"),
      "fkUser" -> ignored(NotAssigned: Pk[Long]),
      "content" -> nonEmptyText(0, 10000),
      "title" -> nonEmptyText(0, 200))(Post.apply)(Post.unapply))

  val newsCreateForm = Form(
    mapping(
      "id" -> ignored(NotAssigned: Pk[Long]),
      "dateCreation" -> ignored(new java.util.Date),
      "fkUser" -> ignored(NotAssigned: Pk[Long]),
      "content" -> nonEmptyText(0, 10000),
      "title" -> nonEmptyText(0, 200))(Post.apply)(Post.unapply))

  def editPost(id: Long, backUrl: String) = IsAuthenticated { implicit request =>
    {
      Post.findById(id).map { post =>
        Ok(views.html.admin.edit_news(id, newsForm.fill(post), backUrl))
      }.getOrElse(NotFound)
    }
  }

  def updatePost(id: Long, redirectUrl: String) = IsAuthenticated { implicit request =>
    newsForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.admin.edit_news(id, formWithErrors, redirectUrl)),
      post => {
        Post.update(id, post)
        Redirect(redirectUrl).flashing("success" -> "La notizia e' stata modificata")
      })
  }

  def newPost(backUrl: String) = {
    IsAuthenticated(implicit request => {
      mLog(s"newPost back link ${backUrl}")
      Ok(views.html.admin.new_news(newsForm, backUrl))
    })
  }

  def insertPost(redirectUrl: String) = IsAuthenticated { implicit request =>
    newsCreateForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.admin.new_news(formWithErrors, redirectUrl)),
      post => {
        Post.createPost(post.content, post.title, UserHelper.getUserID(request).map(a => a.toLong).getOrElse(0))
        Redirect(cleanPage(redirectUrl)).flashing("success" -> "La notizia e' stata inserita")
      })
  }
  
  private def cleanPage(url: String) = url.replaceAll("p=[0-9]", "")
  
  def deletePost(id: Long, uri: String) = {
    IsAuthenticated {
      implicit request =>
        Post.delete(id)
        uri match {
          case null | "" => Redirect("/news").flashing("success" -> "La notizia e' stata cancellata")
          case validUrl => Redirect(validUrl).flashing("success" -> "La notizia e' stata cancellata")
        }
    }

  }

}