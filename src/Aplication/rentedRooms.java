package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product;
import entidades.Room;

public class rentedRooms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.println("How many rooms will be reted?");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("Rent #%d\n",i+1);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numberRoom = sc.nextInt();
			
			vect[numberRoom] =new Room(name,email);
			
		} 
		
		System.out.println("Busy Rooms:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println( i+": "+ vect[i]);
			}
		}
		
		
		sc.close();
	}

}
