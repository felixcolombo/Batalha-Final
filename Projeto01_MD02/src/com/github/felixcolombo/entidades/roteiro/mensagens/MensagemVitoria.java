package com.github.felixcolombo.entidades.roteiro.mensagens;

import com.github.felixcolombo.entidades.roteiro.EscolhaMotivacao;

public class MensagemVitoria {
	
	public static String motivacaoEscolhida;
	
	public static void exibirMensagemVitoria() {
		motivacaoEscolhida = EscolhaMotivacao.getMotivacaoEscolhida();
		
		switch(motivacaoEscolhida) {
		case "Vingança":
			System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\r\n"
					+ "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\r\n"
					+ "pode seguir sua vida.");
			break;
		case "Glória":
			System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\r\n"
					+ "alegria. A glória o aguarda, você a conquistou.");
			break;
		}
	}

}
