package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Machado extends Armas{
	
	private final double PODER_ARMA = 100;
	private final String ARTIGO_INDEFINIDO_ARMA = "seu";
	
	public Machado(String armaSelecionada) {
		
		this.setPoderArma(PODER_ARMA);
		this.setArtigoIndefinidoArma(ARTIGO_INDEFINIDO_ARMA);
	}

}
