package fr.fofana;
import java.util.Random;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("DEBUT");


		Random random = new Random();
		int prixAleatoire =random.nextInt(101);
		//System.out.println(prixAleatoire); // affiche le Prix Aleatoire
		System.out.println("Veuillez choisir un nombre : ");
boolean faux = false;	
int tentative =1;
int prix ;


do {
	prix= sc.nextInt();

	if (prix> 100 ){

		System.out.println(" Le prix est superieur 100 Changez de prix ");
		faux = true;
	}
	else if (prixAleatoire==prix) {

		System.out.println(prixAleatoire + " = " + prix  + " Les 2 nombres sont égaux , Bravo");
		System.out.println("Le nombre de tentatives est " + tentative);
		
	}
	else if(prixAleatoire > prix) {

		System.out.println("C'est plus" ) ;
		faux = true;
		tentative++;
	}else {

		System.out.println("C'est moins" ) ;
		faux = true;
		tentative++;
	}

}while(faux);
			

sc.close();
		}
	
	}


