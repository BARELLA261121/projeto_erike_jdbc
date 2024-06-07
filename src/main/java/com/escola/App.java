package com.escola;

import com.escola.dao.PessoaDao;
import com.escola.dao.PessoaPojo;
import com.escola.modelo.Login;

public class App 
{
    public static void main( String[] args ) {
       /*  Pessoa pessoa = new Pessoa();
        pessoa.setNome("Erike Jose Barella");
        pessoa.setEndereco("rua euclides da cunha 237");
        pessoa.setIdade(16);
       

        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setEndereco(pessoa.getEndereco());
        pessoaPojo.setIdade(pessoa.getIdade());

 
        PessoaDao pessoaDao = new PessoaDao();
         pessoaDao.cadastrarPessoa(pessoaPojo); */
         
         
         

 
        

        Login pessoa = new Login();
        pessoa.setId(1);
        pessoa.setNome("");
        pessoa.setEndereco("");
        pessoa.setIdade(16);


        PessoaPojo pessoaPojo = new PessoaPojo();
        pessoaPojo.setId(pessoa.getId());
        pessoaPojo.setNome(pessoa.getNome());
        pessoaPojo.setIdade(pessoa.getIdade());
        pessoaPojo.setEndereco(pessoa.getEndereco());


        PessoaDao pessoaDao = new PessoaDao();
        pessoaDao.deletarPessoa(pessoaPojo);    
    }
}