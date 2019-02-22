package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.contaDoBanco;

public class saqueEDeposito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		contaDoBanco contaDoBanco;
		
		System.out.print("Entre com o numero da conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("É um deposito inicial (y/n)? ");
		char haDeposito = sc.next().charAt(0);
		
		if (haDeposito == 'y') {
			System.out.print("Entre com o valor de deposito: ");
			double despositoInicial = sc.nextDouble();
			 contaDoBanco = new contaDoBanco(nome, numeroDaConta, despositoInicial);
		} else {
			 contaDoBanco = new contaDoBanco(nome, numeroDaConta);
		}
		
		System.out.println("");
		System.out.println("Conta Data");
		System.out.println(contaDoBanco);
		
		System.out.println("");
		System.out.println("Entre com o valor de depocito: ");
		double valorDeposito = sc.nextDouble();
		contaDoBanco.deposito(valorDeposito);
		
		System.out.println("Correção de Conta:");
		System.out.println(contaDoBanco);
		
		
		System.out.println("");
		System.out.println("Entre com o valor de Saque: ");
		double valorSaque = sc.nextDouble();
		contaDoBanco.saque(valorSaque);
		
		System.out.println("Correção de Conta:");
		System.out.println(contaDoBanco);
		
		
		sc.close();
	}

}
