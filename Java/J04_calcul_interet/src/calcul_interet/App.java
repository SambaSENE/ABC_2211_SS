package calcul_interet;

import java.util.Scanner;

public class App {
	/*
VARIABLES
	S est un entier
	I est un entier
	N est un entier
	Somme1 est un reel double
	Somme2 est un reel double
DEBUT DU PROGRAMME
	Ecrire « Veuillez entrer la somme »
	Lire S
	Ecrire « Veuillez entrer le taux d’intérêt »
	Lire i
	Ecrire  « Veuillez entrer le nombre d’années du placement »
	Lire N
	Somme1  S * ( 1 + N * i )
	Somme2  S * ( 1 + i ) N 
	Ecrire « La somme avec un intérêt simple est » ; somme1 ;  « et la somme avec un intérêt composé est » ; somme 2
FIN DU PROGRAMME
	 */
	
	public static void main(String[] args) {
	
		//declaration des variables
		int S = 0;
		int i = 0;
		int N = 0;
		double Somme1;
		double Somme2;
		
		Scanner sc = new Scanner(System.in);
		
		//debut du programme
		System.out.println("Calcul d'un intérêt simple et d'un intérêt composé");
		System.out.println("Saisir la somme du compte en banque");
		S = sc.nextInt();
		System.out.println("Saisir le taux d'intérêt");
		i = sc.nextInt();
		System.out.println("Saisir le nombre d'années");
		N = sc.nextInt();
		Somme1 = S * ( 1 + N * i / 100d);
		Somme2 = S * Math.pow((1 + i / 100d), N);
		System.out.println("La somme avec un intérêt simple est " 
							+ Somme1 
							+  " et la somme avec un intérêt composé est " 
							+ Somme2);
		sc.close();
		//fin du programme
	}

}
