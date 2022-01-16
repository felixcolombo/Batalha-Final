package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Armeiro extends Inimigos {
	
	private final String NOME_INIMIGO = "Armeiro";
	private final double PODER_INIMIGO = 20;
	private final double ATAQUE_INIMIGO = 25;
	private final double DEFESA_INIMIGO = 20;
	
	public Armeiro() {
		
		this.setNomeInimigo(NOME_INIMIGO);
		this.setPoderInimigo(PODER_INIMIGO);
		this.setAtaqueInimigo(ATAQUE_INIMIGO);
		this.setDefesaInimigo(DEFESA_INIMIGO);
	}

}