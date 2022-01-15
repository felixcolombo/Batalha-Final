package com.github.felixcolombo.entidades.roteiro;

import java.util.Random;

public class RolamentoDados {
	
	static Random valorDados = new Random();
	private static int valorDadosSorteado;
	
	public static void rolarDados(int parametroDados) {

		valorDadosSorteado = valorDados.nextInt(parametroDados)+1;
	}

	public static int getValorDadosSorteado() {
		return valorDadosSorteado;
	}

	public static void setValoDadosrSorteado(int valorDadosSorteado) {
		RolamentoDados.valorDadosSorteado = valorDadosSorteado;
	}

}
