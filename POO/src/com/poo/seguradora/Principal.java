package com.poo.seguradora;

public class Principal {
	
		
		public static void main(String[] args) {
			CorretoraSeguros corretora = new CorretoraSeguros();
			
			Carro meuCarro = new Carro(45000d, 2012);
			Imovel minhaCasa = new Imovel(920000, 320);
			Barco meuBarco = new Barco(500000d, 2010);
			Notebook meuNotebook = new Notebook(3000, "Acer");
			
			corretora.fazerPropostaSeguro(meuCarro);
			corretora.fazerPropostaSeguro(minhaCasa);
			corretora.fazerPropostaSeguro(meuBarco);
			corretora.fazerPropostaSeguro(meuNotebook);
		}
		
	
}
