package robot;

public class RobotArm {
	public enum Action {
	    ALLER_A_GAUCHE, ALLER_A_DROITE, MONTER, DESCENDRE, RETOURNER_AU_DEPART, PRELEVER, DEPOSER;
	}

	// Attributs
	private final String lettres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String nomRobot;
	private String maximumX;
	private int maximumY;
	private String positionX;
	private int positionY;
	private boolean colisSurRobot;

	// Constructeurs
	public RobotArm() {
	    this.nomRobot = "Robot Kaz Yeah! SA";
	    this.maximumX = "J";
	    this.maximumY = 5;
	    this.positionX = "A";
	    this.positionY = 1;
	}

	public RobotArm(String nomRobot, String maximumX, int maximumY, String positionX, int positionY) {
	    this.nomRobot = nomRobot;
	    this.maximumX = maximumX;
	    this.maximumY = maximumY;
	    this.positionX = positionX;
	    this.positionY = positionY;
	}

	// Getters et Setters
	public String getNomRobot() {
	    return nomRobot;
	}

	public void setNomRobot(String nomRobot) {
	    this.nomRobot = nomRobot;
	}

	public String getMaximumX() {
	    return maximumX;
	}

	public void setMaximumX(String maximumX) {
	    this.maximumX = maximumX;
	}

	public int getMaximumY() {
	    return maximumY;
	}

	public void setMaximumY(int maximumY) {
	    this.maximumY = maximumY;
	}

	public String getPositionX() {
	    return positionX;
	}

	public void setPositionX(String positionX) {
	    this.positionX = positionX;
	}

	public int getPositionY() {
	    return positionY;
	}

	public void setPositionY(int positionY) {
	    this.positionY = positionY;
	}

	public boolean isColisSurRobot() {
	    return colisSurRobot;
	}

	// Fonctions
	public boolean allerA(Action action, int distance) {
	    switch (action) {
	        case ALLER_A_GAUCHE:
	            if (positionX.equals("A")) {
	                return false;
	            }
	            setPositionX(Character.toString((char) (positionX.charAt(0) - distance)));
	            return true;

	        case ALLER_A_DROITE:
	            if (positionX.equals(maximumX)) {
	                return false;
	            }
	            setPositionX(Character.toString((char) (positionX.charAt(0) + distance)));
	            return true;

	        case MONTER:
	            if (positionY == maximumY) {
	                return false;
	            }
	            setPositionY(positionY + distance);
	            return true;

	        case DESCENDRE:
	            if (positionY == 1) {
	                return false;
	            }
	            setPositionY(positionY - distance);
	            return true;

	        case RETOURNER_AU_DEPART:
	            setPositionX("A");
	            setPositionY(1);
	            return true;

	        default:
	            return false;
	    }
	}

	public boolean prelever() {
	    if (colisSurRobot) {
	        return false;
	    }
	    colisSurRobot = true;
	    return true;
	}

	public boolean deposer() {
	    if (!colisSurRobot || positionX != "A" || positionY != 1) {
	        return false;
	    }
	    colisSurRobot = false;
	    return true;
	}
}
