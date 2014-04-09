// @SOURCE:/home/diego/play_projects/mproject/conf/routes
// @HASH:32557c797f22000a005c648c6ef33b1578b3f3e7
// @DATE:Sat Mar 22 17:03:09 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:39
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAdmin {
    

// @LINE:22
def editColors(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/colors")
}
                                                

// @LINE:20
def admin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                

// @LINE:24
def mails(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/mails")
}
                                                

// @LINE:27
def newPost(backUrl:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/post/newPost" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("backUrl", backUrl)))))
}
                                                

// @LINE:29
def editPost(id:Long, backUrl:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/post/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("backUrl", backUrl)))))
}
                                                

// @LINE:30
def updatePost(id:Long, redirectUrl:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/post/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("redirectUrl", redirectUrl)))))
}
                                                

// @LINE:21
def posts(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/posts")
}
                                                

// @LINE:23
def pages(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin/pages")
}
                                                

// @LINE:28
def insertPost(redirectUrl:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "admin/post/newPost" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("redirectUrl", redirectUrl)))))
}
                                                

// @LINE:32
// @LINE:31
def deletePost(id:Long, uri:String): Call = {
   (id: @unchecked, uri: @unchecked) match {
// @LINE:31
case (id, uri) if true => Call("POST", _prefix + { _defaultPrefix } + "admin/post/delete/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("uri", uri)))))
                                                        
// @LINE:32
case (id, uri) if true => Call("GET", _prefix + { _defaultPrefix } + "admin/post/delete/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("uri", uri)))))
                                                        
   }
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def consigli(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "consigli")
}
                                                

// @LINE:8
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def registration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registration")
}
                                                

// @LINE:12
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:17
def chisiamo(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chisiamo")
}
                                                

// @LINE:13
def redirect(uri:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "redirect" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("uri", uri)))))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:15
def search(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                                                

// @LINE:10
def registrationSubmit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registration")
}
                                                

// @LINE:14
def news(p:Int = 0, s:Int = 2, f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "news" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:11
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def noContent(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "noContent")
}
                                                
    
}
                          

// @LINE:39
// @LINE:35
class ReverseAssets {
    

// @LINE:39
// @LINE:35
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:35
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
// @LINE:39
case (file) if true => Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAdmin {
    

// @LINE:22
def editColors : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.editColors",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/colors"})
      }
   """
)
                        

// @LINE:20
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:24
def mails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.mails",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/mails"})
      }
   """
)
                        

// @LINE:27
def newPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.newPost",
   """
      function(backUrl) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/post/newPost" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("backUrl", backUrl)])})
      }
   """
)
                        

// @LINE:29
def editPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.editPost",
   """
      function(id,backUrl) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/post/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("backUrl", backUrl)])})
      }
   """
)
                        

// @LINE:30
def updatePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.updatePost",
   """
      function(id,redirectUrl) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/post/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("redirectUrl", redirectUrl)])})
      }
   """
)
                        

// @LINE:21
def posts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.posts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/posts"})
      }
   """
)
                        

// @LINE:23
def pages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.pages",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/pages"})
      }
   """
)
                        

// @LINE:28
def insertPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.insertPost",
   """
      function(redirectUrl) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/post/newPost" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("redirectUrl", redirectUrl)])})
      }
   """
)
                        

// @LINE:32
// @LINE:31
def deletePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.deletePost",
   """
      function(id, uri) {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/post/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uri", uri)])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/post/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uri", uri)])})
      }
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def consigli : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.consigli",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "consigli"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def registration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
      }
   """
)
                        

// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:17
def chisiamo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chisiamo",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chisiamo"})
      }
   """
)
                        

// @LINE:13
def redirect : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.redirect",
   """
      function(uri) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "redirect" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uri", uri)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:15
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        

// @LINE:10
def registrationSubmit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registrationSubmit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
      }
   """
)
                        

// @LINE:14
def news : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.news",
   """
      function(p,s,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news" + _qS([(p == null ? """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? """ +  implicitly[JavascriptLitteral[Int]].to(2) + """ : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? """ +  implicitly[JavascriptLitteral[String]].to("") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:11
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def noContent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.noContent",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noContent"})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:35
class ReverseAssets {
    

// @LINE:39
// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseAdmin {
    

// @LINE:22
def editColors(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.editColors(), HandlerDef(this, "controllers.Admin", "editColors", Seq(), "GET", """""", _prefix + """admin/colors""")
)
                      

// @LINE:20
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.admin(), HandlerDef(this, "controllers.Admin", "admin", Seq(), "GET", """ Admin""", _prefix + """admin""")
)
                      

// @LINE:24
def mails(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.mails(), HandlerDef(this, "controllers.Admin", "mails", Seq(), "GET", """""", _prefix + """admin/mails""")
)
                      

// @LINE:27
def newPost(backUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.newPost(backUrl), HandlerDef(this, "controllers.Admin", "newPost", Seq(classOf[String]), "GET", """ Admin - Post""", _prefix + """admin/post/newPost""")
)
                      

// @LINE:29
def editPost(id:Long, backUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.editPost(id, backUrl), HandlerDef(this, "controllers.Admin", "editPost", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """admin/post/$id<[^/]+>""")
)
                      

// @LINE:30
def updatePost(id:Long, redirectUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.updatePost(id, redirectUrl), HandlerDef(this, "controllers.Admin", "updatePost", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """admin/post/$id<[^/]+>""")
)
                      

// @LINE:21
def posts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.posts(), HandlerDef(this, "controllers.Admin", "posts", Seq(), "GET", """""", _prefix + """admin/posts""")
)
                      

// @LINE:23
def pages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.pages(), HandlerDef(this, "controllers.Admin", "pages", Seq(), "GET", """""", _prefix + """admin/pages""")
)
                      

// @LINE:28
def insertPost(redirectUrl:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.insertPost(redirectUrl), HandlerDef(this, "controllers.Admin", "insertPost", Seq(classOf[String]), "POST", """""", _prefix + """admin/post/newPost""")
)
                      

// @LINE:31
def deletePost(id:Long, uri:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.deletePost(id, uri), HandlerDef(this, "controllers.Admin", "deletePost", Seq(classOf[Long], classOf[String]), "POST", """""", _prefix + """admin/post/delete/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def consigli(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.consigli(), HandlerDef(this, "controllers.Application", "consigli", Seq(), "GET", """""", _prefix + """consigli""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:9
def registration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registration(), HandlerDef(this, "controllers.Application", "registration", Seq(), "GET", """""", _prefix + """registration""")
)
                      

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:17
def chisiamo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chisiamo(), HandlerDef(this, "controllers.Application", "chisiamo", Seq(), "GET", """""", _prefix + """chisiamo""")
)
                      

// @LINE:13
def redirect(uri:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.redirect(uri), HandlerDef(this, "controllers.Application", "redirect", Seq(classOf[String]), "POST", """""", _prefix + """redirect""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:15
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.search(), HandlerDef(this, "controllers.Application", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      

// @LINE:10
def registrationSubmit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registrationSubmit(), HandlerDef(this, "controllers.Application", "registrationSubmit", Seq(), "POST", """""", _prefix + """registration""")
)
                      

// @LINE:14
def news(p:Int, s:Int, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.news(p, s, f), HandlerDef(this, "controllers.Application", "news", Seq(classOf[Int], classOf[Int], classOf[String]), "GET", """""", _prefix + """news""")
)
                      

// @LINE:11
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def noContent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.noContent(), HandlerDef(this, "controllers.Application", "noContent", Seq(), "GET", """""", _prefix + """noContent""")
)
                      
    
}
                          

// @LINE:39
// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      