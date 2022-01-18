package com.github.felixcolombo.entidades.roteiro;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.roteiro.combates.Combates;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemAposDerrotarAlquimista;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemAposDerrotarArmeiro;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemInicial;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemMotivacao;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaDireita;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaEsquerda;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaLider;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemSalaQuadrada;

public class RoteiroJogo {
	
	private static Boolean continuarDesistir;
	private static Boolean vencedorCombate;
	private static int ordemCombate;
	
	public static String nomeInimigo = Inimigos.getNomeInimigo();
	
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
			
			ordemCombate=1;
			Inimigos.inimigos(ordemCombate);
			Combates.combate(); 
			
			vencedorCombate = Combates.isVencedorCombate();
			if(!vencedorCombate) {
				System.out.println("\nFim de Jogo!!");
			}else {
				
				pause(500);
				MensagemAposDerrotarArmeiro.exibirMensagemAposDerrotarArmeiro();
				pause(500);
				
				EscolhaPegarArmadurasArmeiro.escolhaPegarArmadurasArmeiro();
				pause(500);
				
				MensagemPortaEsquerda.exibirMensagemPortaEsquerda();
				pause(500);
				
				ordemCombate=2;
				Inimigos.inimigos(ordemCombate);
				Combates.combate();
								
				vencedorCombate = Combates.isVencedorCombate();
				
				if(!vencedorCombate) {
					System.out.println("\nFim de Jogo!!");
				}else {
						
					pause(500);
					MensagemAposDerrotarAlquimista.exibirMensagemAposDerrotarAlquimista();
					pause(500);
					
					EscolhaBeberPocao.escolhaBeberPocao();
					pause(500);
					
					MensagemPortaLider.exibirMensagemPortaLider();
					pause(500);
					
					ordemCombate=3;
					Inimigos.inimigos(ordemCombate);
					Combates.combate();
									
					vencedorCombate = Combates.isVencedorCombate();				
					
					if(!vencedorCombate) {
						System.out.println("\nFim de Jogo!!");
					}else {
					
					}
					
					
				}
			}
			
		}
}

	public static String getNomeInimigo() {
		return nomeInimigo;
	}

	public static void setNomeInimigo(String nomeInimigo) {
		RoteiroJogo.nomeInimigo = nomeInimigo;
	}
}
