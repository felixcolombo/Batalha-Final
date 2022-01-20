package com.github.felixcolombo.entidades;

import java.util.Scanner;

public class NivelDificuldade {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static Scanner keyboard = new Scanner(System.in);
	private static double fatorNivelInimigo;
	private static double fatorNivelPersonagem;
	private static String nivel;
	
	public static void escolherNivel() {
		
		boolean erro;
		
		System.out.println("-Vamos iniciar escolhendo o n�vel de dificuldade: \n");
		pause(500);
		
		do {
			erro=false;
			
			String menu = "";
			menu += "    1 - F�cil \n";
			menu += "    2 - Normal \n";
			menu += "    3 - Dif�cil";
			
			System.out.println(menu);
			nivel= keyboard.next();
			
			if(!nivel.equals("1")&&!nivel.equals("2")&&!nivel.equals("3")) {
				System.out.println("Oops!! Escolha inv�lida!");
				System.out.println("Escolha entre as op��es abaixo:\n");
				erro=true;
			}
				
		}while(erro);
		
		switch(nivel) {
		case "1":
			fatorNivelInimigo = 0.8;
			fatorNivelPersonagem = 1;
			break;
		case "2":
			fatorNivelInimigo = 1;
			fatorNivelPersonagem = 1;
			break;
		case "3":
			fatorNivelInimigo = 1;
			fatorNivelPersonagem = 0.9;
			break;
		}
		
	}

	public static double getFatorNivelInimigo() {
		return fatorNivelInimigo;
	}

	public static void setFatorNivelInimigo(double fatorNivelInimigo) {
		NivelDificuldade.fatorNivelInimigo = fatorNivelInimigo;
	}

	public static double getFatorNivelPersonagem() {
		return fatorNivelPersonagem;
	}

	public static void setFatorNivelPersonagem(double fatorNivelPersonagem) {
		NivelDificuldade.fatorNivelPersonagem = fatorNivelPersonagem;
	}



}
	


