package inversion_variable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		int a;
		int b;
		int c;
		
		
		// Start
			
			System.out.println("Veuillez saisir la valeur  a");
			a = sc.nextInt();
			
			System.out.println("Veuillez saisir la valeur b " );
			b = sc.nextInt();
			
			c = a;
			a = b;
			b = c;
			
			System.out.println( "La valeur de a = "+a +" "+"La valeur de b = " + b);
		// End
	}

}
