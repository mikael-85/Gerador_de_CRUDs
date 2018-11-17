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
public class MetadataEntidadeModelo {
    private String nomeEntidade;
    private ArrayList<MetadataAtributoModelo> atributoEntidade;

    public MetadataEntidadeModelo(){
        this.nomeEntidade = null;
        this.atributoEntidade = new ArrayList<MetadataAtributoModelo>(); 
    }
    
    public MetadataEntidadeModelo(String nomeEntidade){
        this.nomeEntidade = nomeEntidade;
        this.atributoEntidade = new ArrayList<MetadataAtributoModelo>();
        
    }
    
    public void adicionarAtributo (MetadataAtributoModelo atributo){
        this.atributoEntidade.add(atributo);
    }
    
    public void adicionarAtributo(String nomeAtributo, String tipoAtrbuto, int tamanhoAtributo, Tipo valor){
        MetadataAtributoModelo novoAtributo;
        novoAtributo = new MetadataAtributoModelo(nomeAtributo, tipoAtrbuto, tamanhoAtributo, valor);
        this.atributoEntidade.add(novoAtributo);
    }

    public String getNomeEntidade() {
        return nomeEntidade;
    }

    public void setNomeEntidade(String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;
    }

    public ArrayList<MetadataAtributoModelo> getAtributoEntidade() {
        return atributoEntidade;
    }

    public void setAtributoEntidade(ArrayList<MetadataAtributoModelo> atributoEntidade) {
        this.atributoEntidade = atributoEntidade;
    }
    
    
    
}
