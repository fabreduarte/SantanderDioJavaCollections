package edu.daniel.collections.lists.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}

	public void adicionarLivros(String titulo, String autor, int anoPublicao) {
		livrosList.add(new Livro(titulo, autor, anoPublicao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livrosList.isEmpty()) {
			for (Livro livro : livrosList) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}

		} else {
			System.out.println("Lista de livros Vazia");
		}
		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorAno(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livrosList.isEmpty()) {
			for (Livro livro : livrosList) {
				if (livro.getAnoPublicao() >= anoInicial && livro.getAnoPublicao() <= anoFinal) {
					livrosPorIntervaloAnos.add(livro);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPortitulo = null;
		if (!livrosList.isEmpty()) {
			for (Livro livro : livrosList) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPortitulo = livro;
					break;
				}
			}
		}
		return livroPortitulo;
	}

	public static void main(String[] args) {

		CatalogoLivros catalogoLivros = new CatalogoLivros();

		catalogoLivros.adicionarLivros("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
		catalogoLivros.adicionarLivros("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogoLivros.adicionarLivros("Código Limpo", "Robert C. Martin", 2009);
		catalogoLivros.adicionarLivros("O Codificador Limpo", "Robert C. Martin", 2012);

		System.out.println(catalogoLivros.pesquisarPorAutor("Susan J. Fowler"));

		System.out.println(catalogoLivros.pesquisarPorAno(2000, 2020));

		System.out.println(catalogoLivros.pesquisarPorTitulo("Microsserviços Prontos Para a Produção"));

	}

}
