
public class Lapin {
	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;
	public Lapin(String nom, int taille, int poids, String couleur, String race) {
		this.Nom= nom;
		this.Taille = taille;
		this.Poids = poids;
		this.Couleur = couleur;
		this.Race = race;
	
	
}
	



public void manger() {
	System.out.println("Le Lapin "  +  Nom +  " Mange" );

}


public void dormir () {
	System.out.println("Le Lapin "  +  Nom +  " Dort" );


}

public void jouer() {
	System.out.println("Le Lapin "+  Nom +  " Joue"  );
	
	
}

public void couine() {
	System.out.println("Le Lapin "  + Nom +  " couine " );

}
}
