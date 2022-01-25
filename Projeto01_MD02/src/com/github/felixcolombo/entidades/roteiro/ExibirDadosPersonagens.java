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
		System.out.println("Aqui est�o seus dados: \n");
		System.out.println("Seu Poder: "+RoteiroJogo.getPoderPersonagem());
		System.out.println("Seu Ataque: "+RoteiroJogo.getAtaquePersonagem());
		System.out.println("Sua Defesa: "+RoteiroJogo.getDefesaPersonagem());
		System.out.println("For�a de sua Arma: "+RoteiroJogo.getPoderArmaPersonagem());
		System.out.println("Fator de For�a de sua Arma: "+RoteiroJogo.getFatorArmaPersonagem());
		
		pause(800);
	}

}
