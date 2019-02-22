package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.comverteDolaresParaReis;

public class compraDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do Dolar Hoje?");
		comverteDolaresParaReis.valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dolares seram comprados?");
		comverteDolaresParaReis.quantidadeDeDolares = sc.nextDouble();
		
		System.out.printf("Quantidade de reais que sera necessario: %.2f%n ", comverteDolaresParaReis.calculaValor());
		
		sc.close();
	}

}
