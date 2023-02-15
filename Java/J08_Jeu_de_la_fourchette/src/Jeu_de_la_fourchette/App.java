package Jeu_de_la_fourchette;

import java.util.Scanner;
import java.util.Random;
/*
 VARIABLES
 	
 	nb := entier // Nombre aléatoirement
 	nbJoueur := entier // saisie par le joueur
 	min := entier
 	max := entier
 	nbEssais := entier
 
 DEBUT DU PROGRAMME
 
 	Initialisation des variables
 	
 	nbJoueur<-- -1
 	min<-- 0
 	max<-- 100
 	nb<-- Random(min,max)
 
 	Tant que nb est différent de nbJoueur 
 		Faire
 			Ecrire "Choisissez un nombre entre ",min," et ",max
 			Lire nbJoueur
 			Si nb est egale à nbJoueur 
 				Alors
 					Ecrire "Vous avez gagné en " ,nbEssais, " essais"
 			Fin si
 			Si nb est < à nbJoueur
 				Alors
 					Ecrire "C'est moins"
 					max = nbJoueur - 1
 			Fin Si
 			Si nb est > à nbJoueur
 				Alors
 					Ecrire "C'est plus"
 					min = nbJoueur + 1
 			Fin Si
 			nbEssais + 1
 	Fin Tant que
 
 FIN DU PROGRAMME
 
 */

public class App {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		Random rand = new Random();
		// Variable 
		int nb; // Nombre Aleatoire
		int nbJoueur;
		int min;
		int max;
		int nbEssaie = 0;
		
		//	Debut	
				//	Initialisation 
					nbJoueur = 0;
					min = 0; 
					max = 100;
					nb = rand.nextInt(min , max);
					
					
					while(nb != nbJoueur) {
						System.out.println("Choisissez un nombre");
						nbJoueur =  sc.nextInt();
						
						if(nb == nbJoueur) {
							System.out.println("Bravo!!! vous avez gagné");
						}else if(nb < nbJoueur) {
							System.out.println("Domage!!! Presque");
							max = nbJoueur -1;
						}else if(nb > nbJoueur) {
							System.out.println("Mince!!! un peut plus");
							min = nbJoueur +1;
						}
						nbEssaie = nbEssaie + 1;
						
					}
					
		//	Fin 
		
	}
	}

}
