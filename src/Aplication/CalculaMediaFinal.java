package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.MediaFinal;

public class CalculaMediaFinal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		MediaFinal notas = new MediaFinal();
		
		System.out.println("Digite o nome do aluno: ");
		notas.nome = sc.nextLine();
		
		System.out.println("Digite a PRIMEIRA nota: ");
		notas.primeira= sc.nextDouble();
		
		System.out.println("Digite a SEGUNDA nota: ");
		notas.segunda= sc.nextDouble();
		
		System.out.println("Digite a TERCEIRA nota: ");
		notas.terceira= sc.nextDouble();
		
		System.out.printf("Nota final: %.2f\n", notas.media());
		
		if(notas.media()<60.0) {
			System.out.println("FAILD");
			System.out.printf("Faltou: %.2f\n",notas.notaFaltante());
		} else {
			System.out.println("Pass");
		}
		
		sc.close();

	}

}
