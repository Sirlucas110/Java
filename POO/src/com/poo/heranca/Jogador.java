package com.poo.heranca;

// jogador é uma pessoa
public class Jogador extends Pessoa {

	protected boolean aindaJoga = false;

	public void dizerSeAindaJogo() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
}
