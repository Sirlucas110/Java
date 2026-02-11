package Modulo5;

public class ClasseBancaria {
	
	private String titular;
	private int numero;

	private double saldo;
	
	public ClasseBancaria(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado com sucesso!");
		} else {
			System.out.println("Valor inválido para depósito.");
		}
	}
	

	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido para sacar.");
		} else if (valor > saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
	}
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}
}
