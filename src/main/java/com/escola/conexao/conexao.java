package com.escola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    private String url = "jdbc:mysql://127.0.0.1:3306/loja";
    private String user = "root";
    private String passaword = "";


private Connection conn;

public Connection getConexao() {

    try {
        conn = DriverManager.getConnection(url, user, passaword);
        System.out.println("Conexão com banco bem sucedida");
        return conn;
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Erro na conexão com o banco");
    }
        return null;
    }
}