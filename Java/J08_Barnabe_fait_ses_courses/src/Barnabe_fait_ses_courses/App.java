package Barnabe_fait_ses_courses;
/*
 * 
 * Algorithmes:  Barnabe fait ses courses
 * 
 * 			Variables : 
 * 					magasin := Entier
 * 					s 		:= Entier
 * 					depense := Entier
 * 					i 		:= Entier
 * 				faire
 * 					Pour i  de s i-1
 * 						s = s-1
 * 					finPour
 * 					magasin = magasin + 1
 * 
 * 				TantQue s > 1 
 * 
 * */
public class App {

	public static void main(String[] args) {
	
		//	Variables
		
			int  magasin =0;
			int  s = 10;
			int depense = 0;
			
			while(s > 1) {
				if(s>1) {
					s = s-1;
				}
				
				magasin = magasin +1;
				
			}
			System.out.println(magasin );
	}

}
