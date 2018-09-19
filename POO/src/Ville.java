
public class Ville {

	String nom;
	int nombrehabitant; 
	int superficie;

	// Constructeur sans parametres

	public Ville() {

		System.out.println();	
		System.out.println("Creation d'un objet Ville");
		System.out.println();
	}

	// Constructeur avec parametres


	
	public Ville(String NomP ,int NombreHabitantP , int SuperficieP ) {
		
		System.out.println("Creation d'un objet Ville");
		
		System.out.println();
		
		nom = NomP;
		nombrehabitant = NombreHabitantP;
		superficie = SuperficieP;
	}

	public Ville(int nombrehabitant, int superficie) {
		super();
		this.nombrehabitant = nombrehabitant;
		this.superficie = superficie;
	}

	public Ville(String nom, int nombrehabitant) {
		super();
		this.nom = nom;
		this.nombrehabitant = nombrehabitant;
	}










}



