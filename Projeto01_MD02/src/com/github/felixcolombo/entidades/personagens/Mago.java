package com.github.felixcolombo.entidades.personagens;

import com.github.felixcolombo.entidades.Personagens;

public class Mago extends Personagens {
	
	private final double PODER_PERSONAGEM = 1100;
	private final double ATAQUE_PERSONAGEM = 65;
	private final double DEFESA_PERSONAGEM = 15;
	
	public Mago() {
		
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}