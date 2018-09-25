package fr.fofana;

import fr.fofana.Oiseau.*;



public class MainOiseaux {


	public static void main(String[] args) {


		System.out.println("Les Oiseaux");

		System.out.println();
		System.out.println("      AIGLE              ");
		Aigle aigle = new Aigle("Brutus",2,10,"Aigle Royal",true);
		System.out.println("L'aigle " +  aigle.getNom() +" de " + aigle.getPoids() + " kg " + "et de race " + aigle.getRace());
		aigle.chasser("lapin");
		aigle.jouer();
      
		System.out.println();
		System.out.println("      Autruche             ");
		Autruche autruche = new Autruche("Annabelle",4,20,"Autruche Australienne",true);
	    System.out.println("L'autruche " +  autruche.getNom() +" de " + autruche.getPoids() + " kg" + " et de race " + autruche.getRace() );
	    autruche.courir();
	
		System.out.println();
		System.out.println("      Manchot              ");
		Manchot manchot = new Manchot("Paulo",4,20,"Manchot",false);
		System.out.println("Le manchot " +  manchot.getNom() +" de " + manchot.getPoids() + " kg" + " et de race " + manchot.getRace() );
		manchot.nager();

		
		System.out.println();
		System.out.println("      Pigeon              ");
		Pigeon pigeon = new Pigeon("Hugo",1,4,"Pigeon Voyageur",true);
		System.out.println("Le pigeon " +  pigeon.getNom() +" de " + pigeon.getPoids() + " kg" + " et de race " + pigeon.getRace() );

		
		System.out.println();
		System.out.println("      Perruche              ");
		Perruche perruche = new Perruche("Lilly",1,2,"Perruche Jaune",true);
		System.out.println("La perruche " +  perruche.getNom() +" de " + perruche.getPoids() + " kg" + " et de race " + perruche.getRace() );
		
		perruche.sautiller();
	}

}
