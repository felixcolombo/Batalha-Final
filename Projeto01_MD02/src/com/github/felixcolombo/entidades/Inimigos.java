package com.github.felixcolombo.entidades;

import com.github.felixcolombo.entidades.inimigos.Alquimista;
import com.github.felixcolombo.entidades.inimigos.Armeiro;
import com.github.felixcolombo.entidades.inimigos.Lider;

public class Inimigos {
	
	public static String nomeInimigo;
	public static double poderInimigo;
	public static double ataqueInimigo;
	public static double defesaInimigo;

	
	public static void inimigos(int ordemCombate){
		
		if(ordemCombate==1) {
			new Armeiro();
		}else if(ordemCombate==2) {
			new Alquimista();
		}else if(ordemCombate==3) {
			new Lider();
		}

	}

	public static double getPoderInimigo() {
		return poderInimigo;
	}

	public static void setPoderInimigo(double poderInimigo) {
		Inimigos.poderInimigo = poderInimigo;
	}

	public static double getAtaqueInimigo() {
		return ataqueInimigo;
	}

	public static void setAtaqueInimigo(double ataqueInimigo) {
		Inimigos.ataqueInimigo = ataqueInimigo;
	}

	public static double getDefesaInimigo() {
		return defesaInimigo;
	}

	public static void setDefesaInimigo(double defesaInimigo) {
		Inimigos.defesaInimigo = defesaInimigo;
	}

	public static String getNomeInimigo() {
		return nomeInimigo;
	}

	public static void setNomeInimigo(String nomeInimigo) {
		Inimigos.nomeInimigo = nomeInimigo;
	}

}
