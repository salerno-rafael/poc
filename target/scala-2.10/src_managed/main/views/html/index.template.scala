
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""


 <label for="fim" >"""),_display_(Seq[Any](/*4.21*/message)),format.raw/*4.28*/("""</label>
 
    <h2>Action 1</h2>
      """),_display_(Seq[Any](/*7.8*/helper/*7.14*/.form(routes.Application.getPesssoa())/*7.52*/ {_display_(Seq[Any](format.raw/*7.54*/("""
       <label for="id" >Id da pessoa</label> 
       <input type="text" name="id" id="id"  >
       
       <input type="submit" value="Find"/>
        
    """)))})),format.raw/*13.6*/("""
    
    
     <h2>Action 2</h2>
      """),_display_(Seq[Any](/*17.8*/helper/*17.14*/.form(routes.Application.list())/*17.46*/ {_display_(Seq[Any](format.raw/*17.48*/("""
       
       <input type="submit" value="List"/>
        
    """)))})),format.raw/*21.6*/("""

"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 19 22:14:51 BRT 2014
                    SOURCE: /Users/rafaelsalerno/Documents/MeusWorkspace/workspaceScala/Poc/app/views/index.scala.html
                    HASH: 2203c5dab9bbb38cc52e46634cb5595f28068d6b
                    MATRIX: 556->1|667->18|725->41|753->48|827->88|841->94|887->132|926->134|1116->293|1192->334|1207->340|1248->372|1288->374|1385->440
                    LINES: 19->1|22->1|25->4|25->4|28->7|28->7|28->7|28->7|34->13|38->17|38->17|38->17|38->17|42->21
                    -- GENERATED --
                */
            