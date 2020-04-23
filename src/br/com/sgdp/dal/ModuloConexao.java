/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgdp.dal;

import java.sql.*;

/**
 *
 * @author Marcio Cavalcanti
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer a conexão com o banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo chama o drive na biblioteca para a conexao com o banco de dados
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/csi_sgdp?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        // estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }

}
