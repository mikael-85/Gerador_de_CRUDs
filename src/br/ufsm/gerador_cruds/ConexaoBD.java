/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mikael
 */
public class ConexaoBD {
    private final String JDBC_DRIVER = "org.postgresql.Driver";
    private final String SENHA = "postgres";
    private final String USUARIO = "postgres"; 
    private final String URL_CONEXAO = "jdbc:postgresql://localhost:5432/biblioteca";
    
    public Connection getConexao(){
        Connection c = null;
        
        try {
            c = DriverManager.getConnection(this.URL_CONEXAO, this.USUARIO, this.SENHA);
        } catch (SQLException ex) {
            System.err.println("ERRO: nao foi possvivel estabelecer conexao com BD");
            System.err.println(ex.getMessage());
            //Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
