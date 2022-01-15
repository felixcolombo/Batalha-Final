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
			menu += "    1 - Fácil \n";
			menu += "    2 - Normal \n";
			menu += "    3 - Difícil";
			
			System.out.println(menu);
			nivel= keyboard.next();
			
			if(!nivel.equals("1")&&!nivel.equals("2")&&!nivel.equals("3")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções abaixo:\n");
				erro=true;
			}
				
		}while(erro);
		
		switch(nivel) {
		case "1":
			nivelEscolhido = "Nível Fácil";
			break;
		case "2":
			nivelEscolhido = "Nível Normal";
			break;
		case "3":
			nivelEscolhido = "Nível Difícil";
			break;
		}
		
	}

	public static String getNivelDificuldade() {
		// TODO Auto-generated method stub
		return nivelEscolhido;
	}
		
}
	


