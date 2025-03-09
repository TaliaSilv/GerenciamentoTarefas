package br.unifae.engsof.poo3.gerenciamentotarefas.model;

import java.time.LocalDate;

public class TarefaSimples extends Tarefa {

    public TarefaSimples() {
    }

    public TarefaSimples(String descricao, int prioridade, LocalDate dataCriacao) {
        super(descricao, prioridade, dataCriacao);
    }
}
