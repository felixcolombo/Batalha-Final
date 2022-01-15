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
			menu += "    1 - Vingan�a \n";
			menu += "    2 - Gl�ria";
							
			System.out.println(menu);
			escolha= keyboard.next();
				
			if(!escolha.equals("1")&&!escolha.equals("2")) {
				System.out.println("Oops!! Escolha inv�lida!");
				System.out.println("Escolha entre as op��es abaixo:");
				erro=true;
			}
					
		}while(erro);
		
		switch(escolha) {
		case "1":
			MensagemVingaca.exibirMensagemVinganca();
			motivacaoEscolhida = "Vingan�a";
			break;
		case "2":
			MensagemGloria.exibirMensagemGloria();
			motivacaoEscolhida = "Gl�ria";
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
