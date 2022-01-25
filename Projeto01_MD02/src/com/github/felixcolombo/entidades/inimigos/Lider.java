package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.armas.Machado;

public class Lider extends Inimigos{
	
	private final String NOME_INIMIGO = "Líder";
	private final double PODER_INIMIGO = 900;
	private final double ATAQUE_INIMIGO = 80;
	private final double DEFESA_INIMIGO = 30;
	private final double PODER_ARMA_INIMIGO = Machado.getPODER_ARMA();
	
	public Lider() {
		
		Lider.setNomeInimigo(NOME_INIMIGO);
		Lider.setPoderInimigo(PODER_INIMIGO);
		Lider.setAtaqueInimigo(ATAQUE_INIMIGO);
		Lider.setDefesaInimigo(DEFESA_INIMIGO);
		Lider.setPoderArmaInimigo(PODER_ARMA_INIMIGO);
	}
}
