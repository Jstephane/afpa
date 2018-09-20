
public class Vache {

	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;
	public Vache(String nom, int taille, int poids, String couleur, String race) {
		this.Nom= nom;
		this.Taille = taille;
		this.Poids = poids;
		this.Couleur = couleur;
		this.Race = race;
	
	
}
	



public void manger() {
	System.out.println("La Vache "  + Nom +  " Mange" );

}

public void beugler() {
	System.out.println("La Vache "  + Nom +  " beugle" );
}

public void dormir () {
	System.out.println("La Vache "  + Nom +  " dort" );


}

public void jouer() {
	System.out.println("La Vache "+ Nom +  " joue"  );
	
	




}
	
	
}
