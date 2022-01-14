package com.github.felixcolombo.main;

import com.github.felixcolombo.entidades.NivelDificuldade;
import com.github.felixcolombo.entidades.NomeSexo;
import com.github.felixcolombo.entidades.Personagens;

public class AppBatalhaFinal {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static String nivelEscolhido;
	private static String sexoSelecionado;
	private static String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NivelDificuldade nivelDificuldade = new NivelDificuldade();
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
		pause(700);
		
		System.out.println("-Vamos iniciar escolhendo o nível de dificuldade: \n");
		pause(700);
		NivelDificuldade.escolherNivel();
		
		nivelEscolhido = nivelDificuldade.getNivelDificuldade();
		
		System.out.println(nivelEscolhido+"\n");
		pause(700);
		
		System.out.println("-Qual seu nome e sexo?\n");
		pause(700);
		NomeSexo.nomeSexo();
		
		sexoSelecionado = NomeSexo.getSexo();
		nome = NomeSexo.getNome();
				
		System.out.println(nome + " "+ sexoSelecionado+"\n");
		pause(700);
		
		System.out.println("-Escolha seu personagem: \n");
		pause(700);
		Personagens.escolherPersonagem();
		
		
	}

}
