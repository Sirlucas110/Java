package Modulo4;

public class TestesClassesWrapper {
	public static void main(String[] args) {
		int x = 5;
		Integer i = 5;
		
		byte y = i.byteValue();

		String valor = "15.5";
		Float v = Float.valueOf(valor);
		
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27");
		System.out.println("Daqui a 5 anos voce tera: " + (idade + 5) + " anos.");
		
		try {
			double custo = Double.parseDouble("Vinte e tres reais");
			System.out.println("Custo: " + custo);
		} catch (NumberFormatException e) {
			System.err.println("Número inválido para conversão.");
		}
	}
	
}
