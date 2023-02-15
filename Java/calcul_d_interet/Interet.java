package calcul_d_interet;
/*
Algorithme : Calcul d’intérêts	

Variables : 
	 S :  Réel	 I :   Réel	
	 N :  Entier
Constant : 
Début :
	Ecrire (“Veuillez saisir un nombre d’années“)
	Lire  N

	// Intérêt simple
	S <- 1 + N * I
	
	// Intérêt composé

	S  (1+N*I)	N
Écrire (S)
Fin
*/

import java.util.Scanner;

public class Interet {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration 
		Scanner sc = new Scanner(System.in);
		
		
		double somme;
		double nbAnnee;
		double i;
		double interetSimple;
		double interetComposer;
		// double res;
		
		
		//  Debut
			
			System.out.println("Veuillez saisir la somme");
			somme = sc.nextInt();
			
			System.out.println("Veuillez saisir le nombre d'année");
			nbAnnee = sc.nextInt();
			
			System.out.println("Veuillez saisir interet partiele");
			i = sc.nextInt() ;
			
			// Interet simple
			
			interetSimple = somme *(1 + nbAnnee * (i/ 100)  ) ;
			System.out.println("l'interet simple est de:" + interetSimple);
			
			// Interet composer
			
			interetComposer  =somme * Math.pow((1 + i), nbAnnee);
			System.out.println("L'interet composer est : "+ interetComposer);
			
		// Fin
	}

}
