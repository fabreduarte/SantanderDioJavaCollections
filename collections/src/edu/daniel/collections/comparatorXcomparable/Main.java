package edu.daniel.collections.comparatorXcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("------------------------------------");
		ArrayList<Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("Java - Guia do Programador", "Peter Parker", 1999));
				add(new Livro("Batatinha quando nasce", "Banana a Split", 1900));
				add(new Livro("Escola dos Maluco", "O joão Grandão", 1230));
				add(new Livro("Festa no céu", "Jesus Cristo", 1));
				add(new Livro("Ae mano que loco", "Daniel Fabre", 2023));
			}
		};

		System.out.println("Livros após ordenação natural (Titulo): ");
		Collections.sort(livros);
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " + livro.getAutor() + -+livro.getAno());

		}

		System.out.println("------------------------------------");

		System.out.println("Livros após ordenação por ano: ");
		Collections.sort(livros, new CompararAno());
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " + livro.getAutor() + -+livro.getAno());
		}

		System.out.println("------------------------------------");

		System.out.println("Livros após ordenação por autor: ");
		Collections.sort(livros, new CompararAutor());
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " + livro.getAutor() + -+livro.getAno());
		}

		System.out.println("------------------------------------");

	}

}
