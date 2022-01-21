package com.github.felixcolombo.entidades;

import java.util.Scanner;

import com.github.felixcolombo.entidades.armas.ArcoFlecha;
import com.github.felixcolombo.entidades.armas.BestaVirote;
import com.github.felixcolombo.entidades.armas.Cajado;
import com.github.felixcolombo.entidades.armas.Clava;
import com.github.felixcolombo.entidades.armas.Espada;
import com.github.felixcolombo.entidades.armas.Livro;
import com.github.felixcolombo.entidades.armas.Machado;

public class Armas {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String escolha;
	private static String armaSelecionada;
	private static String personagemSelecionado;
	private static double poderArma;
	private static double fatorArma;
	private static String complementoArma;

	private static String nome;
	
	public static void escolherArma() {
		
		boolean erro;
		
		nome = NomeSexo.getNome();
		
		System.out.println("\n-"+nome+", escolha sua arma:");
		pause(500);
		
		do {
			erro=false;
				
			String menu = "\n";
			menu += "    1 - Cajado \n";
			menu += "    2 - Machado \n";
			menu += "    3 - Martelo \n";
			menu += "    4 - Espada \n";
			menu += "    5 - Livro \n";
			menu += "    6 - Clava \n";
			menu += "    7 - Espada ";
							
			System.out.println(menu);
			escolha= keyboard.next();
				
			if((!escolha.equals("1"))&&(!escolha.equals("2"))&&(!escolha.equals("3"))&&(!escolha.equals("4"))
					&&(!escolha.equals("5"))&&(!escolha.equals("6"))&&(!escolha.equals("7"))) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções abaixo:");
				erro=true;
			}
					
		}while(erro);
		
		
		switch(escolha) {
		case "1":
			armaSelecionada = "Cajado";
			new Cajado();
			break;
		case "2":
			armaSelecionada = "Machado";
			new Machado();
			break;
		case "3":
			armaSelecionada = "Arco e Flecha";
			new ArcoFlecha();
			break;
		case "4":
			armaSelecionada = "Besta e Virote";
			new BestaVirote();
			break;
		case "5":
			armaSelecionada = "Livro";
			new Livro();
			break;
		case "6":
			armaSelecionada = "Clava";
			new Clava();
			break;
		case "7":
			armaSelecionada = "Espada";
			new Espada();
			break;
		}
		
		personagemSelecionado = Personagens.getPersonagemSelecionado();
		
		if(personagemSelecionado.equals("Mago")){
			if((armaSelecionada.equals("Cajado"))||(armaSelecionada.equals("Livro"))) {
				fatorArma = 1;
				}else {
					fatorArma = 0.5;
				}
		}
		
		if(personagemSelecionado.equals("Lenhador")){
			if((armaSelecionada.equals("Machado"))||(armaSelecionada.equals("Clava"))) {
				fatorArma = 1;
				}else {
					fatorArma = 0.5;
				}
		}
		
		if(personagemSelecionado.equals("Arqueiro")){
			if((armaSelecionada.equals("Besta e Virote"))||(armaSelecionada.equals("Arco e Flecha"))) {
				fatorArma = 1;
				}else {
					fatorArma = 0.5;
				}
		}
		
		if(armaSelecionada.equals("Espada")) {
			fatorArma = 0.3;
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

	public static String getComplementoArma() {
		return complementoArma;
	}

	public static void setComplementoArma(String complementoArma) {
		Armas.complementoArma = complementoArma;
	}
		
}

