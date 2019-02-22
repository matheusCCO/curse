package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter produto data: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preco: ");
		double price = sc.nextDouble();


		
		Produto produto = new Produto(name, price );
		
		produto.setName("computador"); 
		System.out.println("Updade name: "+ produto.getName());
		
		produto.setPrice(1200.00);
		System.out.println("Updade name: "+ produto.getPrice());
		
		
		System.out.println();
		System.out.println("Product data:"+produto);
		
		System.out.println();
		System.out.println("Enter the number of produts to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProdutos(quantity);
		
		System.out.println();
		System.out.println("Updated dadta: "+ produto);
		
		System.out.println();
		System.out.println("Enter the number of produts to be remove in stock: ");
		quantity = sc.nextInt();
		produto.removerProdutos(quantity);
		
		System.out.println();
		System.out.println("Updated dadta: "+ produto);
		
		
		sc.close();
		

	}

}
