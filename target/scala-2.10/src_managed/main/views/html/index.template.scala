
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,play.api.mvc.Request[play.api.mvc.AnyContent],play.api.mvc.Session,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String)(implicit request: play.api.mvc.Request[play.api.mvc.AnyContent], session: play.api.mvc.Session, flash: Flash):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.129*/("""

"""),_display_(Seq[Any](/*3.2*/news(Post.list(),0,"",request))),format.raw/*3.32*/("""
//"""),_display_(Seq[Any](/*4.4*/main("News - Libreria Parole Nuove")/*4.40*/ {_display_(Seq[Any](format.raw/*4.42*/("""
    
    
    
//""")))})))}
    }
    
    def render(message:String,request:play.api.mvc.Request[play.api.mvc.AnyContent],session:play.api.mvc.Session,flash:Flash): play.api.templates.Html = apply(message)(request,session,flash)
    
    def f:((String) => (play.api.mvc.Request[play.api.mvc.AnyContent],play.api.mvc.Session,Flash) => play.api.templates.Html) = (message) => (request,session,flash) => apply(message)(request,session,flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:09 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/index.scala.html
                    HASH: d899ba0ea93f2acc2864582b41d0708843f9cfb7
                    MATRIX: 578->1|783->128|822->133|873->163|912->168|956->204|995->206
                    LINES: 19->1|22->1|24->3|24->3|25->4|25->4|25->4
                    -- GENERATED --
                */
            