// @SOURCE:/home/diego/play_projects/mproject/conf/routes
// @HASH:32557c797f22000a005c648c6ef33b1578b3f3e7
// @DATE:Sat Mar 22 17:03:09 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_noContent1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("noContent"))))
        

// @LINE:8
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Application_registration3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration"))))
        

// @LINE:10
private[this] lazy val controllers_Application_registrationSubmit4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration"))))
        

// @LINE:11
private[this] lazy val controllers_Application_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Application_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:13
private[this] lazy val controllers_Application_redirect7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("redirect"))))
        

// @LINE:14
private[this] lazy val controllers_Application_news8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("news"))))
        

// @LINE:15
private[this] lazy val controllers_Application_search9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:16
private[this] lazy val controllers_Application_consigli10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("consigli"))))
        

// @LINE:17
private[this] lazy val controllers_Application_chisiamo11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chisiamo"))))
        

// @LINE:20
private[this] lazy val controllers_Admin_admin12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:21
private[this] lazy val controllers_Admin_posts13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/posts"))))
        

// @LINE:22
private[this] lazy val controllers_Admin_editColors14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/colors"))))
        

// @LINE:23
private[this] lazy val controllers_Admin_pages15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/pages"))))
        

// @LINE:24
private[this] lazy val controllers_Admin_mails16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/mails"))))
        

// @LINE:27
private[this] lazy val controllers_Admin_newPost17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/post/newPost"))))
        

// @LINE:28
private[this] lazy val controllers_Admin_insertPost18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/post/newPost"))))
        

// @LINE:29
private[this] lazy val controllers_Admin_editPost19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/post/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:30
private[this] lazy val controllers_Admin_updatePost20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/post/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:31
private[this] lazy val controllers_Admin_deletePost21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/post/delete/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:32
private[this] lazy val controllers_Admin_deletePost22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin/post/delete/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:35
private[this] lazy val controllers_Assets_at23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        

