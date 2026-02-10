package com.poo.abstrata;

public class TesteClasseAbstrata {
	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.descricao = "Leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "10/05/2028";
		
		p.imprimirDescricao();
	}
}
