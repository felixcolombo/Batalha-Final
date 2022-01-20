package com.github.felixcolombo.entidades.roteiro;

public class ExibirDadosPersonagens {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public static void exibirDadosPersonagens() {
		System.out.println("Aqui estão seus dados: \n");
		System.out.println("Seu Poder: "+RoteiroJogo.getPoderPersonagem());
		System.out.println("Seu Ataque: "+RoteiroJogo.getAtaquePersonagem());
		System.out.println("Sua Defesa: "+RoteiroJogo.getDefesaPersonagem()+"\n");
		
		pause(800);
	}

}
