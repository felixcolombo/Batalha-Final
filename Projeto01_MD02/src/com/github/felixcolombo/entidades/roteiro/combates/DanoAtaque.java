package com.github.felixcolombo.entidades.roteiro.combates;

public class DanoAtaque {
	
	public static double danoAtaque(double forcaAtaque, double defesa) {
		
		double danoAtaque;
		
		danoAtaque = forcaAtaque-defesa;
	
		return danoAtaque;
		
	}

}
