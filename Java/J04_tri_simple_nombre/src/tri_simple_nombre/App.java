package tri_simple_nombre;
import java.util.Scanner;

/*
Variables : 
	A : Entier
	B : Entier
Début
	Écrire ‘’Veuillez saisir un nombre’’
	Lire  A
	Écrire ‘’Veuillez saisir un nombre’’
	Lire  B
	
	Si A < B alors
		Écrire A B
	Sinon Si B < A alors
		Écrire B A
	Fin Si 
Fin
*/
public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int nb1;
		int nb2;
		
		// Start
		
			System.out.println("Veuillez saisir premier nombre");
			nb1 = sc.nextInt();
			
			System.out.println("Veuillez saisir le second nombre");
			nb2 = sc.nextInt();
			
			if(nb1 > nb2) {
			System.out.println("Second nombre "+nb2 + "Premier nombre "+nb1);
			}else if(nb2 < nb1) {
				System.out.println("Premier nombre " +nb1 + "Second nombre "+nb2);
			}else {
				System.out.println("Premier nombre " +nb1 + "Second nombre "+nb2);
			}
		// End

	}

}
