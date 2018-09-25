package fr.fofana.vehicules;

public class Vehicules {
	//variable (proprietes)
	protected String Marque;
	protected String Couleur;
	protected int Vitesse; 
	protected int Puissance;
	protected int Prix;
	protected int Kilometrage;
	// 
	public Vehicules(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage )
	{
		Marque = marque;
		Couleur = couleur;
		Vitesse = vitesse;
		Puissance = puissance;
		Prix = prix;
		Kilometrage = kilometrage;

	}
	public Vehicules() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Les Methodes (action)
	public void demarrer(){

		System.out.println("Le vehicule demarre" );
	}


	public void accelerer(){

		System.out.println("Le vehicule accelère" );
	}
	public void freiner(){

		System.out.println("Le vehicule freine" );
	}
	public void rouler(){

		System.out.println("Le vehicule roule" );
	}
	public void garer(){

		System.out.println("Le vehicule se gare" );
	}
	
	
	
	
	
	//getter & setter
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public String getCouleur() {
		return Couleur;
	}
	public void setCouleur(String couleur) {
		Couleur = couleur;
	}
	public int getVitesse() {
		return Vitesse;
	}
	public void setVitesse(int vitesse) {
		Vitesse = vitesse;
	}
	public int getPuissance() {
		return Puissance;
	}
	public void setPuissance(int puissance) {
		Puissance = puissance;
	}
	public int getPrix() {
		return Prix;
	}
	public void setPrix(int prix) {
		Prix = prix;
	}
	public int getKilometrage() {
		return Kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		Kilometrage = kilometrage;
	}

}
