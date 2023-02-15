package formation;

public class App {

	public static void main(String[] args) {
		
		Etudiant devellopper = new Etudiant("Sene" , "Samba" , 38 , false);
		
		devellopper.setPrenom("adam");
		devellopper.setNom("Sene");
		devellopper.setGenre(true);
		
		String etudianttest = devellopper.toString();
		System.out.println(etudianttest);

	}

}
