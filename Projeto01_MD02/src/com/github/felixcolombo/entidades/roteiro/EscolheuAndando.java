package com.github.felixcolombo.entidades.roteiro;

import com.github.felixcolombo.entidades.Personagens;

public class EscolheuAndando {
	
	private static int parametroDados = 10;
	private static double valorDadosSorteado;
	private static double poderAtualPersonagem;
	private static double poderAtualizadoPersonagem;
	
	public static void tomarDanoEcolheuAndando() {
		
		RolamentoDados.rolarDados(parametroDados);
		valorDadosSorteado = RolamentoDados.getValorDadosSorteado();
		
		poderAtualPersonagem = Personagens.getPoderPersonagem();
		
		poderAtualizadoPersonagem = poderAtualPersonagem - valorDadosSorteado;
		
		Personagens.poderPersonagem = poderAtualizadoPersonagem;
	}

}
