package fr.fofana.animal;

public class Chat extends Animal{
	
	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;
	
	



public Chat(String nom, int taille, int poids, String couleur, String race) {
	this.Nom= nom;
	this.Taille = taille;
	this.Poids = poids;
	this.Couleur = couleur;
	this.Race = race;
	
}


public void manger() {
	System.out.println("Le Chat "  + Nom +  " Mange" );

}

public void griffe() {
	System.out.println("Le Chat "  + Nom +  " griffe" );
}

public void dormir () {
	System.out.println("Le Chat "  + Nom +  " dort" );


}

public void jouer() {
	System.out.println("Le Chat "+ Nom +  " joue"  );
	
	
}

public void Miauler() {
	System.out.println("Le Chat "  + Nom +  " Miaule" );

}
}