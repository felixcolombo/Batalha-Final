package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Lider extends Inimigos{
	
	private final String NOME_INIMIGO = "Líder";
	private final double PODER_INIMIGO = 150;
	private final double ATAQUE_INIMIGO = 10;
	private final double DEFESA_INIMIGO = 150;
	
	public Lider() {
		
		Inimigos.setNomeInimigo(NOME_INIMIGO);
		Inimigos.setPoderInimigo(PODER_INIMIGO);
		Inimigos.setAtaqueInimigo(ATAQUE_INIMIGO);
		Inimigos.setDefesaInimigo(DEFESA_INIMIGO);
	}
}
