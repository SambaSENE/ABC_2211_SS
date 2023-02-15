package exemple_boucle_while;

/*
 VARIABLE
 
 compteur est un entier
 
 DEBUT DU PROGRAMME
 compteur<-- 1
 
 tant compteur <=50
 ecrire compteur
 compteur + 1
 fin boucle tant que
 
 FIN DU PROGRAMME
 
 */

public class App {

	public static void main(String[] args) {
		
		int compteur = 1;
		
		while(compteur<50)
		{
			System.out.print(compteur +" ");
			compteur++;
		}
		
		do
		{
			System.out.print(compteur +" ");
			compteur++;
		}
		while(compteur<50);

	}

}
