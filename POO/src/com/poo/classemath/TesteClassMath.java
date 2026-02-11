package com.poo.classemath;

import static java.lang.Math.PI;

public class TesteClassMath {
	
	
	public static void main(String[] args) {
		// Comprimento de circunferencia 2xrxoi
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println(comprimento);
		
		// Maximo e minimo
		double[] precoProdutoA = {30.20, 25.49};
		double maiorPreco = Math.max(precoProdutoA[0], precoProdutoA[1]);
		System.out.println("Maior preço: " + maiorPreco + " e Menor preço: "+ Math.min(precoProdutoA[0], precoProdutoA[1]));
		
		// Potência
		System.out.println("2^3: " +  Math.pow(2, 3));
		
		// Raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
	}
}
