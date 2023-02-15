package rcherche_des_diviseur;
import java.util.Scanner;
/*
 * 
 * */

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int i;
		// Start
		
		System.out.println("Veuillez saisir un nombre");
		n = sc.nextInt();
		
		for(i =0; i< n; i++) {
			if( n % i == 0) {
				
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
