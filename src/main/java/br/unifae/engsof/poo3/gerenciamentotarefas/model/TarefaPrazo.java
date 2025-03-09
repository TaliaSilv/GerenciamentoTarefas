package br.unifae.engsof.poo3.gerenciamentotarefas.model;

import java.time.LocalDate;


public class TarefaPrazo extends Tarefa {
    private LocalDate prazo;

    public TarefaPrazo() {
    }

    public TarefaPrazo(LocalDate prazo, String descricao, int prioridade, LocalDate dataCriacao) {
        super(descricao, prioridade, dataCriacao);
        this.prazo = prazo;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return super.toString() + ", prazo=" + prazo;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            if(this.prazo.equals(
                ((TarefaPrazo)obj).prazo))
                return true;
        }
        return false; 
    }
    
    
}
