package Modulo3;

public class Principal6 {
	public static void main(String[] args) {
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 30);

		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Valor venda: " + preco.precoVenda);
	}
}
