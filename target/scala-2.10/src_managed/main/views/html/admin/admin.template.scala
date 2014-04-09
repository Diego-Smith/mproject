
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
object admin extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,Flash,play.api.mvc.Session,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(adminContent: Html)(implicit flash: Flash, session: play.api.mvc.Session):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.76*/("""

"""),_display_(Seq[Any](/*3.2*/main("Admin - Libreria Parole Nuove")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""
    
		<div id="adminSection">
		<div id="flashContent">
				"""),_display_(Seq[Any](/*7.6*/flash/*7.11*/.get("success").map/*7.30*/ { m =>_display_(Seq[Any](format.raw/*7.37*/("""
			<span>
						 """),_display_(Seq[Any](/*9.9*/m)),format.raw/*9.10*/("""
			</span>
				""")))})),format.raw/*11.6*/("""
		</div>
    <div id="adminContent">
		"""),_display_(Seq[Any](/*14.4*/adminContent)),format.raw/*14.16*/("""
		</div>
		<!--
    <div id="adminMenu">
			<ul>
				<li><a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Admin.posts)),format.raw/*19.37*/("""">News</a></li>
				<li><a href=""""),_display_(Seq[Any](/*20.19*/routes/*20.25*/.Admin.posts)),format.raw/*20.37*/("""">News</a></li>
				<li><a href=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.Admin.posts)),format.raw/*21.37*/("""">News</a></li>
			</ul>
		</div>
		-->
	</div>
""")))})))}
    }
    
    def render(adminContent:Html,flash:Flash,session:play.api.mvc.Session): play.api.templates.Html = apply(adminContent)(flash,session)
    
    def f:((Html) => (Flash,play.api.mvc.Session) => play.api.templates.Html) = (adminContent) => (flash,session) => apply(adminContent)(flash,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/admin/admin.scala.html
                    HASH: 4c90fea1543fbdd93e8ff78d92ffd69fca099182
                    MATRIX: 536->1|687->75|726->80|771->117|810->119|911->186|924->191|951->210|995->217|1050->238|1072->239|1122->258|1201->302|1235->314|1344->387|1359->393|1393->405|1464->440|1479->446|1513->458|1584->493|1599->499|1633->511
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|28->7|30->9|30->9|32->11|35->14|35->14|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21
                    -- GENERATED --
                */
            