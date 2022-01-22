package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class ArcoFlecha extends Armas{
	
	private final static double PODER_ARMA = 4;
	private final String COMPLEMENTO_ARMA = "com sua flecha certeira no alvo";
	
	public ArcoFlecha() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}

}
