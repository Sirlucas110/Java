package com.poo.pagamento.operadora;

import com.poo.pagamento.Autorizavel;
import com.poo.pagamento.Cartao;
import com.poo.pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
			&& autorizavel.getValorTotal() < 100;
	}

}
