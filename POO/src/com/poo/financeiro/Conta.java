package com.poo.financeiro;

public abstract class Conta {
	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta; 

	public abstract void exibirDetalhes();

	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() {
		if (SituacaoConta.PAGA.equals(getSituacaoConta())) {
			System.out.println("Uma conta não pode ser cancelada se já está paga: " + this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
			System.out.println("Uma conta não pode ser cancelada se já está cancelada: " + this.getDescricao());
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + " no valor de " + this.valor
					+ " e vencimento em " + this.getDataVencimento() + ". ");

			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public String getDescricao() {
		return descricao;
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
