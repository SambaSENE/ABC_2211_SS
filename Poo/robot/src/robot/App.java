package robot;

import robot.Robot.Deplacement;

public class App {

	public static void main(String[] args) {

		Robot b52 = new Robot("Noa", false, false, false);
		b52.allumerRobot();
		b52.deplacer(Deplacement.GAUCHE);
		b52.deplacer(Deplacement.DROITE);
		b52.deplacer(Deplacement.AVANT);
		b52.eteindreRobot();
		b52.deplacer(Deplacement.AVANT);
		
		String b52String = b52.toString();
		System.out.println(b52String);
	}

}
