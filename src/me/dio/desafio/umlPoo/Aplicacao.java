package me.dio.desafio.umlPoo;

import me.dio.desafio.umlPoo.iphone.Iphone;
import me.dio.desafio.umlPoo.navegador.NavegadorInternet;
import me.dio.desafio.umlPoo.reprodutor.ReprodutorMusical;
import me.dio.desafio.umlPoo.telefone.AparelhoTelefonico;

public class Aplicacao {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();

		ReprodutorMusical reprodutor = iphone;
		reprodutor.selecionar();
		reprodutor.tocar();
		reprodutor.pausar();

		AparelhoTelefonico telefone = iphone;
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();

		NavegadorInternet navegador = iphone;
		navegador.exibirPagina();
		navegador.adicionarAba();
		navegador.atualizarPagina();
	}
}
