package com.poo.caixa;

import com.poo.impressao.Impressora;
import com.poo.impressao.impressoras.Epson;
import com.poo.pagamento.Cartao;
import com.poo.pagamento.Operadora;
import com.poo.pagamento.operadora.Cielo;

public class TesteCheckout {
	public static void main(String[] args) {
		Operadora operadora = new Cielo();
		Impressora impressora = new Epson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Joao");
		cartao.setNumeroCartao("123");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Joao");
		compra.setProduto("Sabao");
		compra.setValorTotal(56);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}
}
