package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Cajado extends Armas {
	
	private final double PODER_ARMA = 100;
	private final String ARTIGO_INDEFINIDO_ARMA = "seu";
	
	public Cajado (String armaSelecionada) {
		
		this.setPoderArma(PODER_ARMA);
		this.setArtigoIndefinidoArma(ARTIGO_INDEFINIDO_ARMA);
	}

}