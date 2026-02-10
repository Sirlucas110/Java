package com.poo.financeiro;

public class ContaPagar {
	private String descricao;
	private double valor;
	private String dataVencimento;
	Fornecedor fornecedor;
	private SituacaoConta situacaoConta;

	public ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this();

		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public void pagar() {
		if (SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Uma conta não pode ser paga se já está paga: " + this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Uma conta não pode ser paga se já está cancelada: " + this.getDescricao());
		} else {
			System.out
					.println("Pagando conta " + this.getDescricao() + " no valor de " + this.valor + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome());
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public void cancelar() {
		if (SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Uma conta não pode ser cancelada se já está paga: " + this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Uma conta não pode ser cancelada se já está cancelada: " + this.getDescricao());
		} else {
			System.out
			.println("Cancelando conta " + this.getDescricao() + " no valor de " + this.valor + " e vencimento em "
					+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome());
		
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public String getDescricao() {
		return descricao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
