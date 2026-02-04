package Modulo3;

public class PetShop {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Caramelo";
		cachorro.raca = "Pastor Alemão";
		cachorro.sexo = 'M';
		cachorro.idade = 2;
		
		Cachorro cachorra = new Cachorro();
		
		cachorra.nome = "Ellie";
		cachorra.raca = "Bull Terrier";
		cachorra.sexo = 'F';
		cachorra.idade = 2;
		
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("------------- ");
		System.out.println("Nome: " + cachorra.nome);
		System.out.println("Raça: " + cachorra.raca);
		System.out.println("Sexo: " + cachorra.sexo);
		System.out.println("Idade: " + cachorra.idade);
		
	}
}
