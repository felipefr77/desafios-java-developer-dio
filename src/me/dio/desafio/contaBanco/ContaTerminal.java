package me.dio.desafio.contaBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");

		try {
			System.out.println( "Por favor, digite o número da nova conta!" );
			numero = scan.nextInt();
			
			System.out.println( "Por favor, digite o número da agência!" );
			agencia = scan.next();
			
			System.out.println( "Por favor, digite o nome do cliente!" );
			nomeCliente = scan.next();
			
			System.out.println( "Por favor, digite o valor do saldo!" );
			saldo = scan.nextDouble();
			
			//Exibir a mensagem conta criada
			System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		} catch (InputMismatchException e) {
			System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
