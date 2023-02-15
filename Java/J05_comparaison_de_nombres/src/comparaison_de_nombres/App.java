package comparaison_de_nombres;

/*
 VARIABLES
 	
 	age est un entier
 	
 	DEBUT DU PROGRAMME
 	
 	écrire "saisisez votre âge"
 	lire age
 	
 	si age < 0
 		alors afficher " Vous n'êtes pas encore né.e."
 		
 	sinon si  age < 18
 		alors afficher "Vous êtes mineur.e."
 		
 	sinon afficher "Vous êtes majeur.e."
 	
 	
 	FIN DU PROGRAMME
 */
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a; 
		
		System.out.println("saisisez votre âge");
		a = sc.nextInt();
		
		//si l'age est inférieur à 0
		if(a<0) {
			System.out.println("vous n'êtes pas encore né");
		}
		// sinon si l'age est inférieur à 18
		else if(a<18) {
			System.out.println("Vous êtes mineur");
		}
		
		else {
			System.out.println("Vous êtes majeur");
		}
		sc.close();
		}
	
		
	}


