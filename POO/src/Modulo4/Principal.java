package Modulo4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos produtos? ");
		int quantidadeProdutos = entrada.nextInt();
		
		entrada.nextLine();
		
		Estoque estoque = new Estoque();
		
		estoque.produtos = new Produto[quantidadeProdutos];
		
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\nProduto " + i);
			System.out.println("------------------------");
			
			System.out.print("Descrição:");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.print("Quantidade de itens:");			
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
		
	}
}
