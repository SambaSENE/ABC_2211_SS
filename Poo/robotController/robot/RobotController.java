package robot;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RobotController extends JFrame implements ActionListener {
	private Robot robot;
	private JButton buttonLeft;
	private JButton buttonRight;
	private JButton buttonUp;
	private JButton buttonDown;
	private JButton buttonPick;
	private JButton buttonDrop;

	public RobotController(Robot robot) {
		super("Robot Controller");
		this.robot = robot;

		// Create buttons
		buttonLeft = new JButton("<");
		buttonRight = new JButton(">");
		buttonUp = new JButton("^");
		buttonDown = new JButton("v");
		buttonPick = new JButton("Pick up");
		buttonDrop = new JButton("Drop off");

		// Add action listeners
		buttonLeft.addActionListener(this);
		buttonRight.addActionListener(this);
		buttonUp.addActionListener(this);
		buttonDown.addActionListener(this);
		buttonPick.addActionListener(this);
		buttonDrop.addActionListener(this);

		// Create panel with buttons
		JPanel panel = new JPanel(new GridLayout(2, 3));
		panel.add(buttonLeft);
		panel.add(buttonUp);
		panel.add(buttonRight);
		panel.add(buttonDown);
		panel.add(buttonPick);
		panel.add(buttonDrop);

		// Add panel to frame
		add(panel);

		// Set frame properties
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == buttonLeft) {
			robot.allerA(Action.ALLER_A_GAUCHE, 1);
		} else if (source == buttonRight) {
			robot.allerA(Action.ALLER_A_DROITE, 1);
		} else if (source == buttonUp) {
			robot.allerA(Action.MONTER, 1);
		} else if (source == buttonDown) {
			robot.allerA(Action.DESCENDRE, 1);
		} else if (source == buttonPick) {
			robot.prelever();
		} else if (source == buttonDrop) {
			robot.deposer();
		}
	}

	public static void main(String[] args) {
		Robot robot = new Robot();
		RobotController controller = new RobotController(robot);
	}

}
