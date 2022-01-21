package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Espada extends Armas {
	
	private final double PODER_ARMA = 3;
	private final String COMPLEMENTO_ARMA = "sua espada de lâmina afiada";
	
	public Espada() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

}
