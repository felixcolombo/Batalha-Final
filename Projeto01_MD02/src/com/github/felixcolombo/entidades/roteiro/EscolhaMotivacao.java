package com.github.felixcolombo.entidades.roteiro;

import java.util.Scanner;

import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemGloria;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemVingaca;

public class EscolhaMotivacao {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String motivacaoEscolhida;
	
	public static void escolherMotivacao() {
		// TODO Auto-generated method stub
		boolean erro;
		
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
