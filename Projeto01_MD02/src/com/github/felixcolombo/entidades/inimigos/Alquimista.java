package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.armas.Cajado;

public class Alquimista extends Inimigos{
	
	private final String NOME_INIMIGO = "Alquimista";
	private final double PODER_INIMIGO = 500;
	private final double ATAQUE_INIMIGO = 70;
	private final double DEFESA_INIMIGO = 20;
	private final double PODER_ARMA_INIMIGO = Cajado.getPODER_ARMA();
	
	public Alquimista() {
		
		Alquimista.setNomeInimigo(NOME_INIMIGO);
		Alquimista.setPoderInimigo(PODER_INIMIGO);
		Alquimista.setAtaqueInimigo(ATAQUE_INIMIGO);
		Alquimista.setDefesaInimigo(DEFESA_INIMIGO);
		Alquimista.setPoderArmaInimigo(PODER_ARMA_INIMIGO);
	}

}
