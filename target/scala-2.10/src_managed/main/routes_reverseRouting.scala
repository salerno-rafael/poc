// @SOURCE:/Users/rafaelsalerno/Documents/MeusWorkspace/workspaceScala/Poc/conf/routes
// @HASH:5f42ab3c3e39d39f5b6db23660bec9c4a08347b8
// @DATE:Mon May 19 22:14:51 BRT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def getPesssoa(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pessoa")
}
                                                

// @LINE:8
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "list")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def getPesssoa : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPesssoa",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pessoa"})
      }
   """
)
                        

// @LINE:8
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def getPesssoa(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPesssoa(), HandlerDef(this, "controllers.Application", "getPesssoa", Seq(), "GET", """""", _prefix + """pessoa""")
)
                      

// @LINE:8
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(), HandlerDef(this, "controllers.Application", "list", Seq(), "GET", """""", _prefix + """list""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    