
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
object news extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Page[Post],Int,String,play.api.mvc.Request[play.api.mvc.AnyContent],play.api.mvc.Session,Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[(Post)], currentOrderBy: Int, currentFilter: String, request: play.api.mvc.Request[play.api.mvc.AnyContent])(implicit session: play.api.mvc.Session, flash: Flash):play.api.templates.Html = {
        _display_ {import org.apache.commons.lang3.time.DateFormatUtils.{format => formatDate}

import util.UserHelper

def /*11.2*/paginatorNew/*11.14*/(posts: Seq[Post]):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*11.36*/("""
		<div class="paginationNew">
					"""),_display_(Seq[Any](/*13.7*/currentPage/*13.18*/.first.map/*13.28*/ { page =>_display_(Seq[Any](format.raw/*13.38*/("""
                    <a href=""""),_display_(Seq[Any](/*14.31*/link(page))),format.raw/*14.41*/("""" class="pageEl">prima</a>
       """)))})),format.raw/*15.9*/("""
       		"""),_display_(Seq[Any](/*16.11*/currentPage/*16.22*/.prevPrev.map/*16.35*/ { page =>_display_(Seq[Any](format.raw/*16.45*/("""
                    <a href=""""),_display_(Seq[Any](/*17.31*/link(page))),format.raw/*17.41*/("""" class="pageEl">..</a>
                """)))}/*18.18*/.getOrElse/*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""
           """)))})),format.raw/*19.13*/("""
					"""),_display_(Seq[Any](/*20.7*/currentPage/*20.18*/.prev.map/*20.27*/ { page =>_display_(Seq[Any](format.raw/*20.37*/("""
                    <a href=""""),_display_(Seq[Any](/*21.31*/link(page))),format.raw/*21.41*/("""" class="pageEl">"""),_display_(Seq[Any](/*21.59*/(page + 1))),format.raw/*21.69*/("""</a>
                """)))}/*22.18*/.getOrElse/*22.28*/ {_display_(Seq[Any](format.raw/*22.30*/("""
           """)))})),format.raw/*23.13*/("""
                    <a href=""""),_display_(Seq[Any](/*24.31*/link(currentPage.page))),format.raw/*24.53*/("""" class="pageEl active">"""),_display_(Seq[Any](/*24.78*/(currentPage.page + 1))),format.raw/*24.100*/("""</a>

					"""),_display_(Seq[Any](/*26.7*/currentPage/*26.18*/.next.map/*26.27*/ { page =>_display_(Seq[Any](format.raw/*26.37*/("""
                    <a href=""""),_display_(Seq[Any](/*27.31*/link(page))),format.raw/*27.41*/("""" class="pageEl">"""),_display_(Seq[Any](/*27.59*/(page + 1))),format.raw/*27.69*/("""</a>
                """)))}/*28.18*/.getOrElse/*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
           """)))})),format.raw/*29.13*/("""
           """),_display_(Seq[Any](/*30.13*/currentPage/*30.24*/.nextNext.map/*30.37*/ { page =>_display_(Seq[Any](format.raw/*30.47*/("""
                    <a href=""""),_display_(Seq[Any](/*31.31*/link(page))),format.raw/*31.41*/("""" class="pageEl">..</a>
                """)))}/*32.18*/.getOrElse/*32.28*/ {_display_(Seq[Any](format.raw/*32.30*/("""
           """)))})),format.raw/*33.13*/("""
           """),_display_(Seq[Any](/*34.13*/currentPage/*34.24*/.last.map/*34.33*/ { page =>_display_(Seq[Any](format.raw/*34.43*/("""
                    <a href=""""),_display_(Seq[Any](/*35.31*/link(page))),format.raw/*35.41*/("""" class="pageEl">ultima</a>
                """)))}/*36.18*/.getOrElse/*36.28*/ {_display_(Seq[Any](format.raw/*36.30*/("""
           """)))})),format.raw/*37.13*/("""


			</div>


""")))};def /*45.3*/paginator/*45.12*/(posts : Seq[Post]):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*45.35*/("""
			<div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*48.18*/currentPage/*48.29*/.prev.map/*48.38*/ { page =>_display_(Seq[Any](format.raw/*48.48*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*50.35*/link(page))),format.raw/*50.45*/("""">&larr; Previous</a>
                    </li> 
                """)))}/*52.18*/.getOrElse/*52.28*/ {_display_(Seq[Any](format.raw/*52.30*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*56.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*58.36*/(currentPage.offset + 1))),format.raw/*58.60*/(""" to """),_display_(Seq[Any](/*58.65*/(currentPage.offset + posts.size))),format.raw/*58.98*/(""" of """),_display_(Seq[Any](/*58.103*/currentPage/*58.114*/.total)),format.raw/*58.120*/("""</a>
                </li>
                """),_display_(Seq[Any](/*60.18*/currentPage/*60.29*/.next.map/*60.38*/ { page =>_display_(Seq[Any](format.raw/*60.48*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*62.35*/link(page))),format.raw/*62.45*/("""">Next &rarr;</a>
                    </li> 
                """)))}/*64.18*/.getOrElse/*64.28*/ {_display_(Seq[Any](format.raw/*64.30*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*68.18*/("""
            </ul>
      </div>

""")))};def /*3.2*/link/*3.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Application.news(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
    
}};
Seq[Any](format.raw/*1.183*/("""

"""),format.raw/*8.2*/("""


"""),format.raw/*43.2*/("""

	"""),format.raw/*72.2*/("""

"""),_display_(Seq[Any](/*76.2*/defining(UserHelper.getUserRoleFromSession(request))/*76.54*/ { userRole =>_display_(Seq[Any](format.raw/*76.68*/("""
"""),_display_(Seq[Any](/*77.2*/main("Novita' - Libreria Parole Nuove")/*77.41*/ {_display_(Seq[Any](format.raw/*77.43*/("""
    <h1 class="title-section inline">Notizie</h1>
    """),_display_(Seq[Any](/*79.6*/userRole/*79.14*/.filter(f => f.toString().equals("Admin")).map/*79.60*/ {m =>_display_(Seq[Any](format.raw/*79.66*/("""
						<div class="inline">
								<a href=""""),_display_(Seq[Any](/*81.19*/routes/*81.25*/.Admin.newPost(request.uri))),format.raw/*81.52*/("""" class="button-link small" ><span>AGGIUNGI</span></a>
						</div>
					""")))})),format.raw/*83.7*/("""	
    
		<div id="flashContent">
				"""),_display_(Seq[Any](/*86.6*/flash/*86.11*/.get("success").map/*86.30*/ { m =>_display_(Seq[Any](format.raw/*86.37*/("""
			<span>
						 """),_display_(Seq[Any](/*88.9*/m)),format.raw/*88.10*/("""
						
			</span>
				""")))})),format.raw/*91.6*/("""
		</div>

    <ul>


		"""),_display_(Seq[Any](/*97.4*/Option(currentPage.items)/*97.29*/.filterNot(_.isEmpty).map/*97.54*/ { posts =>_display_(Seq[Any](format.raw/*97.65*/("""
			"""),_display_(Seq[Any](/*98.5*/paginatorNew(posts))),format.raw/*98.24*/("""
			"""),_display_(Seq[Any](/*99.5*/posts/*99.10*/.map/*99.14*/ { case (post) =>_display_(Seq[Any](format.raw/*99.31*/(""" 
      <li class='newsContent'>
					
					<table class='titleTable'>
    				 <tr>
							 <td  />
    			 	   <td colspan="3" >
									<div class='newsTitle'>
											<h1><span class='titleNews'> """),_display_(Seq[Any](/*107.42*/post/*107.46*/.title)),format.raw/*107.52*/(""" </span>
													<span class='separator'>::</span> <span class='dateText'> 
													"""),_display_(Seq[Any](/*109.15*/formatDate(post.dateCreation, "dd/MM/yyyy"))),format.raw/*109.58*/(""" by """),_display_(Seq[Any](/*109.63*/User/*109.67*/.getUser(post.fkUser.get).username)),format.raw/*109.101*/(""" 
													
										</h1>
									</div>
							  </td>
							 <td class='adminEditLinks'> """),_display_(Seq[Any](/*114.38*/userRole/*114.46*/.filter(f => f.toString().equals("Admin")).map/*114.92*/ {m =>_display_(Seq[Any](format.raw/*114.98*/("""
															<div class='adminEditLinks'><div class='content_box'><div class='bottom_box'>
															<a href=""""),_display_(Seq[Any](/*116.26*/routes/*116.32*/.Admin.editPost(post.id.get, request.uri))),format.raw/*116.73*/("""" class="button-link small"><span>MODIFICA</span></a>
					   									<a href=""""),_display_(Seq[Any](/*117.28*/routes/*117.34*/.Admin.deletePost(post.id.get, request.uri))),format.raw/*117.77*/("""" class="button-link small"><span>CANCELLA</span></a>
        											</div></div></div>	
												""")))})),format.raw/*119.14*/("""	</td>
   					 </tr>
    				<tr>
        			<td colspan="5"><div class='borderNewsTitle' /></td>
    				</tr>
						<tr>

							 <td class='titleMargin'></td>
   				     <td class='contentMargin' ></td>
        			<td >
									<div class='divContent'>"""),_display_(Seq[Any](/*129.35*/(post.content))),format.raw/*129.49*/("""</div>
							</td>
							 <td  class='contentMargin'></td>
   				     <td class='titleMargin' ></td>
    				</tr>
				</table>
				
				
      </li>
      </br>
      """)))})),format.raw/*139.8*/("""
      """),_display_(Seq[Any](/*140.8*/paginatorNew(posts))),format.raw/*140.27*/("""
      """)))}/*141.8*/.getOrElse/*141.18*/ {_display_(Seq[Any](format.raw/*141.20*/("""
      	<h2> Nessuna notizia trovata </h2>
      """)))})),format.raw/*143.8*/("""
   </ul>
     
""")))})),format.raw/*146.2*/("""
""")))})))}
    }
    
    def render(currentPage:Page[Post],currentOrderBy:Int,currentFilter:String,request:play.api.mvc.Request[play.api.mvc.AnyContent],session:play.api.mvc.Session,flash:Flash): play.api.templates.Html = apply(currentPage,currentOrderBy,currentFilter,request)(session,flash)
    
    def f:((Page[Post],Int,String,play.api.mvc.Request[play.api.mvc.AnyContent]) => (play.api.mvc.Session,Flash) => play.api.templates.Html) = (currentPage,currentOrderBy,currentFilter,request) => (session,flash) => apply(currentPage,currentOrderBy,currentFilter,request)(session,flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/news.scala.html
                    HASH: 7564896d23ba96e5cbcf50df87524b159e4c4fc4
                    MATRIX: 592->1|936->457|957->469|1043->491|1117->530|1137->541|1156->551|1204->561|1272->593|1304->603|1371->639|1419->651|1439->662|1461->675|1509->685|1577->717|1609->727|1670->769|1689->779|1729->781|1775->795|1818->803|1838->814|1856->823|1904->833|1972->865|2004->875|2058->893|2090->903|2132->926|2151->936|2191->938|2237->952|2305->984|2349->1006|2410->1031|2455->1053|2504->1067|2524->1078|2542->1087|2590->1097|2658->1129|2690->1139|2744->1157|2776->1167|2818->1190|2837->1200|2877->1202|2923->1216|2973->1230|2993->1241|3015->1254|3063->1264|3131->1296|3163->1306|3224->1348|3243->1358|3283->1360|3329->1374|3379->1388|3399->1399|3417->1408|3465->1418|3533->1450|3565->1460|3630->1506|3649->1516|3689->1518|3735->1532|3780->1560|3798->1569|3885->1592|4003->1674|4023->1685|4041->1694|4089->1704|4200->1779|4232->1789|4319->1857|4338->1867|4378->1869|4552->2011|4663->2086|4709->2110|4750->2115|4805->2148|4847->2153|4868->2164|4897->2170|4979->2216|4999->2227|5017->2236|5065->2246|5176->2321|5208->2331|5291->2395|5310->2405|5350->2407|5520->2545|5580->187|5591->191|5881->182|5911->450|5944->1554|5976->2583|6016->2691|6077->2743|6129->2757|6167->2760|6215->2799|6255->2801|6348->2859|6365->2867|6420->2913|6464->2919|6548->2967|6563->2973|6612->3000|6719->3076|6795->3117|6809->3122|6837->3141|6882->3148|6938->3169|6961->3170|7019->3197|7085->3228|7119->3253|7153->3278|7202->3289|7243->3295|7284->3314|7325->3320|7339->3325|7352->3329|7407->3346|7657->3559|7671->3563|7700->3569|7834->3666|7900->3709|7942->3714|7956->3718|8014->3752|8156->3857|8174->3865|8230->3911|8275->3917|8433->4038|8449->4044|8513->4085|8632->4167|8648->4173|8714->4216|8855->4324|9161->4593|9198->4607|9412->4789|9457->4798|9499->4817|9527->4826|9547->4836|9588->4838|9672->4890|9724->4910
                    LINES: 19->1|24->11|24->11|26->11|28->13|28->13|28->13|28->13|29->14|29->14|30->15|31->16|31->16|31->16|31->16|32->17|32->17|33->18|33->18|33->18|34->19|35->20|35->20|35->20|35->20|36->21|36->21|36->21|36->21|37->22|37->22|37->22|38->23|39->24|39->24|39->24|39->24|41->26|41->26|41->26|41->26|42->27|42->27|42->27|42->27|43->28|43->28|43->28|44->29|45->30|45->30|45->30|45->30|46->31|46->31|47->32|47->32|47->32|48->33|49->34|49->34|49->34|49->34|50->35|50->35|51->36|51->36|51->36|52->37|58->45|58->45|60->45|63->48|63->48|63->48|63->48|65->50|65->50|67->52|67->52|67->52|71->56|73->58|73->58|73->58|73->58|73->58|73->58|73->58|75->60|75->60|75->60|75->60|77->62|77->62|79->64|79->64|79->64|83->68|87->3|87->3|93->1|95->8|98->43|100->72|102->76|102->76|102->76|103->77|103->77|103->77|105->79|105->79|105->79|105->79|107->81|107->81|107->81|109->83|112->86|112->86|112->86|112->86|114->88|114->88|117->91|123->97|123->97|123->97|123->97|124->98|124->98|125->99|125->99|125->99|125->99|133->107|133->107|133->107|135->109|135->109|135->109|135->109|135->109|140->114|140->114|140->114|140->114|142->116|142->116|142->116|143->117|143->117|143->117|145->119|155->129|155->129|165->139|166->140|166->140|167->141|167->141|167->141|169->143|172->146
                    -- GENERATED --
                */
            