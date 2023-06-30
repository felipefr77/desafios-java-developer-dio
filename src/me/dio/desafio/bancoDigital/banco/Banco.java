package me.dio.desafio.bancoDigital.banco;

import java.util.ArrayList;
import java.util.List;

import me.dio.desafio.bancoDigital.cliente.Cliente;

public class Banco {
	
	private String nome;
	private List<Cliente> listaClientes = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCliente(Cliente cliente) {
		this.listaClientes.add(cliente);
	}
	
	public void imprimirClientes() {
		for( Cliente cliente: this.listaClientes ) {
			System.out.println("Cliente: " + cliente.getNome() );
			cliente.imprimirContas();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
