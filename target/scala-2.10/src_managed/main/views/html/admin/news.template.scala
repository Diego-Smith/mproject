
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
object news extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Post],play.api.mvc.Session,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(posts: List[Post])(implicit session: play.api.mvc.Session, flash: Flash):play.api.templates.Html = {
        _display_ {import org.apache.commons.lang3.time.DateFormatUtils.{format => formatDate}

def /*3.2*/header/*3.8*/(orderBy: Int, title: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.41*/("""
    <th>
        """),_display_(Seq[Any](/*5.10*/title)),format.raw/*5.15*/("""
    </th>
""")))};
Seq[Any](format.raw/*1.75*/("""

"""),format.raw/*7.2*/("""

"""),format.raw/*10.1*/("""
"""),_display_(Seq[Any](/*11.2*/admin/*11.7*/ {_display_(Seq[Any](format.raw/*11.9*/("""
	<ul>
	<table>
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*16.22*/header(2, "Titolo"))),format.raw/*16.41*/("""
                    """),_display_(Seq[Any](/*17.22*/header(3, "Contenuto"))),format.raw/*17.44*/("""
                    """),_display_(Seq[Any](/*18.22*/header(4, "Data"))),format.raw/*18.39*/("""
                </tr>
            </thead>
	

			<tbody>

                """),_display_(Seq[Any](/*25.18*/posts/*25.23*/.map/*25.27*/ { post =>_display_(Seq[Any](format.raw/*25.37*/(""" 
                        <tr>
                            <td><a href='"""),_display_(Seq[Any](/*27.43*/routes/*27.49*/.Admin.editPost(post.id.get, "/admin/posts"))),format.raw/*27.93*/("""'>"""),_display_(Seq[Any](/*27.96*/post/*27.100*/.title)),format.raw/*27.106*/("""</a></td>
                	   		<td>
                	   		"""),_display_(Seq[Any](/*29.24*/post/*29.28*/.content)),format.raw/*29.36*/(""" 
                	   		</td>
                            <td>
                				"""),_display_(Seq[Any](/*32.22*/formatDate(post.dateCreation, "dd/MM/yyyy HH:mm"))),format.raw/*32.71*/("""
                            </td>
                        </tr>
                     """)))})),format.raw/*35.23*/("""

            </tbody>
    </table>
""")))})),format.raw/*39.2*/("""
    
"""))}
    }
    
    def render(posts:List[Post],session:play.api.mvc.Session,flash:Flash): play.api.templates.Html = apply(posts)(session,flash)
    
    def f:((List[Post]) => (play.api.mvc.Session,Flash) => play.api.templates.Html) = (posts) => (session,flash) => apply(posts)(session,flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/admin/news.scala.html
                    HASH: 7eb8677ac297d67a319b01d58770026f1e049fa7
                    MATRIX: 541->1|751->79|764->85|860->118|916->139|942->144|995->74|1025->158|1056->240|1094->243|1107->248|1146->250|1265->333|1306->352|1365->375|1409->397|1468->420|1507->437|1626->520|1640->525|1653->529|1701->539|1812->614|1827->620|1893->664|1932->667|1946->671|1975->677|2073->739|2086->743|2116->751|2239->838|2310->887|2432->977|2504->1018
                    LINES: 19->1|22->3|22->3|24->3|26->5|26->5|29->1|31->7|33->10|34->11|34->11|34->11|39->16|39->16|40->17|40->17|41->18|41->18|48->25|48->25|48->25|48->25|50->27|50->27|50->27|50->27|50->27|50->27|52->29|52->29|52->29|55->32|55->32|58->35|62->39
                    -- GENERATED --
                */
            