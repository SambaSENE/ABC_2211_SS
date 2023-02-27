package robot;

public class Robot {
    // fields to store the robot's position and state
    private double x;
    private double y;
    private double orientation;
    private boolean leftArmRaised;
    private boolean leftGripperClosed;
    private boolean rightArmRaised;
    private boolean rightLanternOn;
    private boolean leftGripperOpen;

    // constructor
    public Robot(double startX, double startY) {
        this.x = startX;
        this.y = startY;
        this.orientation = 0.0;
        this.leftArmRaised = false;
        this.leftGripperClosed = false;
        this.rightArmRaised = false;
        this.rightLanternOn = false;
        this.leftGripperOpen = true;
    }

    // methods to control the robot's movement and actions
    public void tournerAGauche(double angle) {
        this.orientation -= angle;
    }

    public void tournerADroite(double angle) {
        this.orientation += angle;
    }

    public void avancer(double distance) {
        this.x += distance * Math.cos(Math.toRadians(this.orientation));
        this.y += distance * Math.sin(Math.toRadians(this.orientation));
    }

    public void reculer(double distance) {
        this.avancer(-distance);
    }

    public void leverBrasGauche() {
        this.leftArmRaised = true;
    }

    public void baisserBrasGauche() {
        this.leftArmRaised = false;
    }

    public void fermerPince() {
        this.leftGripperClosed = true;
    }

    public void ouvrirPince() {
        this.leftGripperClosed = false;
    }

    public void leverBrasDroit() {
        this.rightArmRaised = true;
    }

    public void baisserBrasDroit() {
        this.rightArmRaised = false;
    }

    public void allumerLanterne() {
        this.rightLanternOn = true;
    }

    public void eteindreLanterne() {
        this.rightLanternOn = false;
    }
}
