package edu.daniel.collections.lists.carrinho;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CarrinhoDeCompras {

	List<Item> carrinhoCompras;

	public CarrinhoDeCompras() {
		this.carrinhoCompras = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.carrinhoCompras.add(item);
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if (!carrinhoCompras.isEmpty()) {
			for (Item item : carrinhoCompras) {
				if (item.getNome().equalsIgnoreCase(nome))
					itensParaRemover.add(item);
			}
			carrinhoCompras.removeAll(itensParaRemover);
		} else {
			System.out.println("Carrinho Vazio");
		}

	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!carrinhoCompras.isEmpty()) {
			for (Item item : carrinhoCompras) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeErrorException(null, "O carrinho está vazio");
		}
	}

	public void exibirItens() {
		if (!carrinhoCompras.isEmpty()) {
			System.out.println(this.carrinhoCompras);
		} else {
			System.out.println("Carrinho Vazio");
		}
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras{" + "itens = " + carrinhoCompras + '}';
	}

	public static void main(String[] args) {
		// Criando uma instância do carrinho de compras
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		// Adicionando itens ao carrinho
		carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
		carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
		carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
		carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

		// Exibindo os itens no carrinho
		carrinhoDeCompras.exibirItens();

		// Removendo um item do carrinho
		carrinhoDeCompras.removerItem("Lápis");

		// Exibindo os itens atualizados no carrinho
		carrinhoDeCompras.exibirItens();

		// Calculando e exibindo o valor total da compra
		System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
	}

}
