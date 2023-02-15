package Rechercher_un_nombre_tableau;

import java.util.Scanner;

/*
 * 	Algorithmes : recherche de nombre dans un tableau
 * 
 * 		Variables : 
 * 				tab[] = {5 , 8 , 9 , 14 ,20 , 35}
 * 				n :=  Entier
 * 				i := Entier	
 * 				element := entier
 * 		Debut: 
 * 			Ecrire "Veuillez saisir une valeur "
 * 			Lire  n
 * 			Pour i de 0 à |tab|-1 i+1 
				Si element = i alors
				
 * 					element = i+1
 * 				finSi		
 * 				
 * 			fin Pour
 * 			Si n = element alors
 * 				Ecrire n ,"est un element du tableau"
 * 			Sinon 
 * 				Ecrire "l'element" , n , "n'exixte pas dans le tableau"
 * 			finSi
 * 		Fin:
 * */

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		// Variables
			int[] tab ={5 , 8 , 9 , 14 ,20 , 35};
			int n;
			int element = 0;
			
			
		// Debut
			System.out.println("Veuillez saisr une valeur");
			n = sc.nextInt();
			
			for(int i = 0 ; i < tab.length-1; i++) {
				element = tab[i];
				
				if(element == i) {
					
				}
			}
			System.out.println(element);
			
		// Fin
	}

}
