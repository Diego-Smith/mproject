
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
object edit_news extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Long,Form[Post],String,play.api.mvc.Session,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, formPost: Form[Post], backUrl: String)(implicit session: play.api.mvc.Session, flash: Flash):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.105*/("""
"""),format.raw/*3.1*/("""				<script type="text/javascript" src=""""),_display_(Seq[Any](/*3.42*/routes/*3.48*/.Assets.at("javascripts/main.js"))),format.raw/*3.81*/("""" > </script>
"""),_display_(Seq[Any](/*4.2*/admin/*4.7*/ {_display_(Seq[Any](format.raw/*4.9*/("""

		"""),_display_(Seq[Any](/*6.4*/form(routes.Admin.updatePost(id, backUrl))/*6.46*/ {_display_(Seq[Any](format.raw/*6.48*/("""
        <h1 class="title-section">Modifica notizia</h1>
        <fieldset>
            """),_display_(Seq[Any](/*9.14*/inputText(formPost("title"), '_label -> "Titolo(*)"))),format.raw/*9.66*/("""
            """),_display_(Seq[Any](/*10.14*/textarea(formPost("content"), '_label -> "Contenuto(*)"))),format.raw/*10.70*/("""
            """),_display_(Seq[Any](/*11.14*/inputText(formPost("dateCreation"), '_label -> "Data(yyyy-mm-dd *)"))),format.raw/*11.82*/("""
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Salva" class="button-link inline"> 
						""")))})),format.raw/*16.8*/("""
						"""),_display_(Seq[Any](/*17.8*/form(routes.Admin.deletePost(id, backUrl))/*17.50*/ {_display_(Seq[Any](format.raw/*17.52*/("""
        		<input type="submit" value="Elimina" class="button-link danger inline">
    				""")))})),format.raw/*19.10*/("""
						"""),_display_(Seq[Any](/*20.8*/form(routes.Application.redirect(backUrl))/*20.50*/ {_display_(Seq[Any](format.raw/*20.52*/("""
        		<input type="submit" value="Annulla" class="button-link">
    				""")))})),format.raw/*22.10*/("""
        </div>
        <p>(*)Obbligatori</p>
""")))})))}
    }
    
    def render(id:Long,formPost:Form[Post],backUrl:String,session:play.api.mvc.Session,flash:Flash): play.api.templates.Html = apply(id,formPost,backUrl)(session,flash)
    
    def f:((Long,Form[Post],String) => (play.api.mvc.Session,Flash) => play.api.templates.Html) = (id,formPost,backUrl) => (session,flash) => apply(id,formPost,backUrl)(session,flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/admin/edit_news.scala.html
                    HASH: 6e4757286051cd1187ba2979f2451266c1156dcc
                    MATRIX: 558->1|756->104|784->124|860->165|874->171|928->204|978->220|990->225|1028->227|1069->234|1119->276|1158->278|1285->370|1358->422|1409->437|1487->493|1538->508|1628->576|1807->724|1851->733|1902->775|1942->777|2068->871|2112->880|2163->922|2203->924|2315->1004
                    LINES: 19->1|23->1|24->3|24->3|24->3|24->3|25->4|25->4|25->4|27->6|27->6|27->6|30->9|30->9|31->10|31->10|32->11|32->11|37->16|38->17|38->17|38->17|40->19|41->20|41->20|41->20|43->22
                    -- GENERATED --
                */
            