
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[model.Pessoa],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pessoas: Seq[model.Pessoa]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""

"""),_display_(Seq[Any](/*3.2*/pessoas/*3.9*/.map/*3.13*/{pessoa=>_display_(Seq[Any](format.raw/*3.22*/("""

 <label>ID - """),_display_(Seq[Any](/*5.15*/pessoa/*5.21*/.id)),format.raw/*5.24*/("""</label>
 <label>NAME - """),_display_(Seq[Any](/*6.17*/pessoa/*6.23*/.name)),format.raw/*6.28*/("""</label>
 <label>AGE - """),_display_(Seq[Any](/*7.16*/pessoa/*7.22*/.age)),format.raw/*7.26*/("""</label>
 <label>PHONE - """),_display_(Seq[Any](/*8.18*/pessoa/*8.24*/.phone)),format.raw/*8.30*/("""</label>
 <br>
""")))})),format.raw/*10.2*/(""" 
 
   

"""))}
    }
    
    def render(pessoas:Seq[model.Pessoa]): play.api.templates.HtmlFormat.Appendable = apply(pessoas)
    
    def f:((Seq[model.Pessoa]) => play.api.templates.HtmlFormat.Appendable) = (pessoas) => apply(pessoas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 19 22:14:51 BRT 2014
                    SOURCE: /Users/rafaelsalerno/Documents/MeusWorkspace/workspaceScala/Poc/app/views/list.scala.html
                    HASH: b8017aab6127445e75a75ab057945b611976628b
                    MATRIX: 566->1|688->29|725->32|739->39|751->43|797->52|848->68|862->74|886->77|946->102|960->108|986->113|1045->137|1059->143|1084->147|1145->173|1159->179|1186->185|1233->201
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|26->5|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|31->10
                    -- GENERATED --
                */
            