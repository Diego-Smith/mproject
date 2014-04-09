
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
object page_visited extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[PageVisited],play.api.mvc.Session,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(listPages: List[PageVisited])(implicit session: play.api.mvc.Session, flash: Flash):play.api.templates.Html = {
        _display_ {import org.apache.commons.lang3.time.DateFormatUtils.{format => formatDate}

def /*3.2*/header/*3.8*/(orderBy: Int, title: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.41*/("""
    <th>
        """),_display_(Seq[Any](/*5.10*/title)),format.raw/*5.15*/("""
    </th>
""")))};
Seq[Any](format.raw/*1.86*/("""

"""),format.raw/*7.2*/("""

"""),format.raw/*10.1*/("""
"""),_display_(Seq[Any](/*11.2*/admin/*11.7*/ {_display_(Seq[Any](format.raw/*11.9*/("""
	<ul>
	<table>
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*16.22*/header(2, "Nome pagina"))),format.raw/*16.46*/("""
                    """),_display_(Seq[Any](/*17.22*/header(3, "Ip visitatore"))),format.raw/*17.48*/("""
                    """),_display_(Seq[Any](/*18.22*/header(4, "Data"))),format.raw/*18.39*/("""
                    """),_display_(Seq[Any](/*19.22*/header(5, "User"))),format.raw/*19.39*/("""
                </tr>
            </thead>
	

			<tbody>

                """),_display_(Seq[Any](/*26.18*/listPages/*26.27*/.map/*26.31*/ { page =>_display_(Seq[Any](format.raw/*26.41*/(""" 
                        <tr>
                            <td>"""),_display_(Seq[Any](/*28.34*/page/*28.38*/.pagename)),format.raw/*28.47*/("""</td>
                	   		<td>
                	   		"""),_display_(Seq[Any](/*30.24*/page/*30.28*/.ip)),format.raw/*30.31*/(""" 
                	   		</td>
                            <td>
                				"""),_display_(Seq[Any](/*33.22*/formatDate(page.dateVisited, "dd/MM/yyyy HH:mm"))),format.raw/*33.70*/("""
                            </td>
												 <td>"""),_display_(Seq[Any](/*35.19*/page/*35.23*/.fkUser)),format.raw/*35.30*/("""</td>
                        </tr>
                     """)))})),format.raw/*37.23*/("""

            </tbody>
    </table>
""")))})))}
    }
    
    def render(listPages:List[PageVisited],session:play.api.mvc.Session,flash:Flash): play.api.templates.Html = apply(listPages)(session,flash)
    
    def f:((List[PageVisited]) => (play.api.mvc.Session,Flash) => play.api.templates.Html) = (listPages) => (session,flash) => apply(listPages)(session,flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/admin/page_visited.scala.html
                    HASH: acad053bcee93304cc2664bf95710896a70fbc0f
                    MATRIX: 556->1|777->90|790->96|886->129|942->150|968->155|1021->85|1051->169|1082->251|1120->254|1133->259|1172->261|1291->344|1337->368|1396->391|1444->417|1503->440|1542->457|1601->480|1640->497|1759->580|1777->589|1790->593|1838->603|1940->669|1953->673|1984->682|2078->740|2091->744|2116->747|2239->834|2309->882|2400->937|2413->941|2442->948|2534->1008
                    LINES: 19->1|22->3|22->3|24->3|26->5|26->5|29->1|31->7|33->10|34->11|34->11|34->11|39->16|39->16|40->17|40->17|41->18|41->18|42->19|42->19|49->26|49->26|49->26|49->26|51->28|51->28|51->28|53->30|53->30|53->30|56->33|56->33|58->35|58->35|58->35|60->37
                    -- GENERATED --
                */
            