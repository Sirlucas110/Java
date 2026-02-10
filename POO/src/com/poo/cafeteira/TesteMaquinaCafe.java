package com.poo.cafeteira;

public class TesteMaquinaCafe {
	public static void main(String[] args) {
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.acucarDisponivel = 30;
		
		maquina.fazerCafe(20);
		maquina.fazerCafe(12);
		
		maquina.fazerCafe();
	}
}
