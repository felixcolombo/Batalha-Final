package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Clava extends Armas {
	
	private final static double PODER_ARMA = 10;
	private final String COMPLEMENTO_ARMA = "com sua clava, acertando-o com bravura";
	
	public Clava() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}
	
}
