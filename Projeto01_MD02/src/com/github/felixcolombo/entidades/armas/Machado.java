package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Machado extends Armas{
	
	private final double PODER_ARMA = 3;
	private final String COMPLEMENTO_ARMA = "com seu machado, acertando-o com bravura";
	
	public Machado() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

}
