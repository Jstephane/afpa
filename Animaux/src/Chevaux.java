
public class Chevaux {
	
	
	
	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;
	public Chevaux(String nom, int taille, int poids, String couleur, String race) {
		this.Nom= nom;
		this.Taille = taille;
		this.Poids = poids;
		this.Couleur = couleur;
		this.Race = race;
	
	
}
	



public void manger() {
	System.out.println("Le Cheval "  + Nom +  " Mange" );

}

public void hennir() {
	System.out.println("Le Cheval "  + Nom +  " Mord" );
}

public void dormir () {
	System.out.println("Le Cheval "  + Nom +  " dort" );


}

public void jouer() {
	System.out.println("Le Cheval "+ Nom +  " joue"  );
	
	
}

public void frapper() {
	System.out.println("Le Cheval "  + Nom +  " aboie" );

}
	}



