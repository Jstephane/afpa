package fr.fofana.vehicules;

public class Camion extends Vehicules {

	private int capacite;
	
	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage , int capacite) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
		this.capacite=capacite;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	
	}
	


