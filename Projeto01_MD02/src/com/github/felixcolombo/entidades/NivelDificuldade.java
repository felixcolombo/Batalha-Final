package com.github.felixcolombo.entidades;

import java.util.Scanner;

public class NivelDificuldade {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String nivelEscolhido;
	private static String nivel;
	
	public static void escolherNivel() {
		
		boolean erro;
			
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
			nivelEscolhido = "N�vel F�cil";
			break;
		case "2":
			nivelEscolhido = "N�vel Normal";
			break;
		case "3":
			nivelEscolhido = "N�vel Dif�cil";
			break;
		}
		
	}

	public static String getNivelDificuldade() {
		// TODO Auto-generated method stub
		return nivelEscolhido;
	}
		
}
	


