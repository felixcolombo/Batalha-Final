package com.github.felixcolombo.entidades.roteiro.combates;

public class VerificaAtaque {
	
	public static double verificaAtaque(double forcaAtaque, double defesa) {
		
		double danoAtaque;
		
		if(forcaAtaque>defesa) {
			danoAtaque = forcaAtaque-defesa;
		}else {
			danoAtaque = defesa-forcaAtaque;
		}
		return danoAtaque;
		
	}

}
