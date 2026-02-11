package com.poo.strings;

public class TesteStrings {
	public static void main(String[] args) {
		String s = "Olá";
		s += " Pessoal";
		System.out.println(s);
		
		StringBuilder SB = new StringBuilder("Olá");
		SB.append("Pessola!");
		String resultado = SB.toString();
		System.out.println(resultado);
	}
}
