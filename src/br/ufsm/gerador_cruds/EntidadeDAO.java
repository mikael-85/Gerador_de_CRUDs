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
public interface EntidadeDAO {
    public void cadastrar (Object obj);
    public void alterar (Object obj);
    public void remover (Object obj);
    public ArrayList<Object> pesquisar(Object obj);
    public ArrayList<Object> imprimirTodos(); //algum tipo collection, etc...
}
