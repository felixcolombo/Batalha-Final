package com.github.felixcolombo.entidades.personagens;

import com.github.felixcolombo.entidades.Personagens;

public class Arqueiro extends Personagens{
	
	private final double PODER_PERSONAGEM = 1500;
	private final double ATAQUE_PERSONAGEM = 10;
	private final double DEFESA_PERSONAGEM = 100;
	
	public Arqueiro() {
		
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}
