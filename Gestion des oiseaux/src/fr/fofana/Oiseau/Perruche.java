package fr.fofana.Oiseau;

public class Perruche extends Oiseaux implements voler{

	public Perruche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perruche(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

public void sautiller (){
	
		System.out.println("La perruche sautille");
	
	
}

@Override
public void voler() {
	// TODO Auto-generated method stub
	
}
	
}
