package com.github.felixcolombo.entidades;

import java.util.Scanner;

import com.github.felixcolombo.entidades.armas.Cajado;
import com.github.felixcolombo.entidades.armas.Machado;

public class Armas {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String armaSelecionada;
	private static String personagemSelecionado;
	private static double poderArma;
	private static double fatorArma;
	private static String artigoIndefinidoArma;
	private static String complementoArma;
	
	public static void escolherArma() {
		
		boolean erro;
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Cajado \n";
			menu += "    2 - Machado";
							
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
			armaSelecionada = "Cajado";
			Cajado cajado = new Cajado(armaSelecionada);
			break;
		case "2":
			armaSelecionada = "Machado";
			Machado machado = new Machado(armaSelecionada);
			break;
		}
		
		personagemSelecionado = Personagens.getPersonagemSelecionado();
		
		if(personagemSelecionado.equals("Mago")){
			switch(armaSelecionada) {
			case "Cajado":
				fatorArma = 1;
				break;
			case "Machado":
				fatorArma = 0.5;
				break;
				
			}
		}
		
		if(personagemSelecionado.equals("Lenhador")){
			switch(armaSelecionada) {
			case "Cajado":
				fatorArma = 0.5;
				break;
			case "Machado":
				fatorArma = 1;
				break;
				
			}
		}
		
	}

	public static String getArmaSelecionada() {
		return armaSelecionada;
	}

	public static void setArmaSelecionada(String armaSelecionada) {
		Armas.armaSelecionada = armaSelecionada;
	}

	public static double getPoderArma() {
		return poderArma;
	}

	public static void setPoderArma(double poderArma) {
		Armas.poderArma = poderArma;
	}

	public static double getFatorArma() {
		return fatorArma;
	}

	public static void setFatorArma(double fatorArma) {
		Armas.fatorArma = fatorArma;
	}

	public static String getArtigoIndefinidoArma() {
		return artigoIndefinidoArma;
	}

	public static void setArtigoIndefinidoArma(String artigoIndefinidoArma) {
		Armas.artigoIndefinidoArma = artigoIndefinidoArma;
	}

	public static String getComplementoArma() {
		return complementoArma;
	}

	public static void setComplementoArma(String complementoArma) {
		Armas.complementoArma = complementoArma;
	}
		
}

