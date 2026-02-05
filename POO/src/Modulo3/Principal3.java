package Modulo3;

public class Principal3 {
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Celta";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Tiggo";
		
		meuCarro.ligar();
		seuCarro.ligar();
		
		
	}
}
