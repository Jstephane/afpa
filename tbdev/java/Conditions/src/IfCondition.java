
public class IfCondition {

	public static void main(String[] args) {

		// =    permet de faire une affectation 
		// ==   permet de faire une comparaison

		int prix = 10;
		// 10 ==10 la condition est fausse
		if(prix == 10) {
			System.out.println("Le prix = 10");
		}
		
		int tva = 20;
		// 20 != 15 la condition est fausse
		if(tva == 15) {
			System.out.println("La tva = 15");
		}

		boolean bool = true;
		// true != false la condition est fausse
		if(bool == false) {
			System.out.println("LA variable bool = false");
		}
		//		true == true la condition est vraie
		if(bool == true) {
			System.out.println("La variable bool = true");
		}

		char car = 'a' ;
		// a != c la condition est fausse
		if(car == 'c') {
			System.out.println("La variable car = 'c'");
		}
		// a == a la condition est vraie
		if(car == 'a') {
			System.out.println("La variable car = 'a'");
		}

		String chaine = "bonjour";
		//bonjour == bonjour la condition est vraie
		if(chaine == "bonjour") {
			System.out.println("La variable chaine = bonjour");
		}
		// bonjour != Bonjour la condition est fausse 
		if(chaine == "Bonjour") {
			System.out.println("La variable chaine = Bonjour avec un B MAJ");
		}
		
		double decimal = 15.5;
		// 15.5 == 15.5 La condition est vraie
		if(decimal == 15.5) {
			System.out.println("La variable decimal = 15.5");
		}
		//15.5 != 10.65 la condition est fausse
		if(decimal == 10.65){
			System.out.println("La variable decimal = 10.65");
		}
		
		int somme = 15;
		if(somme > 11) {
			System.out.println("LE produit est trop cher");
		}
		
		if(somme <= 11) {
			System.out.println("La somme est parfaite");
		}
		
		if(somme != 13) {
			System.out.println("La somme est != de 13");
		}
		
		/*
		 * Les operateurs 
		 * 		== 	op�rateur d'�galit�					=> Compare deux valeurs et v�rifie leur �galit�
		 * 		!= 	op�rateur de diff�rence				=> V�rifie qu'une variable est diff�rente d'une valeur
		 * 		>= 	op�rateur de sup�riorit�			=> V�rifie qu'une variable est sup�rieure ou �gale � une valeur
		 * 		>	op�rateur de sup�riorit� stricte	=> V�rifie qu'une variable est strictement sup�rieure � une valeur
		 * 		<	op�rateur d'inf�riorit� stricte		=> V�rifie qu'une variable est strictement inf�rieure � une valeur
		 * 		<=  op�rateur d'inf�riorit�				=> V�rifie qu'une variable est inf�rieure ou �gale � une valeur
		 */
	}
}
