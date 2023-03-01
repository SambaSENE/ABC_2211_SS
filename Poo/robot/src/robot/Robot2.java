import java.util.Random;

public class Robot2 {
	private String nomRobot;
	private boolean estAllume;
	private boolean peutSeDeplacer;
	private boolean avecCargaison;

	public enum Deplacement {
		AVANT, ARRIERE, GAUCHE, DROITE;
	}

	public Robot2(String nomRobot, boolean estAllume, boolean peutSeDeplacer, boolean avecCargaison) {
		this.nomRobot = nomRobot;
		this.estAllume = estAllume;
		this.peutSeDeplacer = peutSeDeplacer;
		this.avecCargaison = avecCargaison;
	}

	public int calculerDistance() {
		Random rand = new Random();
		final int DISTANCE_MIN = 0;
		final int DISTANCE_MAX = 100;
		int distance = rand.nextInt(DISTANCE_MAX - DISTANCE_MIN + 1) + DISTANCE_MIN;
		return distance;
	}

	public String getNomRobot() {
		return nomRobot;
	}

	public void setNomRobot(String nomRobot) {
		this.nomRobot = nomRobot;
	}

	public boolean allumerRobot() {
		if (!estAllume) {
			estAllume = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean eteindreRobot() {
		if (estAllume) {
			estAllume = false;
			peutSeDeplacer = false;
			return true;
		} else {
			return false;
		}
	}

	public boolean seDeplacer() {
		if (!estAllume) {
			return false;
		}

		int distance = calculerDistance();

		if (distance < 10) {
			peutSeDeplacer = false;
			return false;
		} else {
			peutSeDeplacer = true;
			return true;
		}
	}

	public String deplacer(Deplacement deplacement) {
		if (!peutSeDeplacer) {
			return "Le robot ne peut pas se déplacer";
		}

		String message = "";

		switch (deplacement) {
			case AVANT:
				message = "Le robot avance";
				break;
			case ARRIERE:
				message = "Le robot recule";
				break;
			case GAUCHE:
				message = "Le robot tourne à gauche";
				break;
			case DROITE:
				message = "Le robot tourne à droite";
				break;
			default:
				message = "Déplacement invalide";
				break;
		}

		return message;
	}

	public boolean chargerCargaison() {
		if (!estAllume) {
			return false;
		}

		if (avecCargaison) {
			return false;
		}

		avecCargaison = true;
		return true;
	}

	public boolean dechargerCargaison() {
		if (!estAllume) {
			return false;
		}

		if (!avecCargaison) {
			return false;
		}

		avecCargaison = false;
		return true;
	}

	@Override
	public String toString() {
		return "Nom du robot : " + nomRobot + " | allumé : " + estAllume + " | peut se déplacer : " + peutSeDeplacer +
				" | cargaison : " + avecCargaison;}
