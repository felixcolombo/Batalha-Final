package com.github.felixcolombo.entidades.roteiro;

import java.util.Scanner;

import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemAndando;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemCorrendo;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemDanoPorAndar;
import com.github.felixcolombo.entidades.roteiro.mensagens.MensagemSaltando;

public class EscolhaAndarSaltarCorrer {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static double poderAtualPersonagem;
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public static void escolherAndarSaltarCorrer() {
		
		boolean erro;
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Andando \n";
			menu += "    2 - Saltando \n";
			menu += "    3 - Correndo ";
							
			System.out.println(menu);
			escolha= keyboard.next();
				
			if(!escolha.equals("1")&&!escolha.equals("2")&&!escolha.equals("3")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções abaixo:");
				erro=true;
			}
					
		}while(erro);
		
		switch(escolha) {
		case "1":
			MensagemAndando.exibirMensagemAndando();
			pause(500);
			EscolheuAndando.tomarDanoEcolheuAndando();
			poderAtualPersonagem = EscolheuAndando.getPoderAtualizadoPersonagem();
			MensagemDanoPorAndar.exibirMensagemDanoPorAndar();
			break;
		case "2":
			MensagemSaltando.exibirMensagemSaltando();
			poderAtualPersonagem = Personagens.getPoderPersonagem();
			break;	
		case "3":
			MensagemCorrendo.exibirMensagemCorrendo();
			poderAtualPersonagem = Personagens.getPoderPersonagem();
			break;
		}
	}

	public static double getPoderAtualPersonagem() {
		return poderAtualPersonagem;
	}

	public static void setPoderAtualPersonagem(double poderAtualPersonagem) {
		EscolhaAndarSaltarCorrer.poderAtualPersonagem = poderAtualPersonagem;
	}

}
