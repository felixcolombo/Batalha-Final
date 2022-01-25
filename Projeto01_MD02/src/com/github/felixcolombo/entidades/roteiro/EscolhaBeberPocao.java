package com.github.felixcolombo.entidades.roteiro;

import java.util.Scanner;

import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemBebeuPocao;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemNaoBebeuPocao;

public class EscolhaBeberPocao {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	
	public static void escolhaBeberPocao() {
		
		boolean erro;
		
		System.out.println("\nO que você deseja fazer?");
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Beber Poção \n";
			menu += "    2 - Não Beber Poção ";
							
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
			MensagemBebeuPocao.exibirMensagemBebeuPocao();
			RoteiroJogo.poderPersonagem = Personagens.getPoderPersonagem();
			break;
		
		case "2":
			MensagemNaoBebeuPocao.exibirMensagemNaoBebeuPocao();;
			break;	
		}
	}
}

