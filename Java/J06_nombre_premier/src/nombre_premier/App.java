package nombre_premier;

import java.util.Scanner;

/*
 VARIABLES
 	entier n
 	entier i
 	booléen est_premier
 	
 	est_premier <-- vrai
 	
 DEBUT DU PROGRAMME
 	écrire "saisir n"
 	lire n
 
 	pour i de 2 à n - 1
 		if n mod i = 0 alors
 			est_premier <-- faux
		fin si
 	fin pour
 	
 	si est_premier = vrai alors
 		écrire "n est premier"
	sinon
		écrire "n n'est pas premier"
	fin si
 FIN DU PROGRAMME 
 */

public class App {

	public static void main(String[] args) {
		// VARIABLES
			int n;
			boolean est_premier = true;
			
			Scanner sc = new Scanner(System.in); 
		
		// DEBUT PROGRAMME
			System.out.println("Saisir N");
			n = sc.nextInt();
			
			n = Math.abs(n); // valeur absolue d'un nombre
			
			if(n == 0) est_premier = false;
			
			for(int i = 2; i <= n - 1 && est_premier; i++) {
				System.out.println(n + " modulo " + i + " = " + n % i);
				if(n % i == 0) {
					est_premier = false;
				}
			}
					
			if(est_premier) {
				System.out.println("N est premier");
			}else {
				System.out.println("N n'est pas premier");
			}
			
			sc.close();
		
		// FIN PROGRAMME

	}

}
