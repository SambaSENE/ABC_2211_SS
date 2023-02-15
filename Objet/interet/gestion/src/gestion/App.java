package gestion;



public class App {

	public static void main(String[] args) {
		int carteBleu = 5;
		int cheque = 10;
		int virement= 5;
		pourcentage(carteBleu , cheque  , virement);
	}
	
	
	
	
	
	public static void pourcentage(double carteBleu , double virement  , double cheque) {
		
		double total;
		
		total = carteBleu  + virement + cheque;
		
		carteBleu = (carteBleu /(double) total) * 100;
		virement = (virement /(double) total) * 100;
		cheque = (cheque /(double) total) * 100;
		
		System.out.println(carteBleu + "% par Carte Bleu" );
		System.out.println(virement + "% par Cheque");
		System.out.println(cheque + "% par Virement" );
	}

}
