package fr.fofana.Oiseau;

public class Manchot extends Oiseaux implements nager {

	public Manchot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manchot(String nom, int taille, int poids, String race, boolean plumes) {
		super(nom, taille, poids, race, plumes);
		// TODO Auto-generated constructor stub
	}

	public void nager () {
		System.out.println("Le Manchot Nage");
	}
}
