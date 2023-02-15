package bureauReglabe;

public class BureauReglable {
	private final String MARQUE;
	private double  hauteur;
	private final double HAUTEURMINENCM;
	private final double HAUTEURMAXENCM;
	private boolean button;
	
	
	
	public BureauReglable() {
		this.MARQUE = "Crm";
		this.hauteur = 110;
		this.HAUTEURMINENCM = 60;
		this.HAUTEURMAXENCM = 135;
		this.button  = false;
	}
	
	public BureauReglable(String _marque ,  double _hauteur ,  double _hauteurMinEnCm , double _hauteurMaxEnCm ,  boolean _button) {
		this.MARQUE = _marque;
		this.hauteur = _hauteur;
		this.HAUTEURMINENCM = _hauteurMinEnCm;
		this.HAUTEURMAXENCM = _hauteurMaxEnCm;
		this.button = _button;
	}
	
	// pressButton
	public boolean pressButton() {
		if(this.button) {
			this.button = true;
			return true;
			
		}else {
			return false;
		}
	}
	// monter()
	public boolean monter(double niveauPlus) {
		if(!this.button) {
			if(this.hauteur + niveauPlus > this.HAUTEURMINENCM && this.hauteur + niveauPlus < this.HAUTEURMAXENCM) {
				this.hauteur += niveauPlus;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	// decendre()
	
	public boolean descendre(double niveauMoin) {
		if(this.button) {
			if(this.hauteur - niveauMoin > this.HAUTEURMINENCM  && this.hauteur - niveauMoin < this.HAUTEURMAXENCM) {
				this.hauteur -= niveauMoin;
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	@Override
	
	public String toString() {
		return "Marque " + this.MARQUE + " Hauteur " + this.hauteur + " Hauteur min " + this.HAUTEURMINENCM + " hauteur max "  + " boutton " +  this.button;
	}
}
