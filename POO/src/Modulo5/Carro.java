package Modulo5;

import Modulo3.Proprietario;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	
	Proprietario dono;
	
	void alterarModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}
	
	void ligar() {
		System.out.println("Ligando o carro " + modelo);
	}
	
}
