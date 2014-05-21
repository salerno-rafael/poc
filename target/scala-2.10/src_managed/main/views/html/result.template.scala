
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
object result extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[model.Pessoa,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pessoa: model.Pessoa):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.24*/("""


 <label>ID - """),_display_(Seq[Any](/*4.15*/pessoa/*4.21*/.id)),format.raw/*4.24*/("""</label>
 <label>NAME - """),_display_(Seq[Any](/*5.17*/pessoa/*5.23*/.name)),format.raw/*5.28*/("""</label>
 <label>AGE - """),_display_(Seq[Any](/*6.16*/pessoa/*6.22*/.age)),format.raw/*6.26*/("""</label>
 <label>PHONE - """),_display_(Seq[Any](/*7.18*/pessoa/*7.24*/.phone)),format.raw/*7.30*/("""</label>
 
 
   

"""))}
    }
    
    def render(pessoa:model.Pessoa): play.api.templates.HtmlFormat.Appendable = apply(pessoa)
    
    def f:((model.Pessoa) => play.api.templates.HtmlFormat.Appendable) = (pessoa) => apply(pessoa)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 19 21:49:06 BRT 2014
                    SOURCE: /Users/rafaelsalerno/Documents/MeusWorkspace/workspaceScala/Poc/app/views/result.scala.html
                    HASH: d7f019fe137f5e962c10a824c5c809ea5d6930b1
                    MATRIX: 563->1|679->23|731->40|745->46|769->49|829->74|843->80|869->85|928->109|942->115|967->119|1028->145|1042->151|1069->157
                    LINES: 19->1|22->1|25->4|25->4|25->4|26->5|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7
                    -- GENERATED --
                */
            