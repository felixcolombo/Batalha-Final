package com.github.felixcolombo.entidades.personagens;

import com.github.felixcolombo.entidades.Personagens;

public class Lenhador extends Personagens {
	
	private final double PODER_PERSONAGEM = 1000;
	private final double ATAQUE_PERSONAGEM = 70;
	private final double DEFESA_PERSONAGEM = 20;
	
	public Lenhador() {
		
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}
