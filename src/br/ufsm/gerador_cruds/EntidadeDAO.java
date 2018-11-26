/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsm.gerador_cruds;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mikael
 */
public interface EntidadeDAO<T> {
    public void cadastrar (T obj);
    public void alterar (T obj);
    public void remover (T obj);
    public ArrayList<T> pesquisar(T obj);
    public ArrayList<T> imprimirTodos(); //algum tipo collection, etc...
    public ArrayList<T> resultadoConsulta(ResultSet obj);
}
