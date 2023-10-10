package edu.daniel.collections.set.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}

	public void adicionarContatos(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		System.out.println(contatoSet);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato contato : contatoSet) {
			if (contato.getNome().startsWith(nome)) {
				contatosPorNome.add(contato);
			}
		}
		return contatosPorNome;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato contato : contatoSet) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(novoNumero);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}

	public static void main(String[] args) {

		AgendaContatos agendaContatos = new AgendaContatos();

		agendaContatos.exibirContatos();

		agendaContatos.adicionarContatos("João", 123456789);
		agendaContatos.adicionarContatos("Maria", 987654321);
		agendaContatos.adicionarContatos("Maria Fernandes", 55555555);
		agendaContatos.adicionarContatos("Ana", 88889999);
		agendaContatos.adicionarContatos("Fernando", 77778888);
		agendaContatos.adicionarContatos("Carolina", 55555555);

		agendaContatos.exibirContatos();

		System.out.println(agendaContatos.pesquisarPorNome("Maria"));

		System.out.println("Contato Atualizado : " + agendaContatos.atualizarNumeroContato("Maria", 123123213));

		System.out.println("----------------------");
		agendaContatos.exibirContatos();

	}

}
