package aire_secteur_angulaire;

import java.util.Scanner;
/*
 VARIABLES
 R est un entier
 A est un entier
 Aire est un reel double
 
 DEBUT PROGRAMME
 	Ecrire « saisir le rayon R d'un cercle et un angle A »
	Lire R
	Lire A
	Aire  𝝅𝑹 𝟐𝑨/ 𝟑𝟔𝟎
	Ecrire « L’aire du secteur angulaire est : » aire
FIN PROGRAMME
 */


public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declaration des variables
		int r;
		int a;
		final double pi = Math.PI;// declaration de la constante pi et utilisation de l'objet pi de la classe Math
		double aire;
		
		// Debut 
		
			System.out.println("saisir le rayon R d'un cercle et un angle r");
			r = sc.nextInt();
			
			System.out.println("saisir le rayon R d'un cercle et un angle a");
			a = sc.nextInt();
			
			//  pour le calcul de l'aire utilisation de la fonction pow avec en 1er paramétre le rayon r et en 2éme paramétre l'exposant 2
			aire = pi * a *Math.pow(r, 2) / 360 ;
			
			System.out.println("L’ aire du secteur circulaire " +aire);
		// fin 
			
			sc.close();
	}

}
