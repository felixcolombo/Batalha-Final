package com.github.felixcolombo.entidades.armas;

import com.github.felixcolombo.entidades.Armas;

public class Machado extends Armas{
	
	private final double PODER_ARMA = 3;
	private final String ARTIGO_INDEFINIDO_ARMA = "seu";
	private final String COMPLEMENTO_ARMA = "com seu machado, acertando-o com bravura";
	
	public Machado(String armaSelecionada) {
		
		this.setPoderArma(PODER_ARMA);
		this.setArtigoIndefinidoArma(ARTIGO_INDEFINIDO_ARMA);
		this.setComplementoArma(COMPLEMENTO_ARMA);
	}

}
