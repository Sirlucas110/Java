package com.poo.financeiro;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.setFornecedor(fornecedor);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void pagar() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(getSituacaoConta())) {
			throw new OperacaoContaException("Uma conta não pode ser paga se já está paga" + this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			throw new OperacaoContaException("Uma conta não pode ser paga se já está cancfelada: " + this.getDescricao());
		} else {
			System.out
					.println("Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome());
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("\nConta a Pagar");
		System.out.println("===================================");
		System.out.println("Fornecedor: " + this.getFornecedor().getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Situação: " + this.getSituacaoConta());
		System.out.println("===================================");
		
	}
	
}
