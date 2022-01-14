package com.github.felixcolombo.entidades.personagens;

import com.github.felixcolombo.entidades.Personagens;

public class Mago extends Personagens {
	
	private final String PERSONAGEM = "Mago";
	private final double PODER_PERSONAGEM = 50;
	private final double ATAQUE_PERSONAGEM = 50;
	private final double DEFESA_PERSONAGEM = 30;
	
	public Mago() {
		
		this.setPersonagem(PERSONAGEM);
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}