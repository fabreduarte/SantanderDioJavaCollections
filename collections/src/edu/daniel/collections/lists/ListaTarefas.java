package edu.daniel.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	public List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa tarefa : tarefaList) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();

		System.out.println("O número total é : " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 4");

		System.out.println("O número total é : " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 1");

		System.out.println("O número total é : " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();

	}

}
