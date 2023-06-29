package me.dio.desafio.umlPoo.telefone;

public class Telefone implements AparelhoTelefonico {

	@Override
	public void ligar() {
		System.out.println("Ligando para alguém pelo Telefone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação pelo Telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz pelo Telefone");
	}
}
