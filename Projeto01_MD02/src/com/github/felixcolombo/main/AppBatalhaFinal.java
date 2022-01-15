package com.github.felixcolombo.main;

import com.github.felixcolombo.entidades.Armas;
import com.github.felixcolombo.entidades.NivelDificuldade;
import com.github.felixcolombo.entidades.NomeSexo;
import com.github.felixcolombo.entidades.Personagens;
import com.github.felixcolombo.entidades.roteiro.RoteiroJogo;

public class AppBatalhaFinal {
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	private static String nivelEscolhido;
	private static String sexoSelecionado;
	private static String nome;
	private static String artigoIndefinidoSexo;
	private static String complementoSexo;
	
	private static String personagemSelecionado;
	private static double poderPersonagem;
	private double ataquePersonagem;
	private double defesaPersonagem;
	
	private static String armaSelecionada;
	private static String artigoIndefinidoArma;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
		pause(700);
		
		System.out.println("-Vamos iniciar escolhendo o nível de dificuldade: \n");
		pause(500);
		NivelDificuldade.escolherNivel();
		nivelEscolhido = NivelDificuldade.getNivelDificuldade();
		
		System.out.println("\n-Qual seu nome e sexo?\n");
		pause(500);
		NomeSexo.nomeSexo();
		sexoSelecionado = NomeSexo.getSexo();
		nome = NomeSexo.getNome();
		artigoIndefinidoSexo = NomeSexo.getArtigoIndefinidoSexo();
		complementoSexo = NomeSexo.getComplementoSexo();
		
		System.out.println("\n-"+nome+", escolha seu personagem:");
		pause(500);
		Personagens.escolherPersonagem();
		personagemSelecionado = Personagens.getPersonagemSelecionado();
		
		System.out.println("\n-"+nome+", escolha sua arma:");
		pause(500);
		Armas.escolherArma();
		armaSelecionada = Armas.getArmaSelecionada();
		artigoIndefinidoArma = Armas.getArtigoIndefinidoArma();
		
		System.out.println("\n"+nome+", "+artigoIndefinidoSexo+" "+sexoSelecionado+" com "+artigoIndefinidoArma+
				" "+armaSelecionada+" em mãos!\n");
		pause(500);
		
		RoteiroJogo.roteiroJogo();
	}

}
