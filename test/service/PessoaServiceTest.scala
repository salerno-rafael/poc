package service

import org.specs2.mutable.Specification
import model.Pessoa

object PessoaServiceTest extends Specification {

  "PessoaService" should {
    "Test getPessoa" in {
      PessoaService.getPessoa(1, x => functionGet(1)) must equalTo(Pessoa(1, "Rafael", 30, "3222-0000"))
    }

    "Test ListPessoa" in {
      PessoaService.list(x => pessoas) must equalTo(pessoas)
    }
    
     "Test ListPessoa one record" in {
      PessoaService.list(x => pessoas)(2) must equalTo(pessoas(2))
    }
  }

  def functionGet: Int => Pessoa = { x: Int => pessoas(0) }

  val pessoas: Seq[Pessoa] = Seq(
    Pessoa(1, "Rafael", 30, "3222-0000"),
    Pessoa(2, "João", 22, "3222-111"),
    Pessoa(3, "Maria", 11, "4444-2222"))
}