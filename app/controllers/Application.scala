package controllers

import play.api._
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import service.PessoaService
import model.PessoaDao
import component.Componet

object Application extends Controller with Componet{

  case class PessoaForm(id: Int)

  val filterForm = Form[PessoaForm](mapping("id" -> number)(PessoaForm)(PessoaForm.unapply _))

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def getPesssoa = Action { implicit request =>
    filterForm.bindFromRequest.fold(
      errors => BadRequest("Bad Request"),
      filter => {
        val p = PessoaService.getPessoa(filter.id, getPessoa)
        println("call function getPessoa")

        Ok(views.html.result(p))
      })

  }
  
    def list = Action { 
        println("call function listPessoa")
        Ok(views.html.list(PessoaService.list(listPessoa)))

  }

}