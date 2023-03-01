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
		if (this.estAllumer == false) {
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
		int distance = calculerDistance();

		if (this.estAllumer) {
			if (distance < 10) {
				this.peutSeDeplacer = false;
				return false;
			} else {
				this.peutSeDeplacer = true;
				return true;
			}
		} else {
			return false;
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
			}default :
			{
				break;
			}
			

			}
		}
		return str;
	}

	public boolean chargerCargaison() {
		if (this.estAllumer) {
			if (!this.avecCargaison) {
				this.avecCargaison = true;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean dechargerCargaison() {
		if (this.estAllumer) {
			if (this.avecCargaison) {
				this.avecCargaison = false;
				return true;
			} else {
				return false;
			}
		} else {
			return false;

		}
	}

	public String toString() {
		return " Nom du robot :  " + nomRobot + " | alumer : " + estAllumer + " | etient : " + estAllumer
				+ " | se deplace : " + peutSeDeplacer + "| colis charger  :" + avecCargaison;
	}

}
