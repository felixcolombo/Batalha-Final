package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Clava extends Armas {
	
	private final double PODER_ARMA = 3;
	private final String COMPLEMENTO_ARMA = "com sua clava, acertando-o com bravura";
	
	public Clava() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}
	

}
