package br.unifae.engsof.poo3.gerenciamentotarefas.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciaTarefas {

    private static List<Tarefa> tarefas;

    private GerenciaTarefas() {}

    public static List<Tarefa> getInstance() {
        if (tarefas == null) {
            tarefas = new ArrayList<>();
        }
        return tarefas;
    }

    public static boolean cadastrar(Tarefa tarefa) {
        if (tarefa != null) {
            if (getInstance() != null && !tarefas.contains(tarefa)) {
                return tarefas.add(tarefa);
            }
        }
        return false;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    
    public static boolean removeTarefas(Tarefa tarefa) {
        if (tarefa != null) {
            return tarefas.remove(tarefa);
        }
        return false;
    }
}
