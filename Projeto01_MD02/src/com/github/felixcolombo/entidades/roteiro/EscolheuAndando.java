package com.github.felixcolombo.entidades.roteiro;

public class EscolheuAndando {
	
	private static int parametroDados = 10;
	private static double valorDadosSorteado;
	
	public static void tomarDanoEcolheuAndando() {
		
		RolamentoDados.rolarDados(parametroDados);
		valorDadosSorteado = RolamentoDados.getValorDadosSorteado();
		
		RoteiroJogo.poderPersonagem = RoteiroJogo.poderPersonagem - valorDadosSorteado;
		
	}

}
