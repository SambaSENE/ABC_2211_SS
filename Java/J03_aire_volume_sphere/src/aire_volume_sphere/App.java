package aire_volume_sphere;

// importation de l'objet scanner pour la saisie utilisateur
import java.util.Scanner;

/*
  VARIABLES
  R est un entier
  Aire est un reel double
  Volume est un reel double
 DEBUT PROGRAMME
   Ecrire « Veuillez écrire la valeur du rayon R » 
   Lire R
   Aire4 π R²
   Volume 4/3 π R3    	
   Ecrire « l’aire de la sphère est » +Aire
   Ecrire  « Le volume de la sphère est de » +Volume
FIN PROGRAMME
 */

public class App {
	
	public static void main(String[] args) {
		
		//declaration des variables
		double pi = Math.PI; // utilisation de l'objet pi de la classe Math
		
		int rayon = 0;
		
		double aire; 
		
		double volume;
		
		//declaration du scanner
		Scanner sc = new Scanner(System.in);
		
		// Debut du programme
		
		System.out.println("Calcul de l'aire et du volume d'une sphère");
		
		//On demande à l'utilisateur de saisir le rayon de la sphere
		System.out.println("Saisir la valeur du rayon");
		
		//on stocke la valeur saisie dans la variable rayon
		rayon = sc.nextInt();
		
		System.out.println("Vous avez saisi : " + rayon);
		
		// on fait le calcul de l'aire et on stocke le résultat dans la variable aire
		aire = 4 * pi * Math.pow(rayon, 2); // utilisation de l'objet pow (puissance) de la classe Math (1er paramètre : la variable 1er nombre, le 2ème l'exposant)
		
		// on fait le calcul du volume et on stocke le résultat dans la variable volume
		volume = 4/3d * pi * Math.pow(rayon, 3);
		
		// on affiche le résultat
		System.out.println("L'air de la sphère est " + aire + ". Son volume est " + volume);
		
		//Fin du programme
		
		sc.close();
	}
	
}
