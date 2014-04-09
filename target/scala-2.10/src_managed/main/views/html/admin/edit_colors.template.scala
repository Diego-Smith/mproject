
package views.html.admin

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
object edit_colors extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,play.api.mvc.Session,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(test: String)(implicit session: play.api.mvc.Session, flash: Flash):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/admin/*4.7*/ {_display_(Seq[Any](format.raw/*4.9*/("""

   <h1>Edit news</h1>
    <button onClick="layout.modifyVars("""),format.raw/*7.40*/("""{"""),format.raw/*7.41*/("""'baseColor': '#5B83AD'"""),format.raw/*7.63*/("""}"""),format.raw/*7.64*/(""");">Click me</button>
    <button class="provaButton">Click me yes</button>
""")))})))}
    }
    
    def render(test:String,session:play.api.mvc.Session,flash:Flash): play.api.templates.Html = apply(test)(session,flash)
    
    def f:((String) => (play.api.mvc.Session,Flash) => play.api.templates.Html) = (test) => (session,flash) => apply(test)(session,flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/admin/edit_colors.scala.html
                    HASH: da6cf10844406a5aacf67c67c7d66c59f4353fb0
                    MATRIX: 544->1|706->69|734->89|771->92|783->97|821->99|914->165|942->166|991->188|1019->189
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|28->7|28->7|28->7|28->7
                    -- GENERATED --
                */
            