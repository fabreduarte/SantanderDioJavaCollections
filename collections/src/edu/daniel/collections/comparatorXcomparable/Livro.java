package edu.daniel.collections.comparatorXcomparable;

import java.util.Comparator;

class Livro implements Comparable<Livro> {

	private String titulo;
	private String autor;
	private int ano;

	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	public int compareTo(Livro livro) {
		return titulo.compareTo(livro.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}

class CompararAutor implements Comparator<Livro> {
	public int compare(Livro livro1, Livro livro2) {
		return livro1.getAutor().compareTo(livro2.getAutor());
	}
}

class CompararAno implements Comparator<Livro> {
	public int compare(Livro livro1, Livro livro2) {
		if (livro1.getAno() < livro2.getAno())
			return -1;
		if (livro1.getAno() > livro2.getAno())
			return 1;
		else
			return 0;
	}
}

class CompararAnoAutorTitulo implements Comparator<Livro> {

	@Override
	public int compare(Livro livro1, Livro livro2) {
		int ano = Integer.compare(livro1.getAno(), livro2.getAno());
		if (ano != 0)
			return ano;
		int autor = livro1.getAutor().compareTo(livro2.getAutor());
		if (autor != 0)
			return autor;
		return livro1.getTitulo().compareTo(livro2.getTitulo());
	}

}
