package component

import model.PessoaDao

trait Componet {
  
  lazy val getPessoa = Locator.pessoaDao.getPessoa(_)
  lazy val listPessoa = Locator.pessoaDao.listPessoa(_)

  object Locator {
    lazy val pessoaDao: PessoaDao = new PessoaDao
  }
}