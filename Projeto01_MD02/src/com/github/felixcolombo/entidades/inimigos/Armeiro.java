package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Armeiro extends Inimigos {
	
	private final String NOME_INIMIGO = "Armeiro";
	private final double PODER_INIMIGO = 100;
	private final double ATAQUE_INIMIGO = 5;
	private final double DEFESA_INIMIGO = 100;
	
	public Armeiro() {
		
		Inimigos.setNomeInimigo(NOME_INIMIGO);
		this.setPoderInimigo(PODER_INIMIGO);
		this.setAtaqueInimigo(ATAQUE_INIMIGO);
		this.setDefesaInimigo(DEFESA_INIMIGO);
	}

}
