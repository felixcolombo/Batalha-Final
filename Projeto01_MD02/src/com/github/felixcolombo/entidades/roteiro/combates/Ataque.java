package com.github.felixcolombo.entidades.roteiro.combates;

public class Ataque {
	
	public static double calcularAtaque (double valorDadosSorteado, double ataque, double poderArma, 
			double fatorArma, double fatorNivel) {
		
		double forcaAtaque = ((valorDadosSorteado + ataque+poderArma*fatorArma)*fatorNivel);;
		
		return forcaAtaque;
		
	}

}
