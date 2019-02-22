package Aplication;

import java.util.Scanner;

import entidades.Retangulo;

public class areaPerimedroDiagonalRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Altura:");
		retangulo.altura= sc.nextDouble();
		
		System.out.println("Largura:");
		retangulo.largura= sc.nextDouble();
		retangulo.area();
		
		System.out.printf("Area: %.2f\n", retangulo.area());
		System.out.printf("Perimetro: %.2f\n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f\n", retangulo.diagonal());
		sc.close();
		
	}

}
