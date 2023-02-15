package recherche_diviseurs;

import java.util.Scanner;

/*
 VARIABLES
 	i := entier // Iterateur
 	n := entier // saisie de l'utilisateur
 	
 DEBUT DU PROGRAMME
 	Ecrire "Veuillez saisir un nombre"
 	Lire  n
 	
 	Pour i de 2 à n  , i < n
 	 Si n mod i == 0    
 	 	Ecrire i
 	 fin Si
 	 
 	fin Pour
	
 FIN DU PROGRAMME
 */

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Declaration des variables
		
		int i; // Iterateur
		
		int n; // Saisie de l'utilisateur
		
		// Debut
		System.out.println("Veuillez saisir un nombre");
		n = sc.nextInt();
		
		for(i = 2; i< n ; i+=2) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
		//  Fin
	}

}
