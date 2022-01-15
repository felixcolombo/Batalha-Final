package com.github.felixcolombo.entidades;

import com.github.felixcolombo.entidades.inimigos.Alquimista;
import com.github.felixcolombo.entidades.inimigos.Armeiro;
import com.github.felixcolombo.entidades.inimigos.Lider;
import com.github.felixcolombo.entidades.roteiro.combates.Combates;

public class Inimigos {
	
	private static double poderInimigo;
	private double ataqueInimigo;
	private double defesaInimigo;
	private static int ordemCombate;
	
	public static void inimigos() {
		
		ordemCombate = Combates.getOrdemCombate();
		
		switch(ordemCombate) {
		case 1:
			Armeiro armeiro = new Armeiro();
			break;
		case 2:
			Alquimista alquimista = new Alquimista();
			break;
		case 3:
			Lider lider = new Lider();
			break;
		}
		
		
	}

	public static double getPoderInimigo() {
		return poderInimigo;
	}

	public static void setPoderInimigo(double poderInimigo) {
		Inimigos.poderInimigo = poderInimigo;
	}

	public double getAtaqueInimigo() {
		return ataqueInimigo;
	}

	public void setAtaqueInimigo(double ataqueInimigo) {
		this.ataqueInimigo = ataqueInimigo;
	}

	public double getDefesaInimigo() {
		return defesaInimigo;
	}

	public void setDefesaInimigo(double defesaInimigo) {
		this.defesaInimigo = defesaInimigo;
	}



}
