package fr.fofana.Oiseau;

public class Oiseaux {


	protected String Nom;
	protected int Taille; 
	protected int Poids;
	protected String Race;
	protected boolean plumes = true;
	public Oiseaux(String nom, int taille, int poids, String race, boolean plumes) {
		Nom = nom;
		Taille = taille;
		Poids = poids;
		Race = race;
		this.plumes = plumes;
	}
	public Oiseaux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void manger(){

		System.out.println("Mange" );
	}

	public void boire(){

		System.out.println("Boit" );


	}


	public void jouer(){

		System.out.println(Nom  +" " + Race  +" Joue" );
}

	public void courir(){

		System.out.println("Court" );
	
	
}
	
	public void sauter(){

		System.out.println("Saute" );
	
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
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public boolean isPlumes() {
		return plumes;
	}
	public void setPlumes(boolean plumes) {
		this.plumes = plumes;
	}	

	
}