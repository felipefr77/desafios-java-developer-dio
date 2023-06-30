package me.dio.desafio.bancoDigital.conta;

public class ContaPoupanca extends Conta {

	private static int SEQUENCIAL = 5000000;
	
	public ContaPoupanca() {
		super.agencia = Conta.AGENCIA;
		super.numero = SEQUENCIAL++;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupança");
		super.imprimirInformacoes();
	}
}
