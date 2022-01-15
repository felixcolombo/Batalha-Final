package com.github.felixcolombo.entidades.avatares;

import com.github.felixcolombo.entidades.Personagens;

public class Mago extends Personagens {
	
	private final double PODER_PERSONAGEM = 50;
	private final double ATAQUE_PERSONAGEM = 50;
	private final double DEFESA_PERSONAGEM = 30;
	
	public Mago(String personagemSelecionado) {
		
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}