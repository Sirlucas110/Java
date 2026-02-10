package com.poo.cafeteira;

public class MaquinaCafe {
	int acucarDisponivel;

	public void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente para fazer café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
		}
	}

	public void fazerCafe() {
		fazerCafe(10);
	}
}
