package me.dio.desafio.bancoDigital;

import me.dio.desafio.bancoDigital.banco.Banco;
import me.dio.desafio.bancoDigital.cliente.Cliente;
import me.dio.desafio.bancoDigital.conta.Conta;
import me.dio.desafio.bancoDigital.conta.ContaCorrente;
import me.dio.desafio.bancoDigital.conta.ContaPoupanca;

public class Aplicacao {

	public static void main(String[] args) {

		Banco banco = new Banco("Meu Banco Digital Ltda");
		Cliente cliente1 = new Cliente("Felipe");
		Cliente cliente2 = new Cliente("Laura");
		
		banco.adicionarCliente(cliente1);
		banco.adicionarCliente(cliente2);
		
		Conta cc = new ContaCorrente();
		cliente1.adicionarConta(cc);
		cc.depositar(1000.0);
		
		Conta cp = new ContaPoupanca();
		cliente2.adicionarConta(cp);
		cc.transferir(500, cp);
		cp.sacar(100);
		
		banco.imprimirClientes();
	}
}
