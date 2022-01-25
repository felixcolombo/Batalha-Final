package com.github.felixcolombo.entidades.roteiro;

import java.util.Scanner;

import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemNaoPegouArmaduras;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemPegouArmaduras;

public class EscolhaPegarArmadurasArmeiro {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	
	public static void escolhaPegarArmadurasArmeiro() {
		
		boolean erro;
		
		System.out.println("O que voc� deseja fazer?");
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Pegar Armaduras \n";
			menu += "    2 - N�o Pegar Armaduras ";
							
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
			MensagemPegouArmaduras.exibirMensagemPegouArmaduras();
			RoteiroJogo.defesaPersonagem = RoteiroJogo.defesaPersonagem + 5;
			break;
		
		case "2":
			MensagemNaoPegouArmaduras.exibirMensagemNaoPegouArmaduras();
			break;	
		}
	}
}


