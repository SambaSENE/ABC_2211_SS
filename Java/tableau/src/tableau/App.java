package tableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variable :
		String[] abcDev = { "Natane", "Frederic", "Terence", "Raphael", "Florian", "Kevin", "Stefan", "Giaume",
				"Mikael", "Olivier", "Moustapha", "Samba" };
		int ref = 0;
		int indice = 0;
		// Initialisation

		System.out.println("Veuillez saisir une reference de stagiare entre 1 et 12");
		ref = sc.nextInt();

		for (int i = 0; i < abcDev.length; i++) {
			indice = i + 1;

			if (indice == ref) {
				System.out.println("bonjour " + abcDev[i]);
			}
		}

		if (ref < indice || ref > indice) {

			System.out.println("Ce stagiaire n'est pas dans le groupe");
		}
		sc.close();
	}

	// Fin
}
