package com.github.felixcolombo.entidades;

import java.util.Scanner;

import com.github.felixcolombo.entidades.personagens.Arqueiro;
import com.github.felixcolombo.entidades.personagens.Lenhador;
import com.github.felixcolombo.entidades.personagens.Mago;

public class Personagens {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String personagemSelecionado;
	private static double poderPersonagem;
	private static double ataquePersonagem;
	private static double defesaPersonagem;
	
	private static String nome;
		
	public static void escolherPersonagem() {
		
		boolean erro;
		
		nome = NomeSexo.getNome();
		
		System.out.println("\n-"+nome+", escolha seu personagem:");
		pause(500);
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Mago \n";
			menu += "    2 - Lenhador \n";
			menu += "    3 - Arqueiro ";
							
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
			personagemSelecionado = "Mago";
			new Mago();
			break;
		case "2":
			personagemSelecionado = "Lenhador";
			new Lenhador();
			break;
		case "3":
			personagemSelecionado = "Arqueiro";
			new Arqueiro();
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

	
