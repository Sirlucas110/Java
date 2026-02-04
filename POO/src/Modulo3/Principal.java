package Modulo3;

public class Principal {
	public static void main(String[] args) {
		Carro meuCarro = new Carro(); // declaramos a variável e instanciamos a variável com um objeto do tipo Carro
		meuCarro.fabricante = "Fiat";
		meuCarro.cor = "Prata";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2005;
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.cor = "Branco";
		seuCarro.modelo = "Civic";
		seuCarro.anoDeFabricacao = 2020;
		
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Fabricante: " + meuCarro.fabricante);
		System.out.println("------------- ");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
		System.out.println("Cor: " + seuCarro.cor);
		System.out.println("Fabricante: " + seuCarro.fabricante);
	}

}
