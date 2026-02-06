package com.poo.treinador;

import com.poo.animal.Cachorro;

public class TreinadorCachorro {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Ellie");

		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);

	}
}
