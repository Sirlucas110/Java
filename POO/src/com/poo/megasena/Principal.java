package com.poo.megasena;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos jogos?");
		int quantidadeJogos = entrada.nextInt();

		System.out.println("----------------------------");
		
		for (int i = 1; i <= quantidadeJogos; i++) {
			Sorteio mega = new Sorteio();
			mega.sortear();
			mega.exibirNumeros();
			System.out.println("----------------------------");
		}
		
		System.out.println("*** Boa sorte! ***");
	}
}
