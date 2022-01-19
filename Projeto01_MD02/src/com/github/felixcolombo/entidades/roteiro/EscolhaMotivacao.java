package com.github.felixcolombo.entidades.roteiro;

import java.util.Scanner;

import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemGloria;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemVingaca;

public class EscolhaMotivacao {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String motivacaoEscolhida;
	
	public static void escolherMotivacao() {
		// TODO Auto-generated method stub
		boolean erro;
		
		System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:");
		pause(500);
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Vingança \n";
			menu += "    2 - Glória";
							
			System.out.println(menu);
			escolha= keyboard.next();
				
			if(!escolha.equals("1")&&!escolha.equals("2")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções abaixo:");
				erro=true;
			}
					
		}while(erro);
		
		switch(escolha) {
		case "1":
			MensagemVingaca.exibirMensagemVinganca();
			motivacaoEscolhida = "Vingança";
			break;
		case "2":
			MensagemGloria.exibirMensagemGloria();
			motivacaoEscolhida = "Glória";
			break;	
		}
		
	}

	public static String getMotivacaoEscolhida() {
		return motivacaoEscolhida;
	}

	public static void setMotivacaoEscolhida(String motivacaoEscolhida) {
		EscolhaMotivacao.motivacaoEscolhida = motivacaoEscolhida;
	}

}
