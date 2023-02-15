package procedure;

import java.util.Scanner;

public class App {
	public static void inversion(int a , int b) {
		int c ;
		
		c = a;
		a = b;
		b = c;
		System.out.println("Aprés inversion : valeur de a : "+a+" valeur de b "+b);
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
	//	Variables: 
		
			int a;
			int b;

	// Initialisation
			
			
			System.out.println("Veuillez saisir la premiere valeur");
			a = sc.nextInt();
			
			System.out.println("Veuillez saisir la seconde valeur");
			b =  sc.nextInt();
			
			inversion(a,b);
			
		
			
	sc.close();
	}


	
}
