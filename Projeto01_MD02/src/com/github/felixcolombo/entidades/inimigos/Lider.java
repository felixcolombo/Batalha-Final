package com.github.felixcolombo.entidades.inimigos;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.armas.Machado;

public class Lider extends Inimigos{
	
	private final String NOME_INIMIGO = "Líder";
	private final double PODER_INIMIGO = 150;
	private final double ATAQUE_INIMIGO = 10;
	private final double DEFESA_INIMIGO = 150;
	private final double PODER_ARMA_INIMIGO = Machado.getPoderArma();
	
	public Lider() {
		
		Lider.setNomeInimigo(NOME_INIMIGO);
		Lider.setPoderInimigo(PODER_INIMIGO);
		Lider.setAtaqueInimigo(ATAQUE_INIMIGO);
		Lider.setDefesaInimigo(DEFESA_INIMIGO);
		Lider.setPoderArmaInimigo(PODER_ARMA_INIMIGO);
	}
}
