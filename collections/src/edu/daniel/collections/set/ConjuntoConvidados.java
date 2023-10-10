package edu.daniel.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidados(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado convidado : convidadoSet) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = convidado;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}

	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

		conjuntoConvidados.adicionarConvidados("convidado 1", 1234);
		conjuntoConvidados.adicionarConvidados("convidado 1", 4566);
		conjuntoConvidados.adicionarConvidados("convidado 1", 1324);
		conjuntoConvidados.adicionarConvidados("convidado 1", 1111);
		conjuntoConvidados.adicionarConvidados("convidado 1", 1111);

		conjuntoConvidados.exibirConvidados();

		System.out.println("-----------------------------");

		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

		System.out.println("-----------------------------");

		conjuntoConvidados.removerConvidadoPorCodigoDoConvite(1234);

		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

	}

}
