package fr.fofana.animal;

public class Loup extends Animal {

	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;
	public Loup(String nom, int taille, int poids, String couleur, String race) {
		this.Nom= nom;
		this.Taille = taille;
		this.Poids = poids;
		this.Couleur = couleur;
		this.Race = race;
	
	
}
	



public void manger() {
	System.out.println("Le Loup "  + Nom +  " Mange" );

}

public void hurler() {
	System.out.println("Le Loup "  + Nom +  " Hurle" );
}

public void dormir () {
	System.out.println("Le Loup "  + Nom +  " Dort" );


}

public void jouer() {
	System.out.println("Le Loup "+ Nom +  " Joue"  );
	
	
}

public void mordre() {
	System.out.println("Le Loup "  + Nom +  " Mord " );

}
	
}
