package Modulo3;

public class Passeio {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Lucas";
		
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = "Joel";
		p1.cachorro.idade = 2;
		p1.cachorro.raca = "Pastor alemão";
		p1.cachorro.sexo = 'M';
		
		Caminhada c = new Caminhada();
		c.andar(p1);
	}
}
