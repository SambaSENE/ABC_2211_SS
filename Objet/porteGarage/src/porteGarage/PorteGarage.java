package porteGarage;

<<<<<<< Updated upstream
public  class PorteGarage {
	
	private final String nom;
	private final String typePorte;
	private final String materiel;
	private double pourcentOuverte;
	private boolean verrouller;
	
	// constructeur
	
	public PorteGarage(String _nom, String _typePorte, String _materiel, double _pourcentOuverte,  boolean verrouller) {
		this.nom = _nom;
		this.typePorte = _typePorte;
		this.materiel = _materiel;
		this.pourcentOuverte = _pourcentOuverte;
		this.verrouller = verrouller;
=======
public class PorteGarage {

	private String marque;
	private int ouverture;
	private final int tauxMax;
	private final int tauxMin;
	private boolean verrouller;


	public PorteGarage(String  marque , int ouvertutre ,  int tauxMax, int tauxMin , boolean verrouller) {
		this.marque = marque;
		this.tauxMax = tauxMax;
		this.tauxMin = tauxMin;
		this.verrouller = verrouller;
	}
	
	
	public PorteGarage() {
		marque = " ";
		ouverture = 0;
		tauxMax = 90;
		tauxMin = 0;
		verrouller = true;
		
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
	}
	
	
	
	public String getNom() {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		return nom;
	}
	
	public String getTypePorte() {
		return typePorte;
	}

	public String getMateriel() {
		return materiel;
	}
	
	public double getPourcentOuverte() {
		return pourcentOuverte;
	}
	
	public boolean getVerouillee() {
		return verrouller;
	}
	
	// methodes
	
	public boolean ouvrir() {
		if(!this.verrouller) {
			if (this.pourcentOuverte < 100) {
				this.pourcentOuverte = 100;
				return true;
			} else {
				return false;
			}
			
=======
		return this.marque;
	}
=======
		return this.marque;
	}
>>>>>>> Stashed changes
	
	//  
	public boolean verrouller() {
		if(this.verrouller) {
			this.verrouller = true;
<<<<<<< Updated upstream
			return true;
>>>>>>> Stashed changes
		}else {
			return false;
		}
	}
<<<<<<< Updated upstream

	public boolean ouvrir(double pourcentOuverture) {
		if(!this.verrouller) {
			if(pourcentOuverture < 0) {
				return false;
			} else if (this.pourcentOuverte + pourcentOuverture < 100) {
				this.pourcentOuverte += pourcentOuverture;
				return true;
			} else if (this.pourcentOuverte < 100 && !this.verrouller) {
				this.pourcentOuverte = 100;
				return true;
			} else {
				return false;
			}
			
		}else {
=======
	public boolean deverrouller() {
		if(this.verrouller){
			this.verrouller =false;
>>>>>>> Stashed changes
			return false;
		}else {
			return true;
		}
	}
<<<<<<< Updated upstream

	public boolean fermer() {
		if(!this.verrouller) {
			if (this.pourcentOuverte > 0) {
				this.pourcentOuverte = 0;
				return true;
			} else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
	/*public boolean fermer(double pourcentOuverture) {
		if(!this.verrouller) {
			if(pourcentOuverture < 0) {
				return false;
			} else if (this.pourcentOuverte - pourcentOuverture > 0 ) {
				this.pourcentOuverte -= pourcentOuverture;		
				return true;
			} else if(this.pourcentOuverte > 0 & !this.verrouller) {
				this.pourcentOuverte = 0;
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	*/
	
	public boolean verrouller() {
		if(!this.verrouller) {
			this.verrouller = true;
			return true;
		} else {
=======
	
	public boolean ouvrir(int tauxOuvertutre) {
		if(!this.verrouller) {
			if(this.tauxMin <= 0) {
				return false;
			}else if(this.tauxMin > 0 & this.tauxMax <=  100){
				this.ouverture = (this.ouverture * tauxOuvertutre) / 100;
				return true;
			}else {
				return false;
			}
		}else {
>>>>>>> Stashed changes
=======
			return true;
		}else {
>>>>>>> Stashed changes
			return false;
		}
		
	}
<<<<<<< Updated upstream
	
	public boolean deverrouller() {
		if(this.verrouller) {
			this.verrouller = false;
			return false;
		}else {
			return  true;
		}
	}
<<<<<<< Updated upstream
=======
=======
	public boolean deverrouller() {
		if(this.verrouller){
			this.verrouller =false;
			return false;
		}else {
			return true;
		}
	}
	
	public boolean ouvrir(int tauxOuvertutre) {
		if(!this.verrouller) {
			if(this.tauxMin <= 0) {
				return false;
			}else if(this.tauxMin > 0 & this.tauxMax <=  100){
				this.ouverture = (this.ouverture * tauxOuvertutre) / 100;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
>>>>>>> Stashed changes
	
	// public boolean 

>>>>>>> Stashed changes
	@Override
	
	public String toString() {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		return " Nom " + nom + " type " + typePorte + " materiel " + materiel + " pourcentOuverte " + pourcentOuverte +" % "+ " verrouller " + verrouller;
=======
		return "|La marque : |" + marque + "|tauxMax : " + tauxMax + "|TauxMin : " + tauxMin + " | porte verrouller :  " +verrouller ; 
>>>>>>> Stashed changes
=======
		return "|La marque : |" + marque + "|tauxMax : " + tauxMax + "|TauxMin : " + tauxMin + " | porte verrouller :  " +verrouller ; 
>>>>>>> Stashed changes
	}
}
