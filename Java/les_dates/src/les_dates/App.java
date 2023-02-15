package les_dates;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);2

		// Variables :

		int[] numeroMois = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12 };
		int indiceNumeroMois = 0;

		String[] nomMois = { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Decembre" };
		String mois;
		int indiceMois = 0;
		int[] jour = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31 };
		int indiceJour = 0;
		int valeur;
		boolean saisie = false;
		// Debut

		System.out.println("Veuillez saisir un mois");
		valeur = sc.nextInt();
			while(valeur >0 & valeur < 13){

						for (int i = 0; i < numeroMois.length + 1; i++) {
			
							indiceNumeroMois = i + 1;
							if (valeur == indiceNumeroMois) {
			
								System.out.println(indiceNumeroMois);
							}
						}
						for (int j = 0; j < nomMois.length; j++) {
							indiceMois = j + 1;
							mois = nomMois[j];
							if (valeur == indiceMois) {
			
								System.out.println(mois);
							}
						}
						for (int k = 0; k < jour.length; k++) {
							indiceJour = k + 1;
			
							System.out.print(indiceJour);
			
						}
				
					if (indiceMois % 2 == 0) {
			
						if (valeur == 4 || valeur == 6) {
			
							System.out.print(indiceJour - 1);
			
						} else if (valeur == 9 || valeur == 11) {
							System.out.print(indiceJour - 1);
						} else if (valeur == 2) {
							System.out.print(indiceJour - 3);
						}
			
					} else {
						System.out.print(indiceJour);
					}
					saisie = saisie ;
			
			}

		// Fin

		sc.close();

	}

}
