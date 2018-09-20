
public class MainChat {

	public static void main(String[] args) {
		System.out.println();

		Chat LeChat = new Chat("Milou",2,30,"Gris","Persan");
		//	Medor.Nom= "Medor";
		//	Medor.Taille=2;
		//	Medor.Poids=30;
		//	Medor.Couleur="Noir";
		//	Medor.Race="BergerAllemand";

		System.out.println();
     
		LeChat.manger();
		LeChat.dormir();
		LeChat.jouer();
		LeChat.Miauler();
		LeChat.griffe();
		System.out.println("Le poids du chat est " + LeChat.Poids   );
		System.out.println("La race du chat est " + LeChat.Race   );
		System.out.println("La couleur du chat est " + LeChat.Couleur  );
	}


	}


