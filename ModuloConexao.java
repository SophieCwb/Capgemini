/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.divulgatudo.dal;

import java.sql.*;

/**
 *
 * @author User
 */
public class ModuloConexao {

    private static String driver;

    //método responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver
       
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informaçoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbdivulgatudo";
        String user = "root";
        String password = "O$empsl1";
        // estabelecendo a conexao com o banco
        try {
            Class.forName (driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro
           System.out.println(e); 
  
            return null;
        }
     

    }

}
