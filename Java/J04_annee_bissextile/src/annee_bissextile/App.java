package annee_bissextile;

import java.util.Scanner;

/*
 * Variables :  
	A : Entier
	
Début 
	Écrire ‘’Veuillez saisir une année ‘’
	Lire  A

Si A % 4 == 0 alors
	Ecrire (‘’l’année n’est pas bissextile’’)
Sinon
		Si a % 100 == 0 alors
			Ecrire (‘’System.out.println("L'année n'est pas bissextile"); ‘’)
		Sinon 
			Si A % 400 != 0 alors 
				Ecrire (‘’l’année est bissextile’’)
			Sinon 
				Ecrire (‘’l’année n’est pas bissextile’’)
			Fin si
		Fin si
Fin si
Fin
*/

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		
		int year;
		
		// Start
			System.out.println("Veillez saisir une année");
			year = sc.nextInt();
			
			if(year % 4 != 0) {
				System.out.println("L'année n'est pas bissextile");
			}else  {
				if(year % 100 == 0) {
					
					System.out.println("L'année est bissextile");
					
				}else if (year % 400 != 0) {
					
					System.out.println("L'année bissextile");
				}
			
			}
			
		sc.close();
		// End
	}

}
