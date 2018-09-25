package fr.fofana.vehicules;

public class Car extends Vehicules {

	private int NombreDePlaces;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage, int NombreDePlaces) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
		this.NombreDePlaces =NombreDePlaces;
	}

	public int getNombreDePlaces() {
		return NombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		NombreDePlaces = nombreDePlaces;
	}

	
}