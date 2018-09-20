
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




}