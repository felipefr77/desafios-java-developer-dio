package me.dio.desafio.bancoDigital.conta;

public class ContaCorrente extends Conta {

	private static int SEQUENCIAL = 1;
	
	public ContaCorrente() {
		super.agencia = Conta.AGENCIA;
		super.numero = SEQUENCIAL++;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente");
		super.imprimirInformacoes();
	}
}
