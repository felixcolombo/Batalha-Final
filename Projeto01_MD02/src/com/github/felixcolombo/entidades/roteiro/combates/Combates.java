package com.github.felixcolombo.entidades.roteiro.combates;

import java.util.Scanner;

import com.github.felixcolombo.entidades.Inimigos;
import com.github.felixcolombo.entidades.roteiro.RolamentoDados;
import com.github.felixcolombo.entidades.roteiro.RoteiroJogo;

public class Combates {
	
	private static String ordemCombate = RoteiroJogo.getOrdemCombate();
	private static String ordemAtaque;
	private static int parametroDados = 20;
	private static double valorDadosSorteado;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	private static String nomeInimigo = Inimigos.getNomeInimigo();
	private static double poderInimigo = Inimigos.getPoderInimigo();
	private static double ataqueInimigo = Inimigos.getAtaqueInimigo();
	private static double defesaInimigo = Inimigos.getDefesaInimigo();
	
	private static double poderPersonagem;
	private static double ataquePersonagem;
	private static double defesaPersonagem;
	
	private String vencedorCombate;
	
	public static void combate(){
		
		boolean fimCombate = false;
		boolean erroOrdemAtaque;
				
		do {
			erroOrdemAtaque = false;
			
			System.out.println("Você deseja atacar(1) ou esperar(2)?");
			ordemAtaque = keyboard.next();
			if(!ordemAtaque.equals("1")&&!ordemAtaque.equals("1")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções atacar(1) ou esperar(2):");
				erroOrdemAtaque=true;
			}
					
		}while(erroOrdemAtaque);
		
		do {
			switch(ordemAtaque) {
			case "1":
				personagemAtaca();
				break;
			case "2":
				inimigoAtaca();
				break;
			}
			
		}while(fimCombate);
		
		
	}
	
	public static void personagemAtaca() {
		
		RolamentoDados.rolarDados(parametroDados);
		valorDadosSorteado = RolamentoDados.getValorDadosSorteado();
		
		poderInimigo = poderInimigo-valorDadosSorteado-ataquePersonagem;
				
	}
	
	public static void inimigoAtaca() {
		
	}

}
