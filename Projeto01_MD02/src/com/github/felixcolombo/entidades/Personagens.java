package com.github.felixcolombo.entidades;

import java.util.Scanner;

import com.github.felixcolombo.entidades.personagens.Lenhador;
import com.github.felixcolombo.entidades.personagens.Mago;

public class Personagens {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String personagemSelecionado;
	private static double poderPersonagem;
	private static double ataquePersonagem;
	private static double defesaPersonagem;
		
	public static void escolherPersonagem() {
		
		boolean erro;
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Mago \n";
			menu += "    2 - Lenhador";
							
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
			personagemSelecionado = "Mago";
			new Mago();
			break;
		case "2":
			personagemSelecionado = "Lenhador";
			new Lenhador();
			break;
		}
					
	}
	
	public static String getPersonagemSelecionado() {
		return personagemSelecionado;
	}

	public static void setPersonagemSelecionado(String personagemSelecionado) {
		Personagens.personagemSelecionado = personagemSelecionado;
	}

	public static double getPoderPersonagem() {
		return poderPersonagem;
	}

	public void setPoderPersonagem(double poderPersonagem) {
		Personagens.poderPersonagem = poderPersonagem;
	}

	public static double getAtaquePersonagem() {
		return ataquePersonagem;
	}

	public void setAtaquePersonagem(double ataquePersonagem) {
		Personagens.ataquePersonagem = ataquePersonagem;
	}

	public static double getDefesaPersonagem() {
		return defesaPersonagem;
	}

	public void setDefesaPersonagem(double defesaPersonagem) {
		Personagens.defesaPersonagem = defesaPersonagem;
	}

}

	
