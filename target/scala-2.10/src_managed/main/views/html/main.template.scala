
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,play.api.mvc.Session,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html)(implicit session: play.api.mvc.Session):play.api.templates.Html = {
        _display_ {
def /*3.2*/logo/*3.6*/(test: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.24*/("""
	<strong><span>"""),_display_(Seq[Any](/*4.17*/test/*4.21*/.substring(0,1))),format.raw/*4.36*/("""</span>"""),_display_(Seq[Any](/*4.44*/test/*4.48*/.substring(1,4))),format.raw/*4.63*/(""" </strong><span>"""),_display_(Seq[Any](/*4.80*/test/*4.84*/.substring(4))),format.raw/*4.97*/("""</span>
""")))};
Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.2*/("""

<html class='page'>
    <head>
        <title>"""),_display_(Seq[Any](/*9.17*/title)),format.raw/*9.22*/("""</title>
				<script type="text/javascript" src=""""),_display_(Seq[Any](/*10.42*/routes/*10.48*/.Assets.at("javascripts/main.js"))),format.raw/*10.81*/("""" > </script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*11.38*/routes/*11.44*/.Assets.at("javascripts/test.js"))),format.raw/*11.77*/("""" > </script>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/layout.css"))),format.raw/*12.96*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*14.74*/("""" type="text/javascript"></script>
    </head>
    <body id="top">
    <div id="container">
        <div id="head">
            <div id="logo">
                <h1><a href=""""),_display_(Seq[Any](/*20.31*/routes/*20.37*/.Application.index())),format.raw/*20.57*/("""">
                    <div>
												<!-- 	"""),_display_(Seq[Any](/*22.20*/logo("Index porta0l"))),format.raw/*22.41*/(""" --->
											"""),_display_(Seq[Any](/*23.13*/logo("Libreria Parole Nuove"))),format.raw/*23.42*/("""  
                       <!-- <strong><span>L</span>ibre </strong><span>ria Parole Nuove</span> --->
                    </div></a>
                </h1>
            </div>
            <!--
						<div id="social">
                <ul >
                    <li><a href="#"><img src="images/bookmarks/rss.jpg" alt="RSS" /></a></li>
                    <li><a href="#"><img src="images/bookmarks/twitter.jpg" alt="Twitter" /></a></li>
                    <li onclick="window.open('http://del.icio.us/post?v=2&amp;url='+encodeURIComponent(location.href)+'&amp;notes=&amp;tags=&amp;title='+encodeURIComponent(document.title));return false;"><img src="images/bookmarks/delicious.jpg" alt="Del.icio.us" /></li>
                    <li onclick="window.open('http://reddit.com/submit?url='+encodeURIComponent(location.href)+'&amp;title='+encodeURIComponent(document.title));return false;"><img src="images/bookmarks/reddit.jpg" alt="reddit" /></li>
                    <li onclick="window.open('http://www.stumbleupon.com/submit?url='+encodeURIComponent(location.href)+'&amp;title='+encodeURIComponent(document.title));return false;"><img src="images/bookmarks/stumbleupon.jpg" alt="Stumbleupon" /></li>
                    <li onclick="window.open('http://www.facebook.com/share.php?u='+encodeURIComponent(location.href)+'&amp;t=');return false;"><img src="images/bookmarks/facebook.jpg" alt="Add to: Facebook" /></li>
                    <li onclick="window.open('http://digg.com/submit?phase=2&amp;url='+encodeURIComponent(location.href)+'&amp;bodytext=&amp;tags=&amp;title='+encodeURIComponent(document.title));return false;"> <img src="images/bookmarks/digg.jpg" alt="Digg" /></li>
                    <li class="last" onclick="window.open('http://myweb2.search.yahoo.com/myresults/bookmarklet?t='+encodeURIComponent(document.title)+'&amp;d=&amp;tag=&amp;u='+encodeURIComponent(location.href));return false;"><img src="images/bookmarks/yahoo.jpg" alt="Y! MyWeb" /></li>
                </ul>
            </div>
						-->

            <div id="search">
                <form action="/search" method="post">
                    <fieldset>
                        <legend>Site Search</legend>
                        <input type="submit" name="go" id="go" value="GO" />
                        <input name="text" type="text" value="Search the site&hellip;"  onfocus="this.value=(this.value=='Search the site&hellip;')? '' : this.value ;" />
                    </fieldset>
                </form>
            </div>

            <div id="quicklinks">
                <ul>
					<li><a href=""""),_display_(Seq[Any](/*55.20*/routes/*55.26*/.Application.news())),format.raw/*55.45*/("""">Notizie</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*56.35*/routes/*56.41*/.Application.chisiamo)),format.raw/*56.62*/("""">Chi siamo</a></li>
                   <li ><a href=""""),_display_(Seq[Any](/*57.35*/routes/*57.41*/.Application.consigli)),format.raw/*57.62*/("""">I Nostri Consigli</a></li>
					
					"""),_display_(Seq[Any](/*59.7*/session/*59.14*/.get("role").filter(f => f.equals("Admin")).map/*59.61*/ {m =>_display_(Seq[Any](format.raw/*59.67*/("""
					   <li ><a href=""""),_display_(Seq[Any](/*60.24*/routes/*60.30*/.Admin.admin)),format.raw/*60.42*/("""">Admin</a></li>
        			""")))})),format.raw/*61.13*/("""
					"""),_display_(Seq[Any](/*62.7*/session/*62.14*/.get("email").map/*62.31*/ { email =>_display_(Seq[Any](format.raw/*62.42*/("""
					  <li class="logout" >
							
                            <a href=""""),_display_(Seq[Any](/*65.39*/routes/*65.45*/.Application.logout())),format.raw/*65.66*/("""" >Logout(<p>"""),_display_(Seq[Any](/*65.80*/email)),format.raw/*65.85*/("""</p>)</a>
                        </li>
        			""")))}/*67.13*/.getOrElse/*67.23*/ {_display_(Seq[Any](format.raw/*67.25*/("""
        			   
        			   <li><a href=""""),_display_(Seq[Any](/*69.29*/routes/*69.35*/.Application.registration())),format.raw/*69.62*/("""" >Registrati</a></li>
        			   <li class="last">
										<a href=""""),_display_(Seq[Any](/*71.21*/routes/*71.27*/.Application.login())),format.raw/*71.47*/("""" >Accedi</a>
                 </li>
        			""")))})),format.raw/*73.13*/("""
                </ul>


          
        	</div>
       </div>
        			
        <div id='main-content'>
						"""),_display_(Seq[Any](/*82.8*/content)),format.raw/*82.15*/("""
        </div>
        <div id="footer">
            <div id="contactform">
                <h2>Why Not Contact Us Today !</h2>
                <form action="#" method="post">
                    <fieldset>
                        <legend>Contact Form</legend>
                        <label for="fullname">Name:
                            <input id="fullname" name="fullname" type="text" value="" />
                        </label>
                        <label for="emailaddress" class="margin">Email:
                            <input id="emailaddress" name="emailaddress" type="text" value="" />
                        </label>
                        <label for="phone">Telephone:
                            <input id="phone" name="phone" type="text" value="" />
                        </label>
                        <label for="subject" class="margin">Subject:
                            <input id="subject" name="subject" type="text" value="" />
                        </label>
                        <label for="message">Message:<br />
                            <textarea id="message" name="message" cols="40" rows="4"></textarea>
                        </label>
                        <p>
                            <input id="submitform" name="submitform" type="submit" value="Submit" />
                            &nbsp;
                            <input id="resetform" name="resetform" type="reset" value="Reset" />
                        </p>
                    </fieldset>
                </form>
            </div>
            <!-- End Contact Form -->
            <div id="compdetails">
                <div id="officialdetails">
                    <h2>Company Information !</h2>
                    <ul>
                        <li>Company Name Ltd</li>
                        <li>Registered in England &amp; Wales</li>
                        <li>Company No. xxxxxxx</li>
                        <li class="last">VAT No. xxxxxxxxx</li>
                    </ul>
                    <h2>Stay in The Know !</h2>
                    <p><a href="#">Get Our E-Newsletter</a> | <a href="#">Grab The RSS Feed</a></p>
                </div>
                <div id="contactdetails">
                    <h2>Our Contact Details !</h2>
                    <ul>
                        <li>Company Name</li>
                        <li>Street Name &amp; Number</li>
                        <li>Town</li>
                        <li>Postcode/Zip</li>
                        <li>Tel: xxxxx xxxxxxxxxx</li>
                        <li>Fax: xxxxx xxxxxxxxxx</li>
                        <li>Email: info@domain.com</li>
                        <li class="last">LinkedIn: <a href="#">Company Profile</a></li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>
            <!-- End Company Details -->
            <div id="copyright">
                <p class="fl_left">Copyright &copy; 2011 - All Rights Reserved - <a href="#">Domain Name</a></p>
                <p class="fl_right">Template by <a href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
                <br class="clear" />
            </div>
            <div class="clear"></div>
        </div>
    </div>


    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html,session:play.api.mvc.Session): play.api.templates.Html = apply(title)(content)(session)
    
    def f:((String) => (Html) => (play.api.mvc.Session) => play.api.templates.Html) = (title) => (content) => (session) => apply(title)(content)(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 22 17:48:16 CET 2014
                    SOURCE: /home/diego/play_projects/mproject/app/views/main.scala.html
                    HASH: ac8781337a198c67be8434c2063a792dde1cb25c
                    MATRIX: 530->1|660->76|671->80|752->98|805->116|817->120|853->135|896->143|908->147|944->162|996->179|1008->183|1042->196|1091->71|1121->206|1209->259|1235->264|1322->315|1337->321|1392->354|1480->406|1495->412|1550->445|1654->513|1669->519|1727->555|1825->617|1840->623|1894->655|1956->681|1971->687|2038->732|2254->912|2269->918|2311->938|2397->988|2440->1009|2495->1028|2546->1057|5199->3674|5214->3680|5255->3699|5345->3753|5360->3759|5403->3780|5495->3836|5510->3842|5553->3863|5631->3906|5647->3913|5703->3960|5747->3966|5808->3991|5823->3997|5857->4009|5919->4039|5962->4047|5978->4054|6004->4071|6053->4082|6167->4160|6182->4166|6225->4187|6275->4201|6302->4206|6375->4260|6394->4270|6434->4272|6516->4318|6531->4324|6580->4351|6693->4428|6708->4434|6750->4454|6833->4505|6994->4631|7023->4638
                    LINES: 19->1|21->3|21->3|23->3|24->4|24->4|24->4|24->4|24->4|24->4|24->4|24->4|24->4|26->1|28->5|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|43->20|43->20|43->20|45->22|45->22|46->23|46->23|78->55|78->55|78->55|79->56|79->56|79->56|80->57|80->57|80->57|82->59|82->59|82->59|82->59|83->60|83->60|83->60|84->61|85->62|85->62|85->62|85->62|88->65|88->65|88->65|88->65|88->65|90->67|90->67|90->67|92->69|92->69|92->69|94->71|94->71|94->71|96->73|105->82|105->82
                    -- GENERATED --
                */
            