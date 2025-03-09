/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciamentotarefas.controller;

import br.unifae.engsof.poo3.gerenciamentotarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciamentotarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciamentotarefas.model.TarefaPrazo;
import br.unifae.engsof.poo3.gerenciamentotarefas.model.TarefaSimples;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author olive
 */
public class TarefaController {
    public boolean criarTarefaComPrazo(LocalDate prazo, String descricao, int prioridade, LocalDate dataCriacao){
        return GerenciaTarefas.cadastrar(new TarefaPrazo(prazo, descricao, prioridade, dataCriacao));
    }
    
    public boolean criarTarefaSimples(String descricao, int prioridade, LocalDate dataCriacao){
        return GerenciaTarefas.cadastrar(new TarefaSimples(descricao, prioridade, dataCriacao));
    }
    
    public void preencherTabela(JTable tabela){
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

        dtm.setRowCount(GerenciaTarefas.getInstance().size());
        tabela.setModel(dtm);

        int ordenacao = 0;

        for (int i = 0; i < GerenciaTarefas.getInstance().size(); i++) {
            Tarefa tarefa = GerenciaTarefas.getInstance().get(i);
            tabela.setValueAt(tarefa.getDescricao(), ordenacao, 0);
            tabela.setValueAt(tarefa.getPrioridade(), ordenacao, 1);
            tabela.setValueAt(tarefa.getDataCriacao(), ordenacao, 2);

            if (tarefa instanceof TarefaPrazo) {
                tabela.setValueAt(((TarefaPrazo) tarefa).getPrazo(), ordenacao, 3);
            } else {
                tabela.setValueAt(null, ordenacao, 3);
            }

            ordenacao += 1;
        }
    }
    
    public boolean excluirTarefa(Tarefa tarefa){
        return GerenciaTarefas.removeTarefas(tarefa);
    }
}
