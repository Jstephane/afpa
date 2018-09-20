
public class Main {

	public static void main(String[] args) {

		System.out.println("Les Animaux");

		System.out.println();
		System.out.println("      CHIEN              ");

		Chien medor = new Chien("Medor",2,30,"Noir","BergerAllemand");
	//	  Medor.Nom= "Medor";
	  //  Medor.Taille=2;
	  //  Medor.Poids=30;
	  //  Medor.Couleur="Noir";
		//Medor.Race="BergerAllemand";

		medor.manger();
		medor.dormir();
		medor.jouer();
		medor.aboyer();
		medor.mordre();

		System.out.println();

		Chien medor2 = new Chien("Isidor",20,60,"Blanc","caniche");     
		medor2.manger();
		medor2.dormir();
		medor2.jouer();
		medor2.aboyer();
		medor2.mordre();
		System.out.println("Le poids du chien est " + medor2.Poids + "kg"  );
		System.out.println("La race du chien est " + medor2.Race   );
		System.out.println("La couleur du chien est " + medor2.Couleur  );

		System.out.println();
		System.out.println("      CHAT              ");

		Chat LeChat = new Chat("Milou",2,30,"Gris","Persan");



		LeChat.manger();
		LeChat.dormir();
		LeChat.jouer();
		LeChat.Miauler();
		LeChat.griffe();
		System.out.println("Le poids du chat est " + LeChat.Poids + "kg"  );
		System.out.println("La race du chat est " + LeChat.Race   );
		System.out.println("La couleur du chat est " + LeChat.Couleur  );


		System.out.println();
		System.out.println("      CHEVAUX              ");
		

		Chevaux LeCheval = new Chevaux("JollyJumper",3,90,"Marron","Persan");



		LeCheval.manger();
		LeCheval.dormir();
		LeCheval.jouer();
		LeCheval.hennir();
		LeCheval.frapper();
		System.out.println("Le poids du Cheval est " + LeCheval.Poids + "kg"  );
		System.out.println("La race du Cheval est " + LeCheval.Race   );
		System.out.println("La couleur du Cheval est " + LeCheval.Couleur  );
		
		
		System.out.println();
		System.out.println("      VACHE              ");
		
		
		
		Vache vache = new Vache("Louisa",7,115,"Tachetée","Limousine");
        vache.manger();
		vache.dormir();
		vache.jouer();
		vache.beugler();
		System.out.println("Le poids de la vache est " + vache.Poids  + "kg" );
		System.out.println("La race de la vache " + vache.Race   );
		System.out.println("La couleur de la vache " + vache.Couleur  );
		
		
		System.out.println();
		System.out.println("      LOUP              ");
		
		
		
		Loup Leloup = new Loup("Rigobert",7,85,"Noir","LoupTueur");
		Leloup.manger();
		Leloup.dormir();
		Leloup.jouer();
		Leloup.hurler();
		Leloup.mordre();
		System.out.println("Le poids du loup est " + Leloup.Poids + "kg"  );
		System.out.println("La race du loup est " + Leloup.Race   );
		System.out.println("La couleur du loup est " + Leloup.Couleur  );

		System.out.println();
		System.out.println("      LAPIN             ");
		
		
		
		Lapin Lelapin = new Lapin("Narcisse",1,4,"Roux","Japonais");
		Lelapin.manger();
		Lelapin.dormir();
		Lelapin.jouer();
		Lelapin.couine();
		System.out.println("Le poids du lapin est " + Lelapin.Poids + "kg"  );
		System.out.println("La race du lapin est " + Lelapin.Race   );
		System.out.println("La couleur du lapin est " + Lelapin.Couleur  );
		
		
		
		
		Chien Titan = new Chien("Titan",3,55,"Blanc","Rottweiller");     
		Titan.manger();
		Titan.dormir();
		Titan.jouer();
		Titan.aboyer();
		Titan.mordre();
		System.out.println("Le chien est  " + Titan.Nom );
		
		
		
		Animal Titan2 = new Chien ("Chien sans nom ",10 , 2 , "Vert","Bouldegoue" );
		System.out.println(Titan2.Nom );
		Titan2.manger();
		Chien Titan2chien = (Chien) Titan2;
		Titan2chien.aboyer();
		((Chien) Titan2).aboyer();
		
	}
	


	}
	
	
	

