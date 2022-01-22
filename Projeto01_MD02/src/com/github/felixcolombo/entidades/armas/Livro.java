package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Livro extends Armas {
	
	private final static double PODER_ARMA = 12;
	private final String COMPLEMENTO_ARMA = "absorvendo energia do livro com uma mão e liberando com a outra";
	
	public Livro() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

	public static double getPODER_ARMA() {
		return PODER_ARMA;
	}

}
