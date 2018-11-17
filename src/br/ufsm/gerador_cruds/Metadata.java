/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mikae
 */
public class Metadata {

    private ConexaoBD conexaoBD = null;
    private Connection conexao = null;
    private DatabaseMetaData metadata = null;
    private ArrayList<MetadataEntidadeModelo> tabelas = null;

    public Metadata() {
        this.conexaoBD = new ConexaoBD();
        this.ConexaoBD = conexaoBD.getConexao();
        try {
            this.metadata = this.conexao.getMetaData();
            obterMetadadosBD();
        } catch (SQLException ex) {
            System.err.println("Erro: nao foi possivel obter meta data do BD");
            System.err.println(ex.getMessage());
            //Logger.getLogger(Metadata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void obeterMetadadosBD(){
        this.obeterTabeasMetaData();
    }
    
    public void obeterTabelasMetadata() {
        String table[] = {"TABLE"};
        ResultSet rs = null;
        this.tabelas = new ArrayList<MetadataEntidadeModelo>();
        try {
            rs = this.metadata.getTables(null, null, null, table);
        } catch (SQLException ex) {
            System.err.println("Erro: nao foi possivel obter as entidades do BD!");
            System.err.println(ex.getMessage());
            //Logger.getLogger(Metadata.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (rs != null && !rs.isClosed() && rs.next()){
            MetadataEntidadeModelo tabelaAtual = new MetadataEntidadeModelo();
            tabelaAtual.setNomeEntidade(rs.getString(string))// voltar
        }
    }
    
    
}
