package com.github.felixcolombo.entidades.roteiro.mensagens;

import com.github.felixcolombo.entidades.roteiro.ExibirDadosPersonagens;

public class MensagemPegouArmaduras {
	
	public static void exibirMensagemPegouArmaduras() {
		System.out.println("\nVocê resolve usar os equipamentos do inimigo contra ele, e trocar algumas\r\n"
				+ "peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala.\r\n"
				+ "De armadura nova, você se sente mais protegido para os desafios à sua frente.\n");
		
		ExibirDadosPersonagens.exibirDadosPersonagens();
				
	}
}
