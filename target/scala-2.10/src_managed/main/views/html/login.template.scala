
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[scala.Tuple2[String, String]],Flash,play.api.mvc.Session,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash, session: play.api.mvc.Session):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.85*/("""

"""),_display_(Seq[Any](/*3.2*/main("Login - Libreria Parole Nuove")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

    <h1 class="title-section">Autenticazione</h1>
 
    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(routes.Application.authenticate)/*7.50*/ {_display_(Seq[Any](format.raw/*7.52*/("""



        """),_display_(Seq[Any](/*11.10*/form/*11.14*/.globalError.map/*11.30*/ { error =>_display_(Seq[Any](format.raw/*11.41*/("""
        <p class="error">
            """),_display_(Seq[Any](/*13.14*/error/*13.19*/.message)),format.raw/*13.27*/("""
        </p>
        """)))})),format.raw/*15.10*/("""

        """),_display_(Seq[Any](/*17.10*/flash/*17.15*/.get("success").map/*17.34*/ { message =>_display_(Seq[Any](format.raw/*17.47*/("""
        <p class="success">
            """),_display_(Seq[Any](/*19.14*/message)),format.raw/*19.21*/("""
        </p>
        """)))})),format.raw/*21.10*/("""

				<input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(Seq[Any](/*23.77*/form("email")/*23.90*/.value)),format.raw/*23.96*/("""">
        <input type="password" name="password" id="password" placeholder="Password">
        <button type="submit" id="loginbutton" class="button-link">Entra</button>

    """)))})),format.raw/*27.6*/("""

""")))})))}
    }
    
    def render(form:Form[scala.Tuple2[String, String]],flash:Flash,session:play.api.mvc.Session): play.api.templates.Html = apply(form)(flash,session)
    
    def f:((Form[scala.Tuple2[String, String]]) => (Flash,play.api.mvc.Session) => play.api.templates.Html) = (form) => (flash,session) => apply(form)(flash,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:09 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/login.scala.html
                    HASH: 1a24d3288e0c6ff71e9b2df7cb12ba9b0554ed7c
                    MATRIX: 560->1|720->84|759->89|804->126|843->128|940->191|954->197|1000->235|1039->237|1092->254|1105->258|1130->274|1179->285|1257->327|1271->332|1301->340|1358->365|1407->378|1421->383|1449->402|1500->415|1580->459|1609->466|1666->491|1782->571|1804->584|1832->590|2043->770
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|28->7|32->11|32->11|32->11|32->11|34->13|34->13|34->13|36->15|38->17|38->17|38->17|38->17|40->19|40->19|42->21|44->23|44->23|44->23|48->27
                    -- GENERATED --
                */
            