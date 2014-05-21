package model

case class Pessoa(id: Int, name: String, age: Int, phone: String)

class PessoaDao {

  def getPessoa(id: Int): Pessoa = {
    id match {
      case 1 => Pessoa(1, "Rafael", 30, "3222-0000")
      case 2 => Pessoa(2, "João", 22, "3222-111")
      case _=> Pessoa(1, "Rafael", 30, "3222-0000")
    }
  }

  def listPessoa(name:String) = {
    Seq(Pessoa(1, "Rafael", 30, "3222-0000"),
      Pessoa(2, "João", 22, "3222-111"),
      Pessoa(3, "Maria", 11, "4444-2222"))
  }

}