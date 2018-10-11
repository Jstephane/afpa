package fr.fofana;

import java.util.Scanner;

public class carrevide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);

			System.out.println("Debut");


			System.out.println("Veuillez entrer le nomnbre pour la taille du carré : ");
			int nombre =sc.nextInt();

			for(int i=0; i<nombre; i++) {
				for(int j=0; j<nombre; j++) { 
			if (i==0|| j==0 || i==nombre-1 || j==nombre -1) {
				
			
					System.out.print(" *");
			}
			else {
				
				System.out.print("  ");
				}}System.out.println();
			}

		}


	}
