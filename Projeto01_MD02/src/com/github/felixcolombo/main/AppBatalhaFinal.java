package com.github.felixcolombo.main;


import com.github.felixcolombo.entidades.NivelDificuldade;

public class AppBatalhaFinal {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static String nivelEscolhido;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NivelDificuldade nivelDificuldade = new NivelDificuldade();
		
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
		pause(700);
		
		System.out.println("-Vamos iniciar escolhendo o nível de dificuldade: ");
		pause(700);
		NivelDificuldade.escolherNivel();
		
		nivelEscolhido= nivelDificuldade.getNivelDificuldade();
		
		
	}

}
