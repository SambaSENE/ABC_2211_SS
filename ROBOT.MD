public class MilitaryRobot extends Robot {
    private boolean weaponSystemEnabled;
    private int ammunition;

    public MilitaryRobot(double startX, double startY) {
        super(startX, startY);
        this.weaponSystemEnabled = false;
        this.ammunition = 0;
    }

    public void enableWeaponSystem() {
        this.weaponSystemEnabled = true;
    }

    public void disableWeaponSystem() {
        this.weaponSystemEnabled = false;
    }

    public void fireWeapon() {
        if (this.weaponSystemEnabled && this.ammunition > 0) {
            // code to fire the weapon
            this.ammunition--;
        }
    }

    public void reloadWeapon(int amount) {
        this.ammunition += amount;
    }
}



_________________________________________________________
private Telecommande telecommande;
private double angle;
private double distance;
private boolean raisingLeftArm;
private boolean raisingRightArm;
private boolean closingGripper;

public Joystick(Telecommande telecommande) {
    this.telecommande = telecommande;
    this.angle = 0.0;
    this.distance = 0.0;
    this.raisingLeftArm = false;
    this.raisingRightArm = false;
    this.closingGripper = false;
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.WHITE);
    setFocusable(true);
    addKeyListener(this);
    Timer timer = new Timer(DELAY, this);
    timer.start();
}

@Override
public void actionPerformed(ActionEvent e) {
    double angleRad = Math.toRadians(angle);
    double dx = distance * Math.cos(angleRad);
    double dy = distance * Math.sin(angleRad);
    if (dx != 0.0 || dy != 0.0) {
        telecommande.avancer(DISTANCE_STEP * dx);
        telecommande.tournerAGauche(DISTANCE_STEP * Math.toDegrees(Math.atan2(dy, dx)));
    }
    if (raisingLeftArm) {
        telecommande.leverBrasGauche();
    } else {
        telecommande.baisserBrasGauche();
    }
    if (raisingRightArm) {
        telecommande.leverBrasDroit();
    } else {
        telecommande.baisserBrasDroit();
    }
    if (closingGripper) {
        telecommande.fermerPince();
    } else {
        telecommande.ouvrirPince();
    }
    repaint();
}

@Override
public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            angle -= ANGLE_STEP;
            break;
        case KeyEvent.VK_RIGHT:
            angle += ANGLE_STEP;
            break;
        case KeyEvent.VK_UP:
            distance += DISTANCE_STEP;
            break;
        case KeyEvent.VK_DOWN:
            distance -= DISTANCE_STEP;
            break;
        case KeyEvent.VK_Q:
            raisingLeftArm = true;
            break;
        case KeyEvent.VK_A:
            raisingLeftArm = false;
            break;
        case KeyEvent.VK_W:
            raisingRightArm = true;
            break;
        case KeyEvent.VK_S:
            raisingRightArm = false;
            break;
        case KeyEvent.VK_SPACE:
            closingGripper = !closingGripper;
            break;
    }
}

@Override
public void keyReleased(KeyEvent e) {
    switch (e.getKeyCode()) {
        case KeyEvent.VK_Q:
            raisingLeftArm = false;
            break;
        case KeyEvent.VK_W:
           
