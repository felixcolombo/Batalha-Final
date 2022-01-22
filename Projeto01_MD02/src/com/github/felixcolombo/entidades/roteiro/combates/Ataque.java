package com.github.felixcolombo.entidades.roteiro.combates;

public class Ataque {
	
	public static double calcularAtaque (double valorDadosSorteado, double ataque, double poderArma, 
			double fatorArma, double fatorNivel) {
		
		double forcaAtaque = ((valorDadosSorteado + ataque + poderArma*fatorArma)*fatorNivel);
		
		System.out.println(valorDadosSorteado);
		System.out.println(ataque);
		System.out.println(poderArma);
		System.out.println(fatorArma);
		System.out.println(fatorNivel);
		
		System.out.println(forcaAtaque);
		
		return forcaAtaque;
		
	}

}
