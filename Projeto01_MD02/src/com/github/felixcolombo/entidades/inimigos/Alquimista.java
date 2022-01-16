package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Alquimista extends Inimigos{
	
	private final String NOME_INIMIGO = "Alquimista";
	private final double PODER_INIMIGO = 120;
	private final double ATAQUE_INIMIGO = 7;
	private final double DEFESA_INIMIGO = 120;
	
	public Alquimista() {
		
		Inimigos.setNomeInimigo(NOME_INIMIGO);
		this.setPoderInimigo(PODER_INIMIGO);
		this.setAtaqueInimigo(ATAQUE_INIMIGO);
		this.setDefesaInimigo(DEFESA_INIMIGO);
	}

}
