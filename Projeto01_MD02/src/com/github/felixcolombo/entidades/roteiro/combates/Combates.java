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
			
			System.out.println("Você deseja atacar(1) ou esperar(2)?");
			ordemAtaque = keyboard.next();
			if(!ordemAtaque.equals("1")&&!ordemAtaque.equals("2")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções atacar(1) ou esperar(2):");
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
			System.out.println("Você errou seu ataque! O "+nomeInimigo+" não sofreu dano algum.");
						
		}else if(valorDadosSorteado==20) {
			danoAtaque = valorDadosSorteado+ataquePersonagem+poderArma*fatorArma;
			poderInimigo = poderInimigo-danoAtaque;
			System.out.println("Você acertou um ataque crítico!");
			System.out.println("Você atacou "+complementoArma+" e causou "+danoAtaque+" de dano no "+nomeInimigo+"!");
		
		}else if((valorDadosSorteado>1) && (valorDadosSorteado<20)) {
			
			danoAtaque = defesaInimigo-valorDadosSorteado-ataquePersonagem-poderArma*fatorArma;
			poderInimigo = poderInimigo-danoAtaque;
			System.out.println("Você atacou "+complementoArma+" e causou "+danoAtaque+" de dano no "+nomeInimigo+"!");
		
		}
		
		if(poderInimigo>0) {
			ordemAtaque="2";
		
		}else {
			System.out.println("O "+nomeInimigo+" não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
			Personagens.poderPersonagem = poderPersonagem;
			vencedorCombate = true;
			fimCombate = true;
		}
				
	}
	
	public static void inimigoAtaca() {
		if(valorDadosSorteado==1) {
			System.out.println("O "+nomeInimigo+" errou o ataque! Você não sofreu dano.");
		
		}else if(valorDadosSorteado==20) {
			danoAtaque = valorDadosSorteado+ataqueInimigo;
			poderPersonagem = poderPersonagem-danoAtaque;
			System.out.println("O "+nomeInimigo+" acertou um ataque crítico!");
			System.out.println("O "+nomeInimigo+" atacou! Você sofreu "+danoAtaque+" de dano e agora possui "+poderPersonagem+" pontos de vida.");
		
		}else if((valorDadosSorteado>1) && (valorDadosSorteado<20)) {
			
			danoAtaque = defesaPersonagem-valorDadosSorteado-ataqueInimigo;
			poderPersonagem = poderPersonagem-danoAtaque;
			System.out.println("O "+nomeInimigo+" atacou! Você sofreu "+danoAtaque+" de dano e agora possui "+poderPersonagem+" pontos de vida.");
		
		}
		
		if(poderPersonagem>0) {
			
			String continuar;
			boolean erroEscolha;
			
			do {
				
				erroEscolha = false;
				
				System.out.println("Você deseja continuar(1) ou fujir(2)?");
				continuar = keyboard.next();
				if(!continuar.equals("1")&&!continuar.equals("2")) {
					System.out.println("Oops!! Escolha inválida!");
					System.out.println("Escolha entre as opções continuar(1) ou fujir(2):");
					erroEscolha=true;
				}
						
			}while(erroEscolha);
			
			if(continuar.equals("1")) {
				ordemAtaque="1";
			}else {
				System.out.println("Você não estava preparado para a força do +"+nomeInimigo+", "
						+ "e decide fugir para que possa tentar novamente em uma próxima vez.");
				vencedorCombate = false;
				fimCombate = true;
			
			}
						
		}else if(poderPersonagem<=0) {
			System.out.println("Você não estava preparado para a força do +"+nomeInimigo+".");
			
			if(motivacaoPersonagem.equals("Vingança")) {
				System.out.println("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");
			
			}else if(motivacaoPersonagem.equals("Glória")){
				System.out.println("A glória que buscavas não será sua, "
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
