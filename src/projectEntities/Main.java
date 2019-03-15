package projectEntities;

import java.util.Locale;
import java.util.Scanner;
import util.Rent;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		Rent[] vect = null;
		vect = new Rent[10];
		
		System.out.print("How many rooms will be taken? ");
		int qnt = read.nextInt();		
		
		if (vect.length < qnt || vect.length < qnt) {
			do {
				System.out.println("Quantity not permited! Only between 1 or 10!");
				
				System.out.print("How many rooms will be taken? ");
				qnt = read.nextInt();
				
			} while (vect.length < qnt || vect.length < qnt);
		}
		
		// Rooms and students
		for (int i = 0; i < qnt; i++) {
			
			System.out.printf("%nRent #%d:", i + 1);
			read.nextLine(); // Flush
			
			System.out.printf("%nName: ");
			String name = read.nextLine();
			
			System.out.printf("Email: ");
			String email = read.nextLine();
			
			System.out.printf("Room: ");
			int room = read.nextInt();
			
			if(vect[room] != null){
				
				do {
					System.out.println("Room full! Try another room!");
					
					System.out.printf("%nRoom: ");
					room = read.nextInt();
				} while (vect[room] != null);
				
			} else {
				vect[room] = new Rent(name, email);
			}
			
		}
		
		// Show results
		System.out.printf("%nBusy rooms:%n");
		
		for (int i = 1; i < 10; i++) {	
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
			
		}
		
		read.close();
		
	}

}
