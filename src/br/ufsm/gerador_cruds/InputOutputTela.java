/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mikael
 */
public class InputOutputTela<T> {
    private String nomeEntidade;
    private Scanner entrada;
    
    public InputOutputTela (String nomeEntidade){
        this.nomeEntidade = nomeEntidade;
        this.entrada = new Scanner(System.in);
    }
    
    // leitura 
    public String leString(){
        String leitura;
        leitura = this.entrada.nextLine();
        return leitura;
    }
    
    public Long leLong(){
        Long leitura;
        leitura = Long.valueOf(this.entrada.nextLine());
        return leitura;
    }
    
    public Integer leInteger(){
        Integer leitura;
        leitura = Integer.valueOf(this.entrada.nextLine());
        return leitura;
    }
    
    public Double leDouble(){
        Double leitura;
        leitura = Double.valueOf(this.entrada.nextLine());
        return leitura;
    }
    
    //mensagens
    public void sucessoCadastro(){
        System.out.println(nomeEntidade + "Cadastrado(a) com sucesso!");
    }
           
    public void sucessoAlteracao(){
        System.out.println(nomeEntidade + "alterado(a) com sucesso!");
    }
    
    public void imprimirArrayList(ArrayList<T> linhas){
        if(linhas.size() > 0){
            for(T linha : linhas){
                System.out.print(linha+"\n");
            }
        }else{
            System.out.println("Nenhum(a) "+ this.nomeEntidade + " foi encontrado(a)");
        }
    }
    
    public void sucessoExclusao(){
        System.out.println(this.nomeEntidade + " excluido(a) com sucesso!");
    }
    
    public void exibe(String conteudo){
        System.out.println(conteudo);
    }
            
    public void imprimirList(ArrayList<String> linhas){
        for(String linha : linhas){
            System.out.print(linha);
        }
    }
}
