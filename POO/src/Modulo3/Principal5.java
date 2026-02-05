package Modulo3;

public class Principal5 {
	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		
		double salario = folha.calcularSalario(160, 5, 32.4, 2);
		
		System.out.println("Sálario calculado: " + salario);
	}
}
