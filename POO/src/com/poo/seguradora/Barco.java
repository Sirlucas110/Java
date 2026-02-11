package com.poo.seguradora;

public class Barco implements Seguravel {
	
	private double valorMercado;
	private int anoFabricacao;
	
	public Barco(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.06;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.95;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco ano " + this.anoFabricacao + " com valor de mercado de " + this.valorMercado;
		
	}

}
