package Modulo5;

public class TesteEncapsulamento {
	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		ar.trocarTemperatura(21);
		
		System.out.println("Temperatura: " + ar.obterTemperatura() + "º");
		
		ar.trocarTemperatura(10);
		
		System.out.println("Temperatura: " + ar.obterTemperatura() + "º");
	}
}
