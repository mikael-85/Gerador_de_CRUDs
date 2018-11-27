/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

/**
 *
 * @author Mikael
 */
public class MetadataAtributoModelo<T> {
    private String nomeAtributo;
    private String tipoAtributo;
    private int tamanhoAtributo;
    private T valor;

    public MetadataAtributoModelo(String nomeAtributo, String tipoAtributo, int tamanhoAtributo, T valor) {
        this.nomeAtributo = nomeAtributo;
        this.tipoAtributo = tipoAtributo;
        this.tamanhoAtributo = tamanhoAtributo;
        this.valor = valor;
    }

    public String getNomeAtributo() {
        return nomeAtributo;
    }

    public void setNomeAtributo(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public int getTamanhoAtributo() {
        return tamanhoAtributo;
    }

    public void setTamanhoAtributo(int tamanhoAtributo) {
        this.tamanhoAtributo = tamanhoAtributo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    public String getValorString(){
        return String.valueOf(valor);
    }
    
    public String tipoToString(){
        String tipo = "";
        if(this.valor instanceof String){
            tipo = "String";
        }else if(this.valor instanceof Integer){
            tipo = "Integer";
        }else if(this.valor instanceof Long){
            tipo = "Long";
        }else if(this.valor instanceof Double){
            tipo = "Double";
        }
        return tipo;
    }   
}
