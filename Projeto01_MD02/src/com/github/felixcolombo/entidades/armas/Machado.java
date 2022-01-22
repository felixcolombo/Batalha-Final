package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Machado extends Armas{
	
	private final static double PODER_ARMA = 7;
	private final String COMPLEMENTO_ARMA = "com seu machado de guerra de lâmina dupla";
	
	public Machado() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}

}
