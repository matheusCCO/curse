package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.aumentaSalario;

public class CalculaSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		aumentaSalario salario = new aumentaSalario();
		
		System.out.println("Name: ");
		salario.name= sc.nextLine();
		
		System.out.println("Salario bruto: ");
		salario.GrossSalary= sc.nextDouble();
		
		System.out.println("Imposto: ");
		salario.Tax = sc.nextDouble();
		
		
		System.out.println("-----------------------------");
		System.out.println("Employee: " + salario.NetSalary());
		
		System.out.println("Quanto sera a porcentagem de almento? ");
		double porsentagem = sc.nextDouble();
		salario.IncreaseSalary(porsentagem);
		
		
		System.out.println();
		
		System.out.println("Novo Salario:"+ salario.toString());
		
		
		sc.close();
	}

}
