package com.github.felixcolombo.entidades;

import java.util.Scanner;

public class Personagens {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String personagem;
	private static String personagemSelecionado;
	private double poderPersonagem;
	private double ataquePersonagem;
	private double defesaPersonagem;
	private double poderArma;
	
	public static void escolherPersonagem() {
		
		boolean erro;
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Mago \n";
			menu += "    2 - Lenhador \n";
							
			System.out.println(menu);
			personagem= keyboard.next();
				
			if(!personagem.equals("1")&&!personagem.equals("2")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções abaixo:\n");
				erro=true;
			}
					
		}while(erro);
			
		switch(personagem) {
			case "1":
				personagemSelecionado = "Mago";
				break;
			case "2":
				personagemSelecionado = "Lenhador";
				break;
			}
		
	}
}

	
