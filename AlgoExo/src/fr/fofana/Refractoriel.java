package fr.fofana;

import java.util.Scanner;

public class Refractoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Debut");
		
		
		System.out.println("Veuillez choisir un nombre : ");
		int nombre =sc.nextInt();
		int indice =1;
		
		
		for (int i=1; i<=nombre; i++) {
      indice=indice*i;
		}
int ResultatFactoriel = (indice); 
System.out.println("Le resultat factoriel de " + nombre +  " est" + " "+ ResultatFactoriel);
	}

}
