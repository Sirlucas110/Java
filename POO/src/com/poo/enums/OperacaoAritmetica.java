package com.poo.enums;

public enum OperacaoAritmetica {
	ADICAO {
		
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},
	SUBTRACAO {
		
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	};
	
	public abstract int operacao(int x, int y);
}
