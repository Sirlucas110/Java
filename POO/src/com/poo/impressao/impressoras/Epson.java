package com.poo.impressao.impressoras;

import com.poo.impressao.Impressora;
import com.poo.impressao.Imprimivel;

public class Epson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println(imprimivel.getCorpoPagina());
		

	}

}
