package com.github.felixcolombo.entidades.roteiro.mensagens;

import com.github.felixcolombo.entidades.roteiro.EscolhaMotivacao;

public class MensagemVitoria {
	
	public static String motivacaoEscolhida;
	
	public static void exibirMensagemVitoria() {
		motivacaoEscolhida = EscolhaMotivacao.getMotivacaoEscolhida();
		
		switch(motivacaoEscolhida) {
		case "Vingan�a":
			System.out.println("Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma\r\n"
					+ "sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc�\r\n"
					+ "pode seguir sua vida.");
			break;
		case "Gl�ria":
			System.out.println("O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de\r\n"
					+ "alegria. A gl�ria o aguarda, voc� a conquistou.");
			break;
		}
	}

}
