package com.github.felixcolombo.entidades.roteiro;

import java.util.Scanner;

import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemContinuar;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemDesistir;

public class EscolhaDesistirContinuar {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static boolean continuar;
	
	public static void escolherDesistirContinuar() {
		boolean erro;
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Desistir \n";
			menu += "    2 - Continuar";
							
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
			MensagemDesistir.exibirMensagemDesistir();
			continuar = false;
			break;
		case "2":
			MensagemContinuar.exibirMensagemContinuar();
			continuar = true;
			break;	
		}
	}

	public static boolean isContinuar() {
		return continuar;
	}

	public static void setContinuar(boolean continuar) {
		EscolhaDesistirContinuar.continuar = continuar;
	}

}
