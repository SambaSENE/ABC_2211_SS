package modelisation_bouteille.Class;

public class Bouteille {

	private final double capaciteEnL;
	private double contenantEnL;
	// private double quantiteEnL; // Teste pour le remplissage
	private boolean estOuverte;
	private String nom;

	// les custructeurs:

	// Standard
	public Bouteille(double capaciteEnL, double contenantEnL, boolean estOuvert, String nom) {
		this.capaciteEnL = capaciteEnL;
		this.contenantEnL = contenantEnL;

		this.estOuverte = estOuvert;
		this.nom = nom;

	}


	public Bouteille() {
		capaciteEnL = 1;
		contenantEnL = 0.5;
		estOuverte = true;
		nom = " ";
	}


	// Methodes

	public String getNom() {
		System.out.println("la marque : " + nom);
		return this.nom;

	}

	public boolean ouvert() {
		if (this.estOuverte == true) {
			System.out.println("ouverte");
			return true;
		} else {

			//this.estOuverte = false;
			return false;
		}
	}

	public boolean ferme() {
		if (estOuverte) {
			this.estOuverte = false;

			System.out.println("fermé");


			return false;
		}
	}

	/*
	 * FUNCTION boolean remplir(reste) reste = capaciteEnL - contenantEnL
	 * 
	 * Si estOuverte = vraie et reste < capcite alors
	 * 
	 * contenantEnL+1; Retourne Vraie Sinon Retourne Faux Fin SI Fin FUNCTION
	 */
	public boolean remplir(double quantiteEnL) {
		// double reste = capaciteEnL - contenantEnL;


		if (this.estOuverte) {
			if (this.contenantEnL + quantiteEnL <= this.capaciteEnL) {
				this.contenantEnL += quantiteEnL;

		
				return true;
			} 
		} 
		return false;
		
	if (estOuverte) {
			if (quantiteEnL + contenantEnL < capaciteEnL) {
				System.out.println("c'est de la magie , la bouteille se remplit");
				return true;
			} else {
				System.out.println("On peut remplir la bouteille");
				return false;
			}
	} else {
		System.out.println("impossible de remplir");
		return false;
	}


	}

	public boolean remplireTout() {

		if (estOuverte) {
			if (this.contenantEnL < this.capaciteEnL) {
				this.contenantEnL = this.capaciteEnL;
				System.out.println("Bouteille remplit entierement");
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("bouteille fermé");
			return false;
		}
	}

	public boolean vider() {
		
		if (estOuverte) {

			if (capaciteEnL >= contenantEnL) {
				if(quantiteEnL >=0 ) {
					this.contenantEnL = this.contenantEnL -= quantiteEnL;
					return true;
				}else {
					return false;
				}
				

			if (capaciteEnL <= contenantEnL) {
				contenantEnL -= quantiteEnL;
				return true;
			} else {
				return false;

			}
		}return false ;
	}


	public boolean viderTout() {
		if (this.estOuverte) {
			if (this.contenantEnL > 0) {

				this.contenantEnL = 0;
				return true;
			} 
		} 
		return false;
		
	}

	@Override
	public String toString() {
		return "Capacite : " + capaciteEnL + " Contenant : " + contenantEnL + " Est ouverte : " + estOuverte + " Nom : "
				+ nom;
	}


>>>>>>> Stashed changes
}
