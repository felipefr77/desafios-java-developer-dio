package me.dio.desafio.bancoDigital.cliente;

import java.util.ArrayList;
import java.util.List;

import me.dio.desafio.bancoDigital.conta.Conta;

public class Cliente {
	
	private String nome;
	private List<Conta> listaContas = new ArrayList<>();

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void adicionarConta(Conta conta) {
		this.listaContas.add(conta);
	}
	
	public void imprimirContas() {
		for( Conta conta: this.listaContas ) {
			conta.imprimirExtrato();
		}
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}