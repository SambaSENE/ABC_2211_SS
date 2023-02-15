package formation;

public class Etudiant {
	private String nomEtudiant;
	private String prenomEtudiant;
	private int  age;
	private boolean genre;
	
	public Etudiant() {
		this.nomEtudiant = "inconnue";
		this.prenomEtudiant = "inconnue";
		this.age = 0;
		this.genre = true;
		
	}
	
	public Etudiant(String _nomEtudiant , String _prenomEtudiant, int _age , boolean _genre) {
		this.nomEtudiant = _nomEtudiant;
		this.prenomEtudiant = _prenomEtudiant;
		this.age = _age;
		this.genre = _genre;
	}
	
	public String getNom() {
		return this.nomEtudiant;
	}
	
	public void setNom( String _nom) {
		this.nomEtudiant = _nom;
	}
	
	public String getPrenom() {
		return this.prenomEtudiant;
	}
	public void setPrenom(String _prenom) {
		this.prenomEtudiant = _prenom;
	}
	
	public int getAge() {
		return this.age;
	}
	public void getAge(int _age) {
		this.age = _age;
	}
	
	public boolean getGenre() {
		return this.genre;
	}
	public void setGenre( boolean _genre) {
		this.genre = _genre;
	}
	
	
	
	@Override
	
	public String toString() {
		return " Nom " + this.nomEtudiant + " Prenom " + this.prenomEtudiant + " Age " + this.age + " Sexe " + this.genre;
	}
	
}
