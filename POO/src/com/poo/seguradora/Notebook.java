package com.poo.seguradora;

public class Notebook implements Seguravel{
	
	private double valorMercado;
	private String marca;
	
	public Notebook(double valorMercado, String marca) {
		this.valorMercado = valorMercado;
		this.marca = marca;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.04;
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook marca " + this.marca + " com valor de mercado de " + this.valorMercado;
		
	}

}
