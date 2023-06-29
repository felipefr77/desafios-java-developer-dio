package me.dio.desafio.umlPoo.iphone;

import me.dio.desafio.umlPoo.navegador.NavegadorInternet;
import me.dio.desafio.umlPoo.reprodutor.ReprodutorMusical;
import me.dio.desafio.umlPoo.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página do Navegador pelo Iphone");
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando Página no Navegador pelo Iphone");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página do Navegador pelo Iphone");
	}

	@Override
	public void ligar() {
		System.out.println("Realizando chamada pelo Iphone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação pelo Iphone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz pelo Iphone");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música pela Iphone");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música pela Iphone");
	}

	@Override
	public void selecionar() {
		System.out.println("Selecionando música pela Iphone");
	}
}
