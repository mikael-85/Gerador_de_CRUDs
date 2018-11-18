/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.gerador_cruds;

import java.util.ArrayList;

/**
 *
 * @author Mikael
 */
public class Principal {
    // Esta classe sera instanciada na classe Inicial, no main 
    
    // Variaveis que irao receber instancias no construtor
    private ManipulaArquivos manipulaArquivos;
    public ArrayList<String> classesCriadas;
    private Metadata metadata;
    private ControladorClasses controladorClasses;
    
    public Principal() {
        this.manipulaArquivos = new ManipulaArquivos();
        // Ler o arquivo classesCriadas.txt
        this.classesCriadas = this.manipulaArquivos.leituraArquivo("classesCriadas.txt");
        if(this.classesCriadas != null){
            /* percorrendo 
            for (String atual : this.classesCriadas) {
                System.out.println(atual);
            }*/
        }else{
            // Arquivo nao existe, criar o arquivo e 
            // Inicializar o ArrayList classesCriadas sem elementos
            this.classesCriadas = new ArrayList<>();
            this.manipulaArquivos.gravarNoFinalDoArquivo("classesCriadas.txt", null);
        }
        // Obter metadados do BD
        this.metadata = new Metadata();
        this.controladorClasses = new ControladorClasses(metadata.getTabelas());
    }
    
    
}
