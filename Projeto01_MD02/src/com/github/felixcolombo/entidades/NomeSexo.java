package com.github.felixcolombo.entidades;

import java.util.Scanner;

public class NomeSexo {
	
	private static Scanner keyboard = new Scanner(System.in);
	private static String nome;
	private static String sexo;
	private static String sexoSelecionado;
	
	public static void nomeSexo() {
		
		boolean erro;
				
		System.out.println(" Nome:");
		setNome(keyboard.next());
		
		do {
			erro=false;
			
			String menu = "\n";
			menu += "    1 - Feminino \n";
			menu += "    2 - Masculino \n";
						
			System.out.println(menu);
			sexo= keyboard.next();
			
			if(!sexo.equals("1")&&!sexo.equals("2")) {
				System.out.println("Oops!! Escolha inv�lida!");
				System.out.println("Escolha entre as op��es abaixo:\n");
				erro=true;
			}
				
		}while(erro);
		
		switch(sexo) {
		case "1":
			sexoSelecionado = "Her�ina";
			break;
		case "2":
			sexoSelecionado = "Her�i";
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
	
}

