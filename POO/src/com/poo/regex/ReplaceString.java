package com.poo.regex;

public class ReplaceString {
	public static void main(String[] args) {
		String texto = "O valor do produto é R$ @xxx@.";
		String novoTexto = texto.replaceAll("@x+@", "2,25");
		System.out.println(novoTexto);
	}
}
