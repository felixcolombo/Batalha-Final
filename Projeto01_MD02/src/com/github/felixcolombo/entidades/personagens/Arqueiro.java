package com.github.felixcolombo.entidades.personagens;

import com.github.felixcolombo.entidades.Personagens;

public class Arqueiro extends Personagens{
	
	private final double PODER_PERSONAGEM = 1200;
	private final double ATAQUE_PERSONAGEM = 60;
	private final double DEFESA_PERSONAGEM = 30;
	
	public Arqueiro() {
		
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}
