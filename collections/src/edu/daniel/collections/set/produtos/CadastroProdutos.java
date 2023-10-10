package edu.daniel.collections.set.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutoPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}

	public Set<Produto> exibirPorPreço() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new CompartorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}

	public static void main(String[] args) {

		CadastroProdutos cadastroProdutos = new CadastroProdutos();

		cadastroProdutos.adicionarProduto(1L, "produto 7", 15d, 5);
		cadastroProdutos.adicionarProduto(2L, "produto 2", 10d, 13);
		cadastroProdutos.adicionarProduto(4L, "produto 1", 1d, 50);
		cadastroProdutos.adicionarProduto(1L, "produto 4", 15d, 5);

		System.out.println(cadastroProdutos.produtoSet);
		System.out.println(cadastroProdutos.produtoSet.size());

		System.out.println("-------------------");

		System.out.println(cadastroProdutos.exibirProdutoPorNome());

		System.out.println(cadastroProdutos.exibirPorPreço());

	}

}
