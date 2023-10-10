package edu.daniel.collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}

	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}

	public static void main(String[] args) {

		AgendaContatos agendaContatos = new AgendaContatos();

		agendaContatos.adicionarContato("Camila", 12312312);
		agendaContatos.adicionarContato("Camila", 12312312);
		agendaContatos.adicionarContato("Camila", 11111);
		agendaContatos.adicionarContato("Camile", 122312);
		agendaContatos.adicionarContato("Camili", 123112);
		agendaContatos.adicionarContato("Camilu", 123123);
		agendaContatos.adicionarContato("Camilo", 1231232);

		agendaContatos.exibirContato();

	}

}
