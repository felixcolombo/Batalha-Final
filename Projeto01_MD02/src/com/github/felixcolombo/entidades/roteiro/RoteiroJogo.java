package com.github.felixcolombo.entidades.roteiro;

import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemInicial;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemMotivacao;

public class RoteiroJogo {
	
	private static Boolean continuarDesistir;
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public static void roteiroJogo() {
		// TODO Auto-generated method stub
		MensagemInicial.mensagemInicial();
		pause(1000);
		
		System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:");
		pause(500);
		EscolhaMotivacao.escolherMotivacao();
		pause(500);
		
		MensagemMotivacao.exibirMensagemMotivacao();
		pause(500);
		
		EscolhaDesistirContinuar.escolherDesistirContinuar();
		continuarDesistir = EscolhaDesistirContinuar.isContinuar();
		if(!continuarDesistir) {
			System.out.println("\nFim de Jogo!!");
		}else {
			EscolhaAndarSaltarCorrer.escolherAndarSaltarCorrer();
						
		}
	}

}
