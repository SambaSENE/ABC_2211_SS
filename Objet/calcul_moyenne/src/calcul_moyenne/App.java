package calcul_moyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb1;
		int nb2;
		
		System.out.println("Veuillez saisir le premier nombre");
		nb1 = sc.nextInt();
		
		System.out.println("Veuillez saisir le second nombre");
		nb2 = sc.nextInt();
		
		moyenne(nb1 , nb2);
sc.close();
	}
	
	public  static void moyenne(int nb1 , int nb2) {
		
		float resultat ;
		
		resultat = (nb1 + nb2) / 2;
		System.out.println("La moyenne est de : " + resultat);
	}

}
