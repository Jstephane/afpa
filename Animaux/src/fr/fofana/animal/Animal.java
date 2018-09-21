package fr.fofana.animal;

public class Animal {

	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;

	public Animal() {}

	public Animal(String nom, int taille, int poids, String couleur, String race) {
		Nom = nom;
		Taille = taille;
		Poids = poids;
		Couleur = couleur;
		Race = race;
	}
	public void manger(){

		System.out.println("Miam, Miam , Miam , c'est bon " );
	}
	public void dormir(){

		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" );
	}

	public void mordre(){

		System.out.println("Bien fait pour toi" );
	}

	public void jouer(){

		System.out.println("Bien fait pour toi" );
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getTaille() {
		return Taille;
	}

	public void setTaille(int taille) {
		Taille = taille;
	}

	public int getPoids() {
		return Poids;
	}

	public void setPoids(int poids) {
		Poids = poids;
	}

	public String getCouleur() {
		return Couleur;
	}

	public void setCouleur(String couleur) {
		Couleur = couleur;
	}

	public String getRace() {
		return Race;
	}

	public void setRace(String race) {
		Race = race;
	}


}