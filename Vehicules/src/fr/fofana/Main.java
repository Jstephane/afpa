package fr.fofana;


import fr.fofana.vehicules.Camion;
import fr.fofana.vehicules.Vehicules;
import fr.fofana.vehicules.Voiture;

public class Main extends Vehicules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println();

		System.out.println("Les Voitures");

		System.out.println("               La C3           ");
		System.out.println();
		Voiture voiture = new Voiture("Citroen", "rouge", 230, 6, 15000, 0, 5);
		System.out.println("La voiture C3 est de marque " + voiture.getMarque());
		System.out.println("La C3 est de couleur " + voiture.getCouleur() );
		System.out.println("La C3 peut rouler a une vitesse maximale de "  + voiture.getVitesse() + "km/h "	);
		System.out.println("Son prix d'achat est de " + voiture.getPrix() + " Eu");
		System.out.println("Elle est toute neuve , elle a donc " + voiture.getKilometrage() + "Km");
		System.out.println("La C3 a une puissance de " + voiture.getPuissance() + " Chevaux " + "ainsi que " + voiture.getNombreDePortes() + " portières ");




		System.out.println();


		voiture.demarrer();

		voiture.accelerer();

		voiture.rouler();


		/*try {
		//	Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		System.out.println();

		System.out.println("Je roule depuis 1h j’ai besoin d'une pause");

		System.out.println();

		voiture.freiner();
		voiture.garer();

		System.out.println("Je me gare");


		System.out.println("La C3 a une puissance de " + voiture.getPuissance() + " Chevaux " + "ainsi que " + voiture.getNombreDePortes() + " portières ");



		System.out.println();
		System.out.println();

		System.out.println("Les Camions ");

		System.out.println("              Le Camion Volvo           ");
		System.out.println();
		Camion camion = new Camion("Volvo", "Verte", 180 , 24 , 100000 , 5000 , 22);
		System.out.println("Le Camion est de marque " + camion.getMarque());
		System.out.println("Le Camion est de couleur " + camion.getCouleur() );
		System.out.println("Le Camion peut rouler a une vitesse maximale de "  + camion.getVitesse() + "km/h "	);
		System.out.println("Son prix d'achat est de " + camion.getPrix() + " Eu");
		System.out.println("Le camion est d'occasion , il a donc " + camion.getKilometrage() + "Km");
		System.out.println("Le camion a une puissance de " + camion.getPuissance() + " Chevaux " + "ainsi qu'une capacité de " + camion.getCapacite() + "t");

		/* System.err.println() pour ecrire en Rouge   */

		System.out.println();
		System.out.println();
		Camion camion2 = null;                // initialiser la variable
		if(camion.getCapacite() < 25 ) {

			camion2 = new Camion("Mercedes", "Blanche", 200  , 75  , 150000 , 0  , 30);
			System.out.println("Je crée un nouveau camion");

			System.out.println("Le Camion 2 est de marque " + camion2.getMarque());
			System.out.println("Le Camion 2 est de couleur " + camion2.getCouleur() );
			System.out.println("Le Camion 2 peut rouler a une vitesse maximale de "  + camion2.getVitesse() + "km/h "	);
			System.out.println("Son prix d'achat est de " + camion2.getPrix() + " Eu");
			System.out.println("Le camion 2 est d'occasion , il a donc " + camion2.getKilometrage() + "Km");
			System.out.println("Le camion 2 a une puissance de " + camion2.getPuissance() + " Chevaux " + "ainsi qu'une capacité de " + camion2.getCapacite() + "t");

			System.out.println("Je roule avec la Mercedes");
			camion2.demarrer();
			camion2.accelerer();
			camion2.rouler();
			camion2.freiner();
			camion2.garer();
		}
		else {
			System.out.println("Je roule avec la Volvo");	
			camion.demarrer();
			camion.accelerer();
			camion.rouler();
		}


	}
}

