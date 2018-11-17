/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

import java.util.ArrayList;

/**
 *
 * @author mikae
 */
public class Principal {
    private ManipulaArquivos manipulaArquivos;
    public ArrayList<String> classesCriadas;
    private Metadata metadata;
    
    public Principal(){
        this.manipulaArquivos  = new ManipulaArquivos();
        this.classesCriadas = this.manipulaArquivos.LeituraArquivo("classesCriadas.txt");
        if (this.classesCriadas != null){
            //fazer, teste... 
        }else{
            this.classesCriadas = new ArrayList<>();
            this.manipulaArquivos.gravarNoFinalDoArquivo("classesCriadas.txt",null);
        }
        this.metadata = new Metadata();
    }
    
}
