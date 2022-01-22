package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Cajado extends Armas {
	
	private final static double PODER_ARMA = 5;
	private final String COMPLEMENTO_ARMA = "com seu cajado, lançando uma bola de fogo";
	
	public Cajado () {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}

}
