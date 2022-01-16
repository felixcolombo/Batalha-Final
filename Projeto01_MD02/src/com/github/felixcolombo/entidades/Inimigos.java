package com.github.felixcolombo.entidades;

import com.github.felixcolombo.entidades.inimigos.Alquimista;
import com.github.felixcolombo.entidades.inimigos.Armeiro;
import com.github.felixcolombo.entidades.inimigos.Lider;
import com.github.felixcolombo.entidades.roteiro.RoteiroJogo;

public class Inimigos {
	
	private static String nomeInimigo;
	private static double poderInimigo;
	private static double ataqueInimigo;
	private static double defesaInimigo;
	private static String ordemCombate = RoteiroJogo.getOrdemCombate();
	
	public static void inimigos() {
		
		switch(ordemCombate) {
		case "1":
			Armeiro armeiro = new Armeiro();
			break;
		case "2":
			Alquimista alquimista = new Alquimista();
			break;
		case "3":
			Lider lider = new Lider();
			break;
		}
		
		
	}

	public static double getPoderInimigo() {
		return poderInimigo;
	}

	public void setPoderInimigo(double poderInimigo) {
		Inimigos.poderInimigo = poderInimigo;
	}

	public static double getAtaqueInimigo() {
		return ataqueInimigo;
	}

	public void setAtaqueInimigo(double ataqueInimigo) {
		Inimigos.ataqueInimigo = ataqueInimigo;
	}

	public static double getDefesaInimigo() {
		return defesaInimigo;
	}

	public void setDefesaInimigo(double defesaInimigo) {
		Inimigos.defesaInimigo = defesaInimigo;
	}

	public static String getNomeInimigo() {
		return nomeInimigo;
	}

	public static void setNomeInimigo(String nomeInimigo) {
		Inimigos.nomeInimigo = nomeInimigo;
	}

}
