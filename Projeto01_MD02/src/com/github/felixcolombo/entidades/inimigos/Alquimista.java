package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;

public class Alquimista extends Inimigos{
	
	private final String NOME_INIMIGO = "Alquimista";
	private final double PODER_INIMIGO = 120;
	private final double ATAQUE_INIMIGO = 7;
	private final double DEFESA_INIMIGO = 120;
	
	public Alquimista() {
		
		Alquimista.setNomeInimigo(NOME_INIMIGO);
		Alquimista.setPoderInimigo(PODER_INIMIGO);
		Alquimista.setAtaqueInimigo(ATAQUE_INIMIGO);
		Alquimista.setDefesaInimigo(DEFESA_INIMIGO);
	}

}
