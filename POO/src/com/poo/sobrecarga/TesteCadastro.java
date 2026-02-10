package com.poo.sobrecarga;

public class TesteCadastro {
	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		Pessoa pessoa =  new Pessoa("Jose", 35);
		cadastro.cadastrar(pessoa);
		cadastro.cadastrar("Maria", 53);
	}
}
