package testEnum;

public class ClassEnum {
	
	public enum Semaine {
		
		// voir les params  (fix bug)
		Lundi("develloppement" , 5),
		Mardi("Francais" , 2),
		Mercredi(  "Anglais" , 3),
		Jeudi("developpement" , 5), 
		Vendredi("bureautique" ,  2), 
		Samedi ("congés"), 
		Dimanche("congés");
		
		private String matiere;
		private int horaire;
		
		Semaine (String matiere1   , int horaire){
			this.matiere =  matiere;
		}
	}
}
