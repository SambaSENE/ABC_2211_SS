package robot.Class;

public enum ORIENTATION {
	NORD(1) , EST(1),SUD(-1) ,OUEST(-1);
	
	
	
	// private String lettres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int positionY ;
	private int positionX ;
	
	
	private int coord;
	ORIENTATION(int _coord){
		this.coord = _coord;
	}
//	
//	 public int correspondanceLettresPositionX() {
//	        for(int i = 0 ; i< lettres.length() ; i++) {
//	        	this.positionX = i;
//	        }
//	        return this.positionX;
//	    }

  public int correspondanceNombresPositionX() {
     
  }
  
  public ORIENTATION getDirection() {
	if(this.positionY > 0 ) {
		return NORD;
	}  else if(this.positionY< 0) {
		return SUD;
	}else if(this.positionX > 0) {
		return EST;
	}else if(this.positionX < 0 ) {
		return OUEST;
	}else {
		System.out.println( "Inconnue");
	}
  }
	
  
	
}
