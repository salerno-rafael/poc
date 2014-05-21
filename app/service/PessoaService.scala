package service

import model.Pessoa

object PessoaService {

  def getPessoa(id: Int, fn: Int => Pessoa): Pessoa = {
    fn(id)
  }

  def list(fn:String => Seq[Pessoa]) = fn("")

}