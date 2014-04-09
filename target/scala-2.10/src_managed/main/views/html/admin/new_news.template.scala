
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
object new_news extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Post],String,Flash,play.api.mvc.Session,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(formPost: Form[Post], backUrl: String)(implicit flash: Flash, session: play.api.mvc.Session):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.95*/("""
"""),_display_(Seq[Any](/*3.2*/admin/*3.7*/ {_display_(Seq[Any](format.raw/*3.9*/("""

   <h1 class="title-section">Nuova notizia</h1>
				"""),_display_(Seq[Any](/*6.6*/form(routes.Admin.insertPost(backUrl))/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
        <fieldset>
            """),_display_(Seq[Any](/*8.14*/inputText(formPost("title"), '_label -> "Titolo(*)"))),format.raw/*8.66*/("""
            """),_display_(Seq[Any](/*9.14*/textarea(formPost("content"), '_label -> "Contenuto(*)"))),format.raw/*9.70*/("""
        </fieldset>
        <div class="actions">
            <input type="submit" value="Salva" class="button-link">
						""")))})),format.raw/*13.8*/("""
						"""),_display_(Seq[Any](/*14.8*/form(routes.Application.redirect(backUrl))/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
        		<input type="submit" value="Annulla" class="button-link">
    				""")))})),format.raw/*16.10*/("""
        </div>
         <p>(*)Obbligatori</p>
        
""")))})))}
    }
    
    def render(formPost:Form[Post],backUrl:String,flash:Flash,session:play.api.mvc.Session): play.api.templates.Html = apply(formPost,backUrl)(flash,session)
    
    def f:((Form[Post],String) => (Flash,play.api.mvc.Session) => play.api.templates.Html) = (formPost,backUrl) => (flash,session) => apply(formPost,backUrl)(flash,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/admin/new_news.scala.html
                    HASH: 37e7d219c97c06fe0c6e8e8cf40dca372d0016e0
                    MATRIX: 552->1|739->94|776->115|788->120|826->122|918->180|964->218|1003->220|1073->255|1146->307|1196->322|1273->378|1434->508|1478->517|1529->559|1569->561|1681->641
                    LINES: 19->1|23->1|24->3|24->3|24->3|27->6|27->6|27->6|29->8|29->8|30->9|30->9|34->13|35->14|35->14|35->14|37->16
                    -- GENERATED --
                */
            