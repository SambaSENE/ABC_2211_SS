package bureauReglabe;

public class App {

	public static void main(String[] args) {
		
		BureauReglable mustapha = new BureauReglable("Crm" , 100 , 60 , 135 , false);
		
		boolean okPressButton = mustapha.pressButton();
		System.out.println(okPressButton);
		
		boolean okMonter = mustapha.monter(13);
		System.out.println(okMonter);
		
		boolean okDecendre = mustapha.descendre(30);
		System.out.println(okDecendre);
			
		String toSTRG = mustapha.toString();
		System.out.println(toSTRG);

	}

}
