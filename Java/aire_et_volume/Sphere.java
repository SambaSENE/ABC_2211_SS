package aire_et_volume;


import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Declaration
		
		Scanner sc = new Scanner(System.in);
		
		
		double pi = Math.PI;
		int rayon = 0;
		double aire;
		double volume;
		
		// Initialisattion 
		
		System.out.println("Veuillez saisir un rayon");
		rayon = sc.nextInt();
		
	// 	Debut
		
	// Sphere
		
		aire = 4 * pi* (Math.pow(rayon, 2));
		System.out.println("l'aire de la sphere est : " + aire);
		
	// Volume
		volume = 4 / 3* pi * (Math.pow(rayon, 3))  ;
		System.out.println("Volume de la spere est de: " + volume + " m3");
	//  Fin
		
		
	}

}
