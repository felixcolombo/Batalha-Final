package com.github.felixcolombo.entidades.roteiro.mensagens;

import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.EscolheuAndando;
import com.github.felixcolombo.entidades.roteiro.RolamentoDados;

public class MensagemDanoPorAndar {
	
	public static void exibirMensagemDanoPorAndar() {
		
		System.out.println("As flechas que o acertaram causaram um dano de "
		+RolamentoDados.getValorDadosSorteado()+".\n"
				+ "Inicialmente voc� tinha "+Personagens.getPoderPersonagem()+" de poder.\n"
						+ "Agora est� com "+EscolheuAndando.getPoderAtualizadoPersonagem());
	}
}
