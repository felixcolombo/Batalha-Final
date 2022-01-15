package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Alquimista extends Inimigos{
	
	private final double PODER_INIMIGO = 30;
	private final double ATAQUE_INIMIGO = 35;
	private final double DEFESA_INIMIGO = 30;
	
	public Alquimista() {
		
		this.setPoderInimigo(PODER_INIMIGO);
		this.setAtaqueInimigo(ATAQUE_INIMIGO);
		this.setDefesaInimigo(DEFESA_INIMIGO);
	}

}
