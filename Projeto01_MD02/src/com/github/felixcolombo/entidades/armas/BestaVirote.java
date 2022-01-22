package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class BestaVirote extends Armas {
	
	private final static double PODER_ARMA = 6;
	private final String COMPLEMENTO_ARMA = "com seu virote arremessado por sua besta";
	
	public BestaVirote() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}

}
