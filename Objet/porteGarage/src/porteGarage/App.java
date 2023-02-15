package porteGarage;

public class App {

	public static void main(String[] args) {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		PorteGarage basculante = new PorteGarage("Veleda" , "basculante" , "PVC" , 50 , false);
		
		boolean ok = basculante.ouvrir(0);
		System.out.println(ok);
		
		boolean okf = basculante.fermer();
		System.out.println(okf);
		
		boolean okv = basculante.verrouller();
		System.out.println(okv);
		
		boolean okdv = basculante.deverrouller();
		System.out.println(okdv);
		
		boolean okPO = basculante.ouvrir(50);
		System.out.println(okPO);
		
		boolean okClose = basculante.fermer();
		System.out.println(okClose);
		
		String basculantetoString = basculante.toString();
		System.out.println(basculantetoString);

=======
=======
>>>>>>> Stashed changes
		PorteGarage basculate = new PorteGarage("veleta" , 30 , 100 , 0 , true);

		
		boolean test = basculate.ouvrir(30);
		System.out.println(test);
		// ----------------------------------------------------------------------------------------
		String portetoString = basculate.toString();
		System.out.println(portetoString);
>>>>>>> Stashed changes
	}

}
