package aire_perimetre_triangle;

import java.util.Scanner;

public class App {

	public static void perimetreAireDuTriangle(double coteA, double coteB, double coteC) {
		double perimetre;
		double aire;
		
		perimetre = coteA + coteB + coteC;
		aire = ((perimetre / 2 - coteA) * (perimetre / 2 - coteB) * (perimetre / 2 - coteC) * 1/2  );
		System.out.println("La perimetre du triangle :  " + perimetre);
		System.out.println("La perimetre du triangle : "+ aire);
	}
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variables:
		double coteA;
		double coteB;
		double coteC ;

		// Initialisation

		System.out.println("Veuillez saisir la premiere cote du triangle");
		coteA = sc.nextDouble();

		System.out.println("veuillez saire la deuxieme cote du triangle ");
		coteB = sc.nextDouble();

		System.out.println("Veuillez saisir la troisieme cote du triangle");
		coteC = sc.nextDouble();
		
		perimetreAireDuTriangle(coteA , coteB , coteC);
		

		sc.close();
	}

}
