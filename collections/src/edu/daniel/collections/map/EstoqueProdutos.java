package edu.daniel.collections.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto produto : estoqueProdutosMap.values()) {
				valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto produto : estoqueProdutosMap.values()) {
				if (produto.getPreco() > maiorPreco) {
					produtoMaisCaro = produto;
				}

			}
		}
		return produtoMaisCaro;
	}

	public static void main(String[] args) {

		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.exibirProdutos();
		System.out.println("-----------------------");

		estoque.adicionarProduto(1l, "Produto A", 10, 5.0);
		estoque.adicionarProduto(2l, "Produto B", 5, 10.0);
		estoque.adicionarProduto(3l, "Produto A", 2, 15.0);

		System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
		System.out.println("---------------------");
		System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

	}
}
