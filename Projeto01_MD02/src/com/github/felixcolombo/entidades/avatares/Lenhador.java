package com.github.felixcolombo.entidades.avatares;

import com.github.felixcolombo.entidades.Personagens;

public class Lenhador extends Personagens {
	
	private final double PODER_PERSONAGEM = 80;
	private final double ATAQUE_PERSONAGEM = 60;
	private final double DEFESA_PERSONAGEM = 30;
	
	public Lenhador(String personagemSelecionado) {
		
		this.setPoderPersonagem(PODER_PERSONAGEM);
		this.setAtaquePersonagem(ATAQUE_PERSONAGEM);
		this.setDefesaPersonagem(DEFESA_PERSONAGEM);
	}
}
