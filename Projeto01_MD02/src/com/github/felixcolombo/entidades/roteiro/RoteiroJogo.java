package com.github.felixcolombo.entidades.roteiro;

import com.github.felixcolombo.entidades.Armas;
import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.combates.Combates;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemAposDerrotarAlquimista;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemAposDerrotarArmeiro;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemFinal;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemInicial;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemMotivacao;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaDireita;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaEsquerda;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPortaLider;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemSalaQuadrada;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemVitoria;

public class RoteiroJogo {
	
	private static Boolean continuarDesistir;
	private static Boolean vencedorCombate;
	private static int ordemCombate;
	
	public static double poderPersonagem;
	private static double ataquePersonagem;
	public static double defesaPersonagem;
	private static double poderArmaPersonagem;
	private static double fatorArmaPersonagem;
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public static void roteiroJogo() {
		// TODO Auto-generated method stub
		
		poderPersonagem = Personagens.getPoderPersonagem();
		ataquePersonagem = Personagens.getAtaquePersonagem();
		defesaPersonagem = Personagens.getDefesaPersonagem();
		poderArmaPersonagem = Armas.getPoderArma();
		fatorArmaPersonagem = Armas.getFatorArma();
		
		ExibirDadosPersonagens.exibirDadosPersonagens();
		
		MensagemInicial.mensagemInicial();
		pause(1000);
		
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
				
				ExibirDadosPersonagens.exibirDadosPersonagens();
				
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

					ExibirDadosPersonagens.exibirDadosPersonagens();
					
					EscolhaBeberPocao.escolhaBeberPocao();

					ExibirDadosPersonagens.exibirDadosPersonagens();
					
					MensagemPortaLider.exibirMensagemPortaLider();
					pause(500);
					
					ordemCombate=3;
					Inimigos.inimigos(ordemCombate);
					Combates.combate();
									
					vencedorCombate = Combates.isVencedorCombate();				
					
					if(!vencedorCombate) {
						System.out.println("\nFim de Jogo!!");
					}else {
						System.out.println("\nVocê Conseguiu!!!!\n");
						pause(500);
						
						MensagemVitoria.exibirMensagemVitoria();
						pause(500);
						
						MensagemFinal.exibirMensagemFinal();
						pause(500);
						
						System.out.println("\nFim de Jogo!!");
					}
				}
			}
		}
	}

	public static double getPoderPersonagem() {
		return poderPersonagem;
	}

	public static void setPoderPersonagem(double poderPersonagem) {
		RoteiroJogo.poderPersonagem = poderPersonagem;
	}

	public static double getAtaquePersonagem() {
		return ataquePersonagem;
	}

	public static void setAtaquePersonagem(double ataquePersonagem) {
		RoteiroJogo.ataquePersonagem = ataquePersonagem;
	}

	public static double getDefesaPersonagem() {
		return defesaPersonagem;
	}

	public static void setDefesaPersonagem(double defesaPersonagem) {
		RoteiroJogo.defesaPersonagem = defesaPersonagem;
	}

	public static double getPoderArmaPersonagem() {
		return poderArmaPersonagem;
	}

	public static void setPoderArmaPersonagem(double poderArmaPersonagem) {
		RoteiroJogo.poderArmaPersonagem = poderArmaPersonagem;
	}

	public static double getFatorArmaPersonagem() {
		return fatorArmaPersonagem;
	}

	public static void setFatorArmaPersonagem(double fatorArmaPersonagem) {
		RoteiroJogo.fatorArmaPersonagem = fatorArmaPersonagem;
	}

}