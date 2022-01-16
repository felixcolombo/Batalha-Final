package com.github.felixcolombo.entidades.roteiro.combates;

import java.util.Scanner;

import com.github.felixcolombo.entidades.Armas;
import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.NomeSexo;
import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.EscolhaAndarSaltarCorrer;
import com.github.felixcolombo.entidades.roteiro.EscolhaMotivacao;
import com.github.felixcolombo.entidades.roteiro.RolamentoDados;
import com.github.felixcolombo.entidades.roteiro.RoteiroJogo;

public class Combates {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static String ordemCombate = RoteiroJogo.getOrdemCombate();
	private static String ordemAtaque;
	private static int parametroDados = 20;
	private static double valorDadosSorteado;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	private static String nomeInimigo = Inimigos.getNomeInimigo();
	private static double poderInimigo = Inimigos.getPoderInimigo();
	private static double ataqueInimigo = Inimigos.getAtaqueInimigo();
	private static double defesaInimigo = Inimigos.getDefesaInimigo();
	
	private static double poderPersonagem = Personagens.getPoderPersonagem();
	private static double ataquePersonagem = Personagens.getAtaquePersonagem();
	private static double defesaPersonagem = Personagens.getDefesaPersonagem();
	
	private static String motivacaoPersonagem = EscolhaMotivacao.getMotivacaoEscolhida();
	
	private static String sexoSelecionado = NomeSexo.getSexo();
	private static String complementoSexo = NomeSexo.getComplementoSexo();
	
	private static double poderArma = Armas.getPoderArma();
	private static double fatorArma = Armas.getFatorArma();
	private static String complementoArma = Armas.getComplementoArma();
	
	private static boolean vencedorCombate;
	private static double danoAtaque;
	
	static boolean fimCombate=false;
	
	public static void combate(){
		
		boolean erroOrdemAtaque;
				
		do {
			
			erroOrdemAtaque = false;
			
			System.out.println("Voc� deseja atacar(1) ou esperar(2)?");
			ordemAtaque = keyboard.next();
			if(!ordemAtaque.equals("1")&&!ordemAtaque.equals("2")) {
				System.out.println("Oops!! Escolha inv�lida!");
				System.out.println("Escolha entre as op��es atacar(1) ou esperar(2):");
				erroOrdemAtaque=true;
			}
					
		}while(erroOrdemAtaque);
		
		do {
						
			RolamentoDados.rolarDados(parametroDados);
			valorDadosSorteado = RolamentoDados.getValorDadosSorteado();
						
			if(ordemAtaque.equals("1")) {
				pause(600);
				personagemAtaca();
				pause(600);
			
			} else if(ordemAtaque.equals("2")) {
				pause(600);
				inimigoAtaca();
				pause(600);

			}
			
		}while(!fimCombate);
		
		
	}
	
	public static void personagemAtaca() {
		if(valorDadosSorteado==1) {
			System.out.println("Voc� errou seu ataque! O "+nomeInimigo+" n�o sofreu dano algum.");
						
		}else if(valorDadosSorteado==20) {
			danoAtaque = valorDadosSorteado+ataquePersonagem+poderArma*fatorArma;
			poderInimigo = poderInimigo-danoAtaque;
			System.out.println("Voc� acertou um ataque cr�tico!");
			System.out.println("Voc� atacou "+complementoArma+" e causou "+danoAtaque+" de dano no "+nomeInimigo+"!");
		
		}else if((valorDadosSorteado>1) && (valorDadosSorteado<20)) {
			
			danoAtaque = defesaInimigo-valorDadosSorteado-ataquePersonagem-poderArma*fatorArma;
			poderInimigo = poderInimigo-danoAtaque;
			System.out.println("Voc� atacou "+complementoArma+" e causou "+danoAtaque+" de dano no "+nomeInimigo+"!");
		
		}
		
		if(poderInimigo>0) {
			ordemAtaque="2";
		
		}else {
			System.out.println("O "+nomeInimigo+" n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.");
			Personagens.poderPersonagem = poderPersonagem;
			vencedorCombate = true;
			fimCombate = true;
		}
				
	}
	
	public static void inimigoAtaca() {
		if(valorDadosSorteado==1) {
			System.out.println("O "+nomeInimigo+" errou o ataque! Voc� n�o sofreu dano.");
		
		}else if(valorDadosSorteado==20) {
			danoAtaque = valorDadosSorteado+ataqueInimigo;
			poderPersonagem = poderPersonagem-danoAtaque;
			System.out.println("O "+nomeInimigo+" acertou um ataque cr�tico!");
			System.out.println("O "+nomeInimigo+" atacou! Voc� sofreu "+danoAtaque+" de dano e agora possui "+poderPersonagem+" pontos de vida.");
		
		}else if((valorDadosSorteado>1) && (valorDadosSorteado<20)) {
			
			danoAtaque = defesaPersonagem-valorDadosSorteado-ataqueInimigo;
			poderPersonagem = poderPersonagem-danoAtaque;
			System.out.println("O "+nomeInimigo+" atacou! Voc� sofreu "+danoAtaque+" de dano e agora possui "+poderPersonagem+" pontos de vida.");
		
		}
		
		if(poderPersonagem>0) {
			
			String continuar;
			boolean erroEscolha;
			
			do {
				
				erroEscolha = false;
				
				System.out.println("Voc� deseja continuar(1) ou fujir(2)?");
				continuar = keyboard.next();
				if(!continuar.equals("1")&&!continuar.equals("2")) {
					System.out.println("Oops!! Escolha inv�lida!");
					System.out.println("Escolha entre as op��es continuar(1) ou fujir(2):");
					erroEscolha=true;
				}
						
			}while(erroEscolha);
			
			if(continuar.equals("1")) {
				ordemAtaque="1";
			}else {
				System.out.println("Voc� n�o estava preparado para a for�a do +"+nomeInimigo+", "
						+ "e decide fugir para que possa tentar novamente em uma pr�xima vez.");
				vencedorCombate = false;
				fimCombate = true;
			
			}
						
		}else if(poderPersonagem<=0) {
			System.out.println("Voc� n�o estava preparado para a for�a do +"+nomeInimigo+".");
			
			if(motivacaoPersonagem.equals("Vingan�a")) {
				System.out.println("N�o foi poss�vel concluir sua vingan�a, e agora resta saber se algu�m se vingar� por voc�.");
			
			}else if(motivacaoPersonagem.equals("Gl�ria")){
				System.out.println("A gl�ria que buscavas n�o ser� sua, "
						+ "e a cidade aguarda por "+complementoSexo+" "+sexoSelecionado+"!");
			}
			
			vencedorCombate = false;
			fimCombate = true;
		}
		
	}

	public static boolean isVencedorCombate() {
		return vencedorCombate;
	}

	public static void setVencedorCombate(boolean vencedorCombate) {
		Combates.vencedorCombate = vencedorCombate;
	}

}
