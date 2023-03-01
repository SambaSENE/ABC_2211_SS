package robot;

import java.util.Random;

public class Robot {
	private String nomRobot;
	private boolean estAllumer;
	private boolean peutSeDeplacer;
	private boolean avecCargaison;

	public enum Deplacement {
		AVANT, ARRIERE, GAUCHE, DROITE;
	}

	public Robot(String _nomRobot, boolean _estAllumer, boolean _peutSeDeplacer, boolean _avecCargaison) {
		this.nomRobot = _nomRobot;
		this.estAllumer = _estAllumer;
		this.peutSeDeplacer = _peutSeDeplacer;
		this.avecCargaison = _avecCargaison;
	}

	public int calculerDistance() {
		Random rand = new Random();

		final int bMin = 0;
		final int bMax = 100;
		int distance = rand.nextInt(bMin - bMax + 1) + bMin;
		return distance;
	}

	public String getname() {
		return this.nomRobot;
	}

	public void setname(String name) {
		this.nomRobot = name;
	}

	public boolean allumerRobot() {
		if (!this.estAllumer) {
			this.estAllumer = true;
			return true;
		} else {
			return false;
		}

	}

	public boolean eteindreRobot() {
		if (this.estAllumer) {
			this.estAllumer = false;
			return true;
		} else {
			return false;
		}
	}

	public boolean seDeplacer() {
		if (!this.estAllumer) {
			return false;
		} else {
			int distance = calculerDistance();

			if (distance > 10) {
				this.peutSeDeplacer = true;
				return true;
			} else {
				this.peutSeDeplacer = false;
				return false;
			}
		}

	}

	public String deplacer(Deplacement move) {
		String str = "";

		if (this.peutSeDeplacer && this.estAllumer) {

			switch (move) {
			case AVANT: {
				str = "le robot avance";
				break;
			}
			case ARRIERE: {
				str = "le robot recule";
				break;
			}
			case GAUCHE: {
				str = "le robot tourne gauche";
				break;
			}
			case DROITE: {
				str = "le robot tourne droite";
				break;
			}
			default: {
				break;
			}

			}
		} else {
			return "Le robot ne peut pas se déplacer";
		}
		return str;
	}

	public boolean chargerCargaison() {
		if (!this.estAllumer && this.avecCargaison) {
			return false;
		} else {
			this.avecCargaison = true;
			return true;
		}
	}

	public boolean dechargerCargaison() {
		if (!this.estAllumer && !this.avecCargaison) {
			return false;
		} else {
			this.avecCargaison = false;
			return true;
		}
	}

	public String toString() {
		return " Nom du robot :  " + nomRobot + "\n"+ " | alumer : " + estAllumer +  "\n" +" | etient : " + estAllumer + "\n"
				+ " | se deplace: " + peutSeDeplacer +  "\n" +"| colis charger  :" + avecCargaison;
	}

}
