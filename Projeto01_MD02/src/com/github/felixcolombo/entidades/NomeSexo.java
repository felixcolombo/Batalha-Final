package com.github.felixcolombo.entidades;

import java.util.Scanner;

public class NomeSexo {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String nome;
	private static String sexo;
	private static String sexoSelecionado;
	private static String artigoIndefinidoSexo;
	private static String complementoSexo;
	
	public static void nomeSexo() {
				
		boolean erro;
		
		System.out.println("\n-Qual seu nome e sexo?\n");
		pause(500);
		
		System.out.println(" Nome:");
		setNome(keyboard.next());
		
		do {
			erro=false;
			
			String menu = "";
			menu += "    1 - Feminino \n";
			menu += "    2 - Masculino ";
						
			System.out.println(menu);
			sexo= keyboard.next();
			
			if(!sexo.equals("1")&&!sexo.equals("2")) {
				System.out.println("Oops!! Escolha inválida!");
				System.out.println("Escolha entre as opções abaixo:");
				erro=true;
			}
				
		}while(erro);
		
		switch(sexo) {
		case "1":
			sexoSelecionado = "Heróina";
			artigoIndefinidoSexo = "uma";
			complementoSexo = "sua próxima";
			break;
		case "2":
			sexoSelecionado = "Herói";
			artigoIndefinidoSexo = "um";
			complementoSexo = "seu próximo";
			break;
		}
		
	}

	public static String getSexo() {
		return sexoSelecionado;
	}
	
	public static void setSexo(String sexoSelecionado) {
		NomeSexo.sexoSelecionado = sexoSelecionado;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		NomeSexo.nome = nome;
	}

	public static String getArtigoIndefinidoSexo() {
		return artigoIndefinidoSexo;
	}

	public static void setArtigoIndefinidoSexo(String artigoIndefinidoSexo) {
		NomeSexo.artigoIndefinidoSexo = artigoIndefinidoSexo;
	}

	public static String getComplementoSexo() {
		return complementoSexo;
	}

	public static void setComplementoSexo(String complementoSexo) {
		NomeSexo.complementoSexo = complementoSexo;
	}
	
	
}

