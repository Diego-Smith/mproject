
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
object registration extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[scala.Tuple4[String, String, String, String]],Flash,play.api.mvc.Session,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[(String,String,String,String)])(implicit flash: Flash, session: play.api.mvc.Session):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.99*/("""


"""),_display_(Seq[Any](/*4.2*/main("Registrazione - Libreria Parole Nuove")/*4.47*/ {_display_(Seq[Any](format.raw/*4.49*/("""
    
    
   """),_display_(Seq[Any](/*7.5*/helper/*7.11*/.form(routes.Application.registrationSubmit)/*7.55*/ {_display_(Seq[Any](format.raw/*7.57*/("""
   
   		 <h1 class="title-section">Registrazione</h1>
   			    
				"""),_display_(Seq[Any](/*11.6*/form/*11.10*/.globalError.map/*11.26*/ { error =>_display_(Seq[Any](format.raw/*11.37*/("""
		    <p class="error">
            """),_display_(Seq[Any](/*13.14*/error/*13.19*/.message)),format.raw/*13.27*/("""
        </p>
        """)))})),format.raw/*15.10*/("""

        """),_display_(Seq[Any](/*17.10*/flash/*17.15*/.get("success").map/*17.34*/ { message =>_display_(Seq[Any](format.raw/*17.47*/("""
        <p class="success">
            """),_display_(Seq[Any](/*19.14*/message)),format.raw/*19.21*/("""
        </p>
        """)))}/*21.10*/.getOrElse/*21.20*/ {_display_(Seq[Any](format.raw/*21.22*/("""
            <input type="input" name="nome" id="nome" placeholder="Nome" value=""""),_display_(Seq[Any](/*22.82*/form("nome")/*22.94*/.value)),format.raw/*22.100*/("""">
            <input type="input" name="cognome" id="cognome" placeholder="Cognome" value=""""),_display_(Seq[Any](/*23.91*/form("cognome")/*23.106*/.value)),format.raw/*23.112*/("""">
            <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(Seq[Any](/*24.85*/form("email")/*24.98*/.value)),format.raw/*24.104*/("""">
            <input type="password" name="password" placeholder="Password" id="password" value=""""),_display_(Seq[Any](/*25.97*/form("password")/*25.113*/.value)),format.raw/*25.119*/("""">
            <button type="submit" class="button-link">Registrati</button>
        </p>
				""")))})),format.raw/*28.6*/("""
	""")))})),format.raw/*29.3*/("""

""")))})))}
    }
    
    def render(form:Form[scala.Tuple4[String, String, String, String]],flash:Flash,session:play.api.mvc.Session): play.api.templates.Html = apply(form)(flash,session)
    
    def f:((Form[scala.Tuple4[String, String, String, String]]) => (Flash,play.api.mvc.Session) => play.api.templates.Html) = (form) => (flash,session) => apply(form)(flash,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/registration.scala.html
                    HASH: 7392b9b45bacf80ab876ec1336ec4b0f65adcf33
                    MATRIX: 583->1|757->98|798->105|851->150|890->152|942->170|956->176|1008->220|1047->222|1158->298|1171->302|1196->318|1245->329|1321->369|1335->374|1365->382|1422->407|1471->420|1485->425|1513->444|1564->457|1644->501|1673->508|1717->533|1736->543|1776->545|1895->628|1916->640|1945->646|2075->740|2100->755|2129->761|2253->849|2275->862|2304->868|2440->968|2466->984|2495->990|2624->1088|2659->1092
                    LINES: 19->1|22->1|25->4|25->4|25->4|28->7|28->7|28->7|28->7|32->11|32->11|32->11|32->11|34->13|34->13|34->13|36->15|38->17|38->17|38->17|38->17|40->19|40->19|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|49->28|50->29
                    -- GENERATED --
                */
            