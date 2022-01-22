package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Espada extends Armas {
	
	private final static double PODER_ARMA = 9;
	private final String COMPLEMENTO_ARMA = "com sua espada de lâmina afiada";
	
	public Espada() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}

}
