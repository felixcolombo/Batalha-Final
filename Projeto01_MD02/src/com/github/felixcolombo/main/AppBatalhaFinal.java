package com.github.felixcolombo.main;

import com.github.felixcolombo.entidades.Armas;
import com.github.felixcolombo.entidades.NivelDificuldade;
import com.github.felixcolombo.entidades.NomeSexo;
import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.RoteiroJogo;

public class AppBatalhaFinal {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
		
		pause(700);
		
		NivelDificuldade.escolherNivel();
		
		NomeSexo.nomeSexo();
		
		Personagens.escolherPersonagem();
				
		Armas.escolherArma();
		
		pause(500);
		
		RoteiroJogo.roteiroJogo();
	}

}
