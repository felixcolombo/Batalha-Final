package com.github.felixcolombo.entidades.roteiro;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.roteiro.combates.Combates;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemInicial;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemMotivacao;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaDireita;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemSalaQuadrada;

public class RoteiroJogo {
	
	private static Boolean continuarDesistir;
	private static String ordemCombate;
	
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
			pause(500);
			MensagemSalaQuadrada.exibirMensagemSalaQuadrada();
			MensagemPortaDireita.exibirMensagemPortaDireita();
			
			ordemCombate = "1";
			Inimigos.inimigos();
			Combates.combate(); 
				
		}
	}

	public static String getOrdemCombate() {
		return ordemCombate;
	}

	public static void setOrdemCombate(String ordemCombate) {
		RoteiroJogo.ordemCombate = ordemCombate;
	}

}
