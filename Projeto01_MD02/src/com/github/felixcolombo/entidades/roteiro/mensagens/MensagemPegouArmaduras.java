package com.github.felixcolombo.entidades.roteiro.mensagens;

import com.github.felixcolombo.entidades.roteiro.ExibirDadosPersonagens;

public class MensagemPegouArmaduras {
	
	public static void exibirMensagemPegouArmaduras() {
		System.out.println("\nVoc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas\r\n"
				+ "pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala.\r\n"
				+ "De armadura nova, voc� se sente mais protegido para os desafios � sua frente.\n");
		
		ExibirDadosPersonagens.exibirDadosPersonagens();
				
	}
}
