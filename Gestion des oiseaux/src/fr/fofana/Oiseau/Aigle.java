package fr.fofana.Oiseau;

public class Aigle extends Oiseaux implements voler{


	public Aigle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aigle(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

	public void chasser (String nomanimal) {
		System.out.println("L'aigle chasse un " + nomanimal);
	}
	
	public void devorer (String nomanimal) {
		System.out.println("L'aigle devore un " + nomanimal);
	}

	@Override
	public void voler() {
		// TODO Auto-generated method stub
		
	}
	

}
