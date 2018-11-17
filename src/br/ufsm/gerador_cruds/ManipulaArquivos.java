/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author mikae
 */
public class ManipulaArquivos {

    public String caminho;

    public ManipulaArquivos() {
        //obter path do projeto
        this.caminho = null;
        this.caminho = System.getProperty("user.dir");
        this.caminho += "\\src\\br\\ufsm\\gerador_cruds\\";
    }

    public ArrayList<String> LeituraArquivo(String nomeArquivo) {
        ArrayList<String> linhas = null;
        File file = new File(this.caminho + nomeArquivo);
        if (file.exists()) {
            try {
                BufferedReader buffRead = new BufferedReader(new FileReader(this.caminho + nomeArquivo));
                String linha;
                try {
                    linha = buffRead.readLine();

                    if (linha != null) {
                        linhas = new ArrayList<String>();
                        while (linha != null) {
                            linhas.add(linha);
                            linha = buffRead.readLine();
                        }
                        buffRead.close();
                    } else {
                        linhas = new ArrayList<String>();
                        System.out.println("Aviso: Nenhuma Classe automatica encontrada");
                    }
                } catch (IOException ex) {
                    System.err.println("Erro: Não foi possivel ler o arquivo");
                }
            } catch (FileNotFoundException ex) {
                System.err.println("Erro:  Arquivo não encontrado");
            }
        } else {
            System.err.println("Erro:  Arquivo não encontrado");
        }
        return linhas;
    }

    public void gravarNoFinalDoArquivo(String nomeArquivo, String conteudo) {
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(this.caminho + nomeArquivo));

            if (conteudo != null) {
                buffWrite.append(conteudo + "\n");
                buffWrite.close();
            } else {
                System.out.println("Arquivo gerado com sucesso");
            }
        } catch (IOException ex) {
            System.err.println("Erro: Nao foi possivel criar o arquivo");
        }

    }

    public void sobrescreverArquivo(String nomeArquivo, String conteudo) {
        File file = new File(this.caminho + nomeArquivo);
        if (file.exists()) {
            file.delete();
       }
       gravarNoFinalDoArquivo(nomeArquivo, conteudo);
    }
}
