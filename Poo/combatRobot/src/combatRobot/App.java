package combatRobot;

public class App {

	public static void main(String[] args) {

		Robot b52 = new  Robot();
		boolean  ok = b52.fire(b52);
		String  robot = b52.toString();
		System.out.println(robot);
	}

}
