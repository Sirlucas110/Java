package Modulo5;

public class TesteConstrutor {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jaoo", 15);
		
		System.out.println("Nome: " + p1.nome + " tem " + p1.idade + " anos.");
		
		p1.idade = 25;
		
		
		
		System.out.println("Nome: " + p1.nome + " tem " + p1.idade + " anos.");
	}
}
