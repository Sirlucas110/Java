package com.poo.financeiro;

public class Principal {
	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		
		imobiliaria.setNome("Negócios imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Lucas");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("05/02/2026");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compra do mês", 200, "05/02/2026");
		ContaPagar conta3 = new ContaPagar(mercado, "Parcela presente", 68, "10/05/2026");
		
		conta1.pagar();
		
		conta2.pagar();
		conta2.cancelar();
		
		conta3.cancelar();
		conta3.pagar();
	}
}
