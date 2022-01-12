package com.github.felixcolombo.main;

import java.util.Scanner;

import com.github.felixcolombo.entidades.NivelDificuldade;

public class AppBatalhaFinal {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NivelDificuldade nivelDificuldade = new NivelDificuldade();
		
		System.out.println("Seja bem vindo(a) � BATALHA FINAL!\n");
		pause(700);
		
		System.out.println("-Vamos iniciar escolhendo o n�vel de dificuldade: ");
		pause(700);
		escolherNivel(nivelDificuldade);
		
	}

	public static double escolherNivel(NivelDificuldade nivelDificuldade) {
		
		boolean erro;
		String nivel;
		
		do {
			erro=false;
			
			String menu = "";
			menu += "    1 - F�cil \n";
			menu += "    2 - Normal \n";
			menu += "    3 - Dif�cil \n";
			
			System.out.println(menu);
			nivel= keyboard.next();
			
			if(!nivel.equals("1")&&!nivel.equals("2")&&!nivel.equals("3")) {
				System.out.println("Oops!! Escolha inv�lida!");
				System.out.println("Escolha entre as op��es abaixo:\n");
				erro=true;
			}
				
		}while(erro);
		
		double fatorNivel = nivelDificuldade.escolherNivel(nivel);
		return fatorNivel;
		
	}

}
