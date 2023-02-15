package modelisation_bouteille;

import modelisation_bouteille.Class.Bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille coca = new Bouteille(1.5 , 1.5 ,  false , "coca");
		
		
		
		System.out.println("__________________");
		boolean okv = coca.vider(0.8);
		System.out.println(okv);
		System.out.println("__________________");
		
		
	
		
		

		
		
		String eviantoString = coca.toString();
		System.out.println(eviantoString);
		
		
		
		

	}

}
