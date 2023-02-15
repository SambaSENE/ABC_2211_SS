package calcul_interet;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  =  new Scanner(System.in);
		
		double somme;
		int nbAnnee;
		double i;
		double interetSimple;
		double interetComposer;
		
		// Debut
			System.out.println("Veuillez saisir la somme");
			somme = sc.nextDouble();
			
			System.out.println("Veuillez saisir nombre d'année");
			nbAnnee = sc.nextInt();
			
			System.out.println("Veuillez saisir l'interet partiel");
			i = sc.nextDouble();
			
			interetSimple = somme* (1 + nbAnnee * (i / 100));
			System.out.println("l'interet simple est de:" + interetSimple);
			
			interetComposer = somme  * Math.pow(1+i, nbAnnee);
			System.out.println("L'interet composer est : "+ interetComposer);
			
			
		// Fin
		
	}

}
