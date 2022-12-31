package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Tenants;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Tenants[] totalRooms = new Tenants[10];

		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String names= sc.nextLine();
			System.out.print("Email: ");
			String emails= sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			totalRooms[roomNumber] = new Tenants(names, emails, roomNumber);
		}
		
		for(int i=0;i<totalRooms.length;i++) {
			if(totalRooms[i] != null) {
				System.out.println(totalRooms[i]);
			}
		}

		sc.close();
	}
}
