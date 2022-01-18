package com.github.felixcolombo.entidades.roteiro.mensagens;

import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.RolamentoDados;

public class MensagemDanoPorAndar {
	
	public static void exibirMensagemDanoPorAndar() {
		
		System.out.println("As flechas que o acertaram causaram um dano de "
				+RolamentoDados.getValorDadosSorteado()+".\n"
				+ "Agora está com "+Personagens.getPoderPersonagem());
	}
}
