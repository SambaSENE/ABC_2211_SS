package robot;

import robot.Robot.Deplacement;

public class App {

	public static void main(String[] args) {
		
		Robot b52 = new Robot("Noa" , true , false , false );
		
		// b52.eteindreRobot();
		String okBouge = b52.deplacer(Deplacement.DROITE);
		System.out.println(okBouge);
		
		
		String b52String = b52.toString();
		System.out.println(b52String);
	}

}
