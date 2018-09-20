
public class Main {

	public static void main(String[] args) {

		System.out.println("***********************************************************");
		System.out.println("***********************************************************");



		System.out.println();
		System.out.println();
		System.out.println();



		System.out.println("Debut du Programme");


		Ville Paris = new Ville();
		Paris.nom= "Paris";
		Paris.nombrehabitant=100;
		Paris.superficie=100;


		System.out.println("Traitement de données de la ville de Paris");


		System.out.println();


		System.out.println("Nom :" + Paris.nom);
		System.out.println("NombreHabitant :" + Paris.nombrehabitant);
		System.out.println("Superficie :" + Paris.superficie);

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***********************************************************");
		System.out.println("***********************************************************");


		System.out.println();
		System.out.println();
		System.out.println();

		Ville Marseille = new Ville();



		System.out.println("Traitement de données de la ville de Marseille");

		System.out.println();

		Marseille.nom = "Marseille";
		Marseille.nombrehabitant =200;
		Marseille.superficie =95;


		System.out.println("Nom :" + Marseille.nom);
		System.out.println("NombreHabitant :" + Marseille.nombrehabitant);
		System.out.println("Superficie :" + Marseille.superficie);

		System.out.println();
		System.out.println();



		System.out.println("***********************************************************");
		System.out.println("***********************************************************");

		System.out.println();


		System.out.println("Traitement de données de la ville de Liverpool");

		System.out.println();


		Ville Liverpool = new Ville("liverpool", 500, 95);

		System.out.println("Nom :" + Liverpool.nom);
		System.out.println("NombreHabitant :" + Liverpool.nombrehabitant);
		System.out.println("Superficie :" + Liverpool.superficie);
		System.out.println();

		System.out.println("***********************************************************");
		System.out.println("***********************************************************");
		
		
		
		Ville Lille = new Ville("Lille", 400);
		System.out.println("Nom :" + Lille.nom);
		System.out.println("NombreHabitant :" + Lille.nombrehabitant);
		System.out.println("Superficie :" + Lille.superficie); //aucune donnée vu que l'on a pas la surprficie dans les parametres
		

		System.out.println("***********************************************************");
		System.out.println("***********************************************************");
		
		System.out.println();
		
		Ville Barcelone = new Ville(500,4);
		System.out.println("NombreHabitant :" + Barcelone.nombrehabitant);
		System.out.println("Superficie :" + Barcelone.superficie);
		



		System.out.println("***********************************************************");
		System.out.println("***********************************************************");

		
		System.out.println(Paris.etatLumiere);
		System.out.println(Marseille.etatLumiere);
		System.out.println(Lille.etatLumiere);
		System.out.println(Liverpool.etatLumiere);
		

		System.out.println("----------------------Lumiere--------------------------------");




	}
	
	









	}




