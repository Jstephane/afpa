package fr.fofana.vehicules;

public class Voiture extends Vehicules {

	// Propriétés de la voiture
	
	private int nombreDePortes;
	
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage, int nombreDePortes) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		this.nombreDePortes= nombreDePortes;
	}

	//getter&setter
	public int getNombreDePortes() {
		return nombreDePortes;
	}

	public void setNombreDePortes(int nombreDePortes) {
		this.nombreDePortes = nombreDePortes;
	}
	
	
	
	

	
}
	

