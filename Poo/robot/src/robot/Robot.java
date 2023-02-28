package robot;

public class Robot {
	private String nomRobot;
	private boolean estAllumer;
	private boolean peutSeDeplacer;
	private boolean  avecCargaison;
	
	
	
	public enum Deplacement{
		AVANT,
		ARRIERE,
		GAUCHE,
		DROITE;
	}
	
	public Robot(String _nomRobot, boolean _estAllumer, boolean _peutSeDeplacer,boolean _avecCargaison )
	{
		this.nomRobot = _nomRobot;
		this.estAllumer = _estAllumer;
		this.peutSeDeplacer = _peutSeDeplacer;
		this.avecCargaison = _avecCargaison;
	}
	public String getname()
	{
		return this.nomRobot ;
	}
	
	public void setname(String name)
	{
		this.nomRobot = name;
	}
	
	public boolean allumerRobot()
	{
		if(this.estAllumer) {
			this.estAllumer = true;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean eteindreRobot()
	{
		if(this.estAllumer) {
			this.estAllumer = false;
			return false;
		}else {
			return true;
		}
	}
	
	public int calculerDistance()
	{
		
	}
	
	public boolean seDeplacer(Deplacement deplacement, int distance)
	{
		if(this.peutSeDeplacer ) {
			if(distance > 0) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public boolean chargerCargaison()
	{
		
	}
	
	public boolean dechargerCargaison()
	{
		
	}
	public String toString()
	{
		
	}
}