// @LINE:39
private[this] lazy val controllers_Assets_at24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """noContent""","""controllers.Application.noContent"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration""","""controllers.Application.registration"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration""","""controllers.Application.registrationSubmit"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """redirect""","""controllers.Application.redirect(uri:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """news""","""controllers.Application.news(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.Application.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """consigli""","""controllers.Application.consigli"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chisiamo""","""controllers.Application.chisiamo"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Admin.admin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/posts""","""controllers.Admin.posts"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/colors""","""controllers.Admin.editColors"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/pages""","""controllers.Admin.pages"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/mails""","""controllers.Admin.mails"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/post/newPost""","""controllers.Admin.newPost(backUrl:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/post/newPost""","""controllers.Admin.insertPost(redirectUrl:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/post/$id<[^/]+>""","""controllers.Admin.editPost(id:Long, backUrl:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/post/$id<[^/]+>""","""controllers.Admin.updatePost(id:Long, redirectUrl:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/post/delete/$id<[^/]+>""","""controllers.Admin.deletePost(id:Long, uri:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin/post/delete/$id<[^/]+>""","""controllers.Admin.deletePost(id:Long, uri:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_noContent1(params) => {
   call { 
        invokeHandler(controllers.Application.noContent, HandlerDef(this, "controllers.Application", "noContent", Nil,"GET", """""", Routes.prefix + """noContent"""))
   }
}
        

// @LINE:8
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Application_registration3(params) => {
   call { 
        invokeHandler(controllers.Application.registration, HandlerDef(this, "controllers.Application", "registration", Nil,"GET", """""", Routes.prefix + """registration"""))
   }
}
        

// @LINE:10
case controllers_Application_registrationSubmit4(params) => {
   call { 
        invokeHandler(controllers.Application.registrationSubmit, HandlerDef(this, "controllers.Application", "registrationSubmit", Nil,"POST", """""", Routes.prefix + """registration"""))
   }
}
        

// @LINE:11
case controllers_Application_authenticate5(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate, HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Application_logout6(params) => {
   call { 
        invokeHandler(controllers.Application.logout, HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:13
case controllers_Application_redirect7(params) => {
   call(params.fromQuery[String]("uri", None)) { (uri) =>
        invokeHandler(controllers.Application.redirect(uri), HandlerDef(this, "controllers.Application", "redirect", Seq(classOf[String]),"POST", """""", Routes.prefix + """redirect"""))
   }
}
        

// @LINE:14
case controllers_Application_news8(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        invokeHandler(controllers.Application.news(p, s, f), HandlerDef(this, "controllers.Application", "news", Seq(classOf[Int], classOf[Int], classOf[String]),"GET", """""", Routes.prefix + """news"""))
   }
}
        

// @LINE:15
case controllers_Application_search9(params) => {
   call { 
        invokeHandler(controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Nil,"POST", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:16
case controllers_Application_consigli10(params) => {
   call { 
        invokeHandler(controllers.Application.consigli, HandlerDef(this, "controllers.Application", "consigli", Nil,"GET", """""", Routes.prefix + """consigli"""))
   }
}
        

// @LINE:17
case controllers_Application_chisiamo11(params) => {
   call { 
        invokeHandler(controllers.Application.chisiamo, HandlerDef(this, "controllers.Application", "chisiamo", Nil,"GET", """""", Routes.prefix + """chisiamo"""))
   }
}
        

// @LINE:20
case controllers_Admin_admin12(params) => {
   call { 
        invokeHandler(controllers.Admin.admin, HandlerDef(this, "controllers.Admin", "admin", Nil,"GET", """ Admin""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:21
case controllers_Admin_posts13(params) => {
   call { 
        invokeHandler(controllers.Admin.posts, HandlerDef(this, "controllers.Admin", "posts", Nil,"GET", """""", Routes.prefix + """admin/posts"""))
   }
}
        

// @LINE:22
case controllers_Admin_editColors14(params) => {
   call { 
        invokeHandler(controllers.Admin.editColors, HandlerDef(this, "controllers.Admin", "editColors", Nil,"GET", """""", Routes.prefix + """admin/colors"""))
   }
}
        

// @LINE:23
case controllers_Admin_pages15(params) => {
   call { 
        invokeHandler(controllers.Admin.pages, HandlerDef(this, "controllers.Admin", "pages", Nil,"GET", """""", Routes.prefix + """admin/pages"""))
   }
}
        

// @LINE:24
case controllers_Admin_mails16(params) => {
   call { 
        invokeHandler(controllers.Admin.mails, HandlerDef(this, "controllers.Admin", "mails", Nil,"GET", """""", Routes.prefix + """admin/mails"""))
   }
}
        

// @LINE:27
case controllers_Admin_newPost17(params) => {
   call(params.fromQuery[String]("backUrl", None)) { (backUrl) =>
        invokeHandler(controllers.Admin.newPost(backUrl), HandlerDef(this, "controllers.Admin", "newPost", Seq(classOf[String]),"GET", """ Admin - Post""", Routes.prefix + """admin/post/newPost"""))
   }
}
        

// @LINE:28
case controllers_Admin_insertPost18(params) => {
   call(params.fromQuery[String]("redirectUrl", None)) { (redirectUrl) =>
        invokeHandler(controllers.Admin.insertPost(redirectUrl), HandlerDef(this, "controllers.Admin", "insertPost", Seq(classOf[String]),"POST", """""", Routes.prefix + """admin/post/newPost"""))
   }
}
        

// @LINE:29
case controllers_Admin_editPost19(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("backUrl", None)) { (id, backUrl) =>
        invokeHandler(controllers.Admin.editPost(id, backUrl), HandlerDef(this, "controllers.Admin", "editPost", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """admin/post/$id<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_Admin_updatePost20(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("redirectUrl", None)) { (id, redirectUrl) =>
        invokeHandler(controllers.Admin.updatePost(id, redirectUrl), HandlerDef(this, "controllers.Admin", "updatePost", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """admin/post/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_Admin_deletePost21(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("uri", None)) { (id, uri) =>
        invokeHandler(controllers.Admin.deletePost(id, uri), HandlerDef(this, "controllers.Admin", "deletePost", Seq(classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """admin/post/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Admin_deletePost22(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("uri", None)) { (id, uri) =>
        invokeHandler(controllers.Admin.deletePost(id, uri), HandlerDef(this, "controllers.Admin", "deletePost", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """admin/post/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_Assets_at23(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:39
case controllers_Assets_at24(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /public path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        