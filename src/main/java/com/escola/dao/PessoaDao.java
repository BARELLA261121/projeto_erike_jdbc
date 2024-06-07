package com.escola.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.escola.conexao.conexao;

public class PessoaDao {

     public void cadastrarPessoa(PessoaPojo pessoaPojo)  {
        
        conexao conexao = new conexao();
        
        String sql = "insert into pessoa(nome, endereco, idade) value (?, ?, ?)";

        PreparedStatement ps = null; 

        try {

        ps = conexao.getConexao().prepareStatement(sql);

        ps.setString(1,pessoaPojo.getNome());
        ps.setString(2,pessoaPojo.getEndereco());
        ps.setInt(3,pessoaPojo.getIdade());


        ps.execute();
        ps.close();
        
        System.out.println("Dados inseridos com sucesso");



        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("nâo foi possível colocar os dados no banco");
        } 
         
    }
 public void deletarPessoa(PessoaPojo pessoaPojo) {

        conexao conexao = new conexao();

        String sql = "DELETE FROM pessoa WHERE id = (?)";

        PreparedStatement ps = null;


        try {

            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, pessoaPojo.getId());
            
           

            ps.execute();
            ps.close();

            System.out.println("Dados deletados com sucesso!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

           
        
    }



}