package me.dio.desafio.umlPoo.navegador;

public class Safari implements NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página no Safari");
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando aba ao navegador do Safari");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página do Safari");
	}
}
