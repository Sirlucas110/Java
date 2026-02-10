package com.poo.financeiro;

public class RelatorioContas {
	public void exibirListagens(Conta[] contas) {
		System.out.println("*************************************");
		System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");
		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
		System.out.println("*************************************");
		System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");
	}
}
