package robot.Class;

public class Robot {
	
    private String nonRobot;
    private String maximumX;
    private int maximumY;
    private final String minimumX;
    private final int minimumY;
    private Boolean colisSurRobot;
    private int positionX;
    private int positionY;

    public Robot(String nonRobot, String maximumX, int maximumY, String minimumX, int minimumY, Boolean colisSurRobot, int positionX, int positionY) {
        this.nonRobot = nonRobot;
        this.maximumX = maximumX;
        this.maximumY = maximumY;
        this.minimumX = minimumX;
        this.minimumY = minimumY;
        this.colisSurRobot = colisSurRobot;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    

   


    public boolean allerAgauche() {
        
    }

    public boolean allerAdroite() {
        
    }

    public boolean monter() {
       
    }

    public boolean descendre() {
        
    }

    public boolean retournerAuDepart() {
       
    }

    public boolean prelever() {
            }

    public boolean deposer() {
        
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

    public boolean getColisSurRobot() {
        return colisSurRobot;
    }

    public String toString() {
        return "Robot: " + nonRobot + ", maximumX: " + maximumX + ", maximumY: " + maximumY + ", colisSurRobot: " + colisSurRobot + ", positionX: " + positionX + ", positionY: " + positionY;
    }
}






	
	

