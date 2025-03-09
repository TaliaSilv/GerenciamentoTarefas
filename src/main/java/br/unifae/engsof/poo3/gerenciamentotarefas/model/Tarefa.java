package br.unifae.engsof.poo3.gerenciamentotarefas.model;

import java.time.LocalDate;


public abstract class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;
    private LocalDate dataCriacao;

    public Tarefa() {
    }

    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa:" + "descricao=" + descricao + ", concluida=" + concluida + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao;
    }

    @Override
    public boolean equals(Object obj) {
        //duas tarefas (objetos) sao iguais se
        //1 - tiverem o mesmo endereço
        if(!(super.equals(obj))) return false;
        
        //2 - se tiverem os mesmos valores no atributo
        if(!(obj instanceof Tarefa))
            return false;
        
        if(!(this.descricao.equals(
            ((Tarefa)obj).descricao)))
            return false;
            
        if((this.prioridade != ((Tarefa)obj).prioridade))
            return false;
                    
        if((this.concluida != ((Tarefa)obj).concluida))
            return false;
        
        if(!(this.dataCriacao.equals(
            ((Tarefa)obj).dataCriacao)))
            return false;
    
        return true;
    }
    
    
}
