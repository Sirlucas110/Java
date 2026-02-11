package Modulo5;

public class Principal {
	public static void main(String[] args) {
		ClasseBancaria cb = new ClasseBancaria("Lucas", 1235);
		cb.depositar(500);
		cb.sacar(410);
		
		System.out.println("Saldo atual: " + cb.getSaldo());
	}
}
