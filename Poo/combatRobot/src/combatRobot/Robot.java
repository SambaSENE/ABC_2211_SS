package combatRobot;

public class Robot {
	private String name;
	private int sante;
	private boolean charger;

	public Robot() {
		this.name = " ";
		this.sante = 10;
	}

	public Robot(String _name , int sante , boolean _charger) {
		this.name = _name;
		this.sante = sante;
		this.charger = true;
	}

	public boolean fire(Robot robot2) {
		if(this.charger) {
			sante -= 2;
			return true;
			
		}else {
			return false;
		}
	}

	public boolean isDead() {
		return this.sante <= 0;
	}

	public void setName(String robotCible) {
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Robot " + this.name;
	}
}
