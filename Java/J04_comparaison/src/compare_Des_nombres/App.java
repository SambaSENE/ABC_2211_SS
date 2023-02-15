package compare_Des_nombres;
/*
 * Algorithme : comparaison de nombre 
	Variables : 
		A :  entier
Début
	Écrire (‘’ Veuillez saisir votre Age’’)
	Lire<- A
	Si A < 18 alors 
		Écrire (‘’Vous êtes mineur’’)
	Sinon Si A > 18 alors
*		Écrire (‘’ Vous êtes majeur’’)
	Sinon 
*		Écrire (‘’Vous êtes a pas encore née’’)
*	Fin Si
Fin 
*/

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		// debut
			System.out.println("Veuillez saisir votre âge");
			age = sc.nextInt();
		
			if(age >= 18) {
				System.out.println("Vous etes majeur");
			}else if(age< 18 && age > 0) {
				System.out.println("Vous êtes mineur");
			}else{
				System.out.println("Vous n'êtes a pas encore née");
			}
			
		//fin 

	}

}
