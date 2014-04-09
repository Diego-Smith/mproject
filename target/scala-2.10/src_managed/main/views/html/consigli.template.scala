
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
object consigli extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Consigli],play.api.mvc.Session,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(consigli: List[Consigli])(implicit session: play.api.mvc.Session):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.68*/("""

"""),_display_(Seq[Any](/*3.2*/main("I nostri consigli - Libreria Parole Nuove")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""
	    <h1 class="title-section">Idee Regalo</h1>
	    <ul class="consigli">
	    """),_display_(Seq[Any](/*6.7*/consigli/*6.15*/.map/*6.19*/ {consiglio =>_display_(Seq[Any](format.raw/*6.33*/(""" 
				<li>	
	    	<img src="assets/images/test.jpg" />
	    	<h3>"""),_display_(Seq[Any](/*9.12*/{consiglio.posizione})),format.raw/*9.33*/(""". """),_display_(Seq[Any](/*9.36*/consiglio/*9.45*/.titolo)),format.raw/*9.52*/(""" 
					"""),_display_(Seq[Any](/*10.7*/consiglio/*10.16*/.autore.map/*10.27*/{ aut =>_display_(Seq[Any](format.raw/*10.35*/(""" 
						- 
						"""),_display_(Seq[Any](/*12.8*/aut))))})),format.raw/*12.12*/(""" </h3>
	    	<p>"""),_display_(Seq[Any](/*13.11*/consiglio/*13.20*/.descrizione)),format.raw/*13.32*/(""" - 
						"""),_display_(Seq[Any](/*14.8*/consiglio/*14.17*/.tipo.label)),format.raw/*14.28*/("""
				</p>
				</li>	
	    
	    """)))})),format.raw/*18.7*/("""
			</ul>
""")))})))}
    }
    
    def render(consigli:List[Consigli],session:play.api.mvc.Session): play.api.templates.Html = apply(consigli)(session)
    
    def f:((List[Consigli]) => (play.api.mvc.Session) => play.api.templates.Html) = (consigli) => (session) => apply(consigli)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:03:10 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/consigli.scala.html
                    HASH: 1cf0c48ea08144d82fe83dd320dd2ac679c0cacc
                    MATRIX: 537->1|680->67|719->72|776->121|815->123|934->208|950->216|962->220|1013->234|1117->303|1159->324|1197->327|1214->336|1242->343|1286->352|1304->361|1324->372|1370->380|1425->400|1455->404|1509->422|1527->431|1561->443|1608->455|1626->464|1659->475|1727->512
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|27->6|30->9|30->9|30->9|30->9|30->9|31->10|31->10|31->10|31->10|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|39->18
                    -- GENERATED --
                */
            