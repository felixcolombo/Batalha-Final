package com.github.felixcolombo.entidades.roteiro.combates;

import java.util.Scanner;

import com.github.felixcolombo.entidades.Armas;
import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.NivelDificuldade;
import com.github.felixcolombo.entidades.NomeSexo;
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
	
	private static String motivacaoPersonagem;
	private static String complementoArma;
	private static String sexoSelecionado;
	private static String complementoSexo;
	
	private static String ordemAtaque;
	private static int parametroDados;
	private static double valorDadosSorteado;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	private static String nomeInimigo;
	private static double poderInimigo;
	private static double ataqueInimigo;
	private static double defesaInimigo;
	private static double fatorNivelInimigo;
	private static double poderArmaInimigo;
	private static double fatorArmaInimigo;
	
	private static double poderPersonagem;
	private static double ataquePersonagem;
	private static double defesaPersonagem;
	private static double fatorNivelPersonagem;
	private static double poderArmaPersonagem;
	private static double fatorArmaPersonagem;

	
	private static boolean vencedorCombate;
	private static double forcaAtaque;
	private static double danoAtaque;
	
	static boolean fimCombate=false;
	
	public static void combate(){
		
		parametroDados = 20;
		
		motivacaoPersonagem = EscolhaMotivacao.getMotivacaoEscolhida();
		sexoSelecionado = NomeSexo.getSexo();
		complementoSexo = NomeSexo.getComplementoSexo();
		poderArmaPersonagem = Armas.getPoderArma();
		fatorArmaPersonagem = Armas.getFatorArma();
		complementoArma = Armas.getComplementoArma();
		
		nomeInimigo = Inimigos.getNomeInimigo();
		poderInimigo = Inimigos.getPoderInimigo();
		ataqueInimigo = Inimigos.getAtaqueInimigo();
		defesaInimigo = Inimigos.getDefesaInimigo();
		poderArmaInimigo = Inimigos.getPoderArmaInimigo();
		fatorArmaInimigo = 1;
		
		poderPersonagem = RoteiroJogo.getPoderPersonagem();
		ataquePersonagem = RoteiroJogo.getAtaquePersonagem();
		defesaPersonagem = RoteiroJogo.getDefesaPersonagem();
		
		fatorNivelInimigo = NivelDificuldade.getFatorNivelInimigo();
		fatorNivelPersonagem = NivelDificuldade.getFatorNivelPersonagem();
		
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
			
			fimCombate = false;
						
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
			System.out.println("Voc� errou seu ataque! O "+nomeInimigo+" n�o sofreu dano algum.\n");
						
		}else if((valorDadosSorteado>1) && (valorDadosSorteado<=parametroDados)) {
			
			forcaAtaque = Ataque.calcularAtaque(valorDadosSorteado, ataquePersonagem, poderArmaPersonagem, fatorArmaPersonagem, fatorNivelPersonagem);
			
			if(valorDadosSorteado==parametroDados) {
				danoAtaque = forcaAtaque;
				System.out.println("Voc� acertou um ataque cr�tico!");
				
			}else {
				danoAtaque = DanoAtaque.danoAtaque(forcaAtaque, defesaInimigo);
			}
			
			poderInimigo = poderInimigo-danoAtaque;
			
			System.out.println("Voc� atacou "+complementoArma+" e causou "+danoAtaque+" de dano no "+nomeInimigo+"!"
				+ " Agora ele possui "+poderInimigo+" pontos de vida!\n");
		
		}
		
		if(poderInimigo>0) {
			ordemAtaque="2";
		
		}else {
			System.out.println("O "+nomeInimigo+" n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.");
			
			RoteiroJogo.poderPersonagem = poderPersonagem;
			vencedorCombate = true;
			fimCombate = true;
		}
				
	}
	
	public static void inimigoAtaca() {
		if(valorDadosSorteado==1) {
			System.out.println("O "+nomeInimigo+" errou o ataque! Voc� n�o sofreu dano.\n");
		
		}else if((valorDadosSorteado>1)&&(valorDadosSorteado<=parametroDados)) {
			
			forcaAtaque = Ataque.calcularAtaque(valorDadosSorteado, ataqueInimigo, poderArmaInimigo, fatorArmaInimigo, fatorNivelInimigo);
			
			if(valorDadosSorteado==parametroDados) {
				danoAtaque = forcaAtaque;
				System.out.println("O "+nomeInimigo+" acertou um ataque cr�tico!");
			
			}else {
				danoAtaque = DanoAtaque.danoAtaque(forcaAtaque, defesaPersonagem);
			}
			
			poderPersonagem = poderPersonagem-danoAtaque;
				
			System.out.println("O "+nomeInimigo+" atacou! Voc� sofreu "+danoAtaque+" de dano e agora possui "+poderPersonagem+" "
				+ "pontos de vida.\n");
		
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
				System.out.println("Voc� n�o estava preparado para a for�a do "+nomeInimigo+", "
						+ "e decide fugir para que possa tentar novamente em uma pr�xima vez.");
				
				vencedorCombate = false;
				fimCombate = true;
			
			}
						
		}else if(poderPersonagem<=0) {
			System.out.println("Voc� n�o estava preparado para a for�a do "+nomeInimigo+".");
			
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
