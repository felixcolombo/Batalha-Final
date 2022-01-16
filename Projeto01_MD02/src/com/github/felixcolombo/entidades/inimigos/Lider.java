package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Lider extends Inimigos{
	
	private final String NOME_INIMIGO = "L�der";
	private final double PODER_INIMIGO = 40;
	private final double ATAQUE_INIMIGO = 45;
	private final double DEFESA_INIMIGO = 40;
	
	public Lider() {
		
		this.setNomeInimigo(NOME_INIMIGO);
		this.setPoderInimigo(PODER_INIMIGO);
		this.setAtaqueInimigo(ATAQUE_INIMIGO);
		this.setDefesaInimigo(DEFESA_INIMIGO);
	}
}