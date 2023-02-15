package surface;

import java.util.Scanner;
/*
Algorithme : calcul la surface du secteur
Variables : 
		R :  Réel
		Sc : Réel 
		A : Réel 
Constant : 
		P : 3.14
Début :
	Ecrire (“ Veuillez saisir un rayon“)
	Lire <- R
	Ecrire (“ Veuillez saisir l’angle“)
	Lire <- A

	Sc  Pi * R * R * A
Ecrire (“Surface du secteur est de“ Sc)	
	
Fin
*/
public class Surface_du_secteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//  Declaration 
		double pi = Math.PI;
		int rayon;
		double angle;
		double surfSec;
		
		// Debut 
		// Initialization
		
		System.out.println("Veuillez saisir un rayon");
		rayon  = sc.nextInt();
		
		System.out.println("Veuillez saisir un angle");
		angle  = sc.nextInt();
		
		// Calcul
		
		surfSec =( pi * (Math.pow(rayon, 2)) * angle) / 360;
		
		// Resultat
		
		System.out.println("La surface du secteur est de: " + surfSec);
			
			
			
		// Fin
	}

}
