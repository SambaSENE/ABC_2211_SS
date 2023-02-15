package inversion_valeurs;

import java.util.Scanner;

public class App {
	/*
VARIABLES
	a est un entier
	b est un entier
	tmp est un entier
DEBUT DU PROGRAMME
	Lire  a
	Ecrire « Valeur de A » a
	Lire a
	Ecrire « Valeur de B» b
	tmp=a	
	a=b
	b=tmp
	Ecrire « a »
	Ecrire « b »
FIN DU PROGRAMME
	 */

	public static void main(String[] args) {
		
		//declaration des variables
		int a;
		int b;
		int tmp;
		
		Scanner Sc = new Scanner(System.in);
		
		//debut du programme

		System.out.print("entrez le nombre a :");
		a = Sc.nextInt();

		System.out.println("entrez le nombre b : ");
		b = Sc.nextInt();

		System.out.println("Avant la permutation: a = "+a+" et b = "+b);
		//on stocke la valeur de a dans la variable tmp 
		//puis on stocke la valeur de b dans la variable a 
		//et enfin la valeur de tmp dans la variable b
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Apres la permutation: a = "+a+" et b = "+b);
		Sc.close();
		
		//fin du programme
	}

}
