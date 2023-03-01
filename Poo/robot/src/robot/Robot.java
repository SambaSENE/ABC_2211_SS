package robot;

import java.util.Random;

public class Robot {
    private String nomRobot;
    private boolean estAllume;
    private boolean peutSeDeplacer;
    private boolean avecCargaison;

    public enum Deplacement {
        AVANT, ARRIERE, GAUCHE, DROITE
    }

    public Robot(String nomRobot, boolean estAllume, boolean peutSeDeplacer, boolean avecCargaison) {
        this.nomRobot = nomRobot;
        this.estAllume = estAllume;
        this.peutSeDeplacer = peutSeDeplacer;
        this.avecCargaison = avecCargaison;
    }

    public int calculerDistance() {
        Random rand = new Random();

        final int bMin = 0;
        final int bMax = 100;
        int distance = rand.nextInt(bMax - bMin + 1) + bMin;
        return distance;
    }

    public String getNomRobot() {
        return this.nomRobot;
    }

    public void setNomRobot(String nomRobot) {
        this.nomRobot = nomRobot;
    }

    public boolean allumerRobot() {
        if (!this.estAllume) {
            this.estAllume = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean eteindreRobot() {
        if (this.estAllume) {
            this.estAllume = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean seDeplacer() {
        if (!this.estAllume) {
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

    public String deplacer(Deplacement deplacement) {
        String message = "";

        if (this.peutSeDeplacer && this.estAllume) {
            switch (deplacement) {
                case AVANT:
                    message = "le robot avance";
                    break;
                case ARRIERE:
                    message = "le robot recule";
                    break;
                case GAUCHE:
                    message = "le robot tourne à gauche";
                    break;
                case DROITE:
                    message = "le robot tourne à droite";
                    break;
            }
        } else {
            message = "Le robot ne peut pas se déplacer";
        }

        return message;
    }

    public boolean chargerCargaison() {
        if (!this.estAllume && !this.avecCargaison) {
            this.avecCargaison = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean dechargerCargaison() {
        if (!this.estAllume && this.avecCargaison) {
            this.avecCargaison = false;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Nom du robot : " + nomRobot + "\n" +
                "Allumé : " + estAllume + "\n" +
                "Peut se déplacer : " + peutSeDeplacer + "\n" +
                "Avec cargaison : " + avecCargaison;
    }
}
