package fr.fofana;

import java.util.Scanner;

public class Carr� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		System.out.println("Debut");


		System.out.println("Veuillez entrer le nomnbre pour la taille du carr� : ");
		int nombre =sc.nextInt();

		for(int i=0; i<nombre; i++) {
			for(int j=0; j<nombre; j++) {
				System.out.print(" *");
			}	
			System.out.println("");
		}

	}


}
