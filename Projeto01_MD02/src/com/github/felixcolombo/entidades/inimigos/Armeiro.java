package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.armas.Espada;

public class Armeiro extends Inimigos {
	
	private final String NOME_INIMIGO = "Armeiro";
	private final double PODER_INIMIGO = 200;
	private final double ATAQUE_INIMIGO = 60;
	private final double DEFESA_INIMIGO = 15;
	private final double PODER_ARMA_INIMIGO = Espada.getPODER_ARMA();
	
	public Armeiro() {
		
		Armeiro.setNomeInimigo(NOME_INIMIGO);
		Armeiro.setPoderInimigo(PODER_INIMIGO);
		Armeiro.setAtaqueInimigo(ATAQUE_INIMIGO);
		Armeiro.setDefesaInimigo(DEFESA_INIMIGO);
		Armeiro.setPoderArmaInimigo(PODER_ARMA_INIMIGO);
	}

}
