package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Livro extends Armas {
	
	private final double PODER_ARMA = 3;
	private final String COMPLEMENTO_ARMA = "absorvendo energia do livro com uma mão e liberando com a outra";
	
	public Livro() {
		
		Armas.setPoderArma(PODER_ARMA);
		Armas.setComplementoArma(COMPLEMENTO_ARMA);
	}

}
