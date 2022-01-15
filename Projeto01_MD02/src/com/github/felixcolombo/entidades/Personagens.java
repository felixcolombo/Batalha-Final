package com.github.felixcolombo.entidades;

import java.util.Scanner;

import com.github.felixcolombo.entidades.personagens.avatares.Lenhador;
import com.github.felixcolombo.entidades.personagens.avatares.Mago;

public class Personagens {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String personagemSelecionado;
	private static double poderPersonagem;
	private double ataquePersonagem;
	private double defesaPersonagem;
		
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
			Mago mago = new Mago(personagemSelecionado);
			break;
		case "2":
			personagemSelecionado = "Lenhador";
			Lenhador lenhador = new Lenhador(personagemSelecionado);
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

	public double getAtaquePersonagem() {
		return ataquePersonagem;
	}

	public void setAtaquePersonagem(double ataquePersonagem) {
		this.ataquePersonagem = ataquePersonagem;
	}

	public double getDefesaPersonagem() {
		return defesaPersonagem;
	}

	public void setDefesaPersonagem(double defesaPersonagem) {
		this.defesaPersonagem = defesaPersonagem;
	}

}

	
