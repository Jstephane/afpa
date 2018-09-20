
public class Chien {

	public String Nom;
	public int Taille; 
	public int Poids;
	public String Couleur;
	public String Race;


	public Chien() {
		super();
	}


	public Chien(String nom, int taille, int poids, String couleur, String race) {
		this.Nom = nom;
		this.Taille = taille;
		this.Poids = poids;
		this.Couleur = couleur;
		this.Race = race;
	}


	public void manger() {
		System.out.println("Le Chien "  + Nom +  " Mange" );

	}

	public void mordre() {
		System.out.println("Le Chien "  + Nom +  " Mord" );
	}

	public void dormir () {
		System.out.println("Le Chien "  + Nom +  " dort" );


	}
	
	public void jouer() {
		System.out.println("Le Chien "+ Nom +  " joue"  );
		
		
	}
	
	public void aboyer() {
		System.out.println("Le Chien "  + Nom +  " aboie" );
	
}
	
}