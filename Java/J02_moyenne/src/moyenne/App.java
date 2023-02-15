package moyenne;

import java.util.Scanner;

public class App {

	/*
	VARIABLES
		nombre1 est un ENTIER
		nombre2 est un ENTIER
		moyenne EST UN REEL double précision
	DEBUT PROGRAMME
		Ecrire « Programme de calcul de la moyenne de 2 nombres »
		Ecrire « Veuillez saisir un premier nombre »
		Lire nombre1
		Ecrire « Veuillez saisir un deuxième nombre »
		Lire nombre2
		Moyenne(nombre1 + nombre2)/2
		Ecrire « La moyenne de » nombre1 « et » nombre2 « est » moyenne 
	FIN PROGRAMME


	*/
	public static void main(String[] args) 
	{
		// VARIABLES
		
		int nombre1; // déclaration d'une variable nommée "nombre1" et de type "entier"
		int nombre2; // déclaration d'une variable de type "entier"
		double moyenne; // déclaration d'une variable "moyenne" de type "réel double précision" 
		
		// Création d'un scanner (voir le PDF JAVA 03)
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur 
		
		
		// DEBUT PROGRAMME 
		
		System.out.println("Programme de calcul de la moyenne de 2 nombres");

		
		System.out.println("Veuillez saisir un premier nombre");
		nombre1 = sc.nextInt(); // appelle l'utilisateur à saisir un nombre entier dans la console
		System.out.println("Vous avez saisi: " + nombre1);
		
		
		System.out.println("Veuillez saisir un second nombre");
		nombre2 = sc.nextInt(); // appelle l'utilisateur à saisir un nombre entier dans la console
		System.out.println("Vous avez saisi: " + nombre2);
		
		
		moyenne = (nombre1 + nombre2) / 2d;
		
		System.out.println(moyenne);
		
		//fin du programme
		
	}
	
}
