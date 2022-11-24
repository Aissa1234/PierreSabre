package personnages;

public class Traitres extends Samourai {
	private int traitrise=0;
	
	public Traitres(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
	}
	public int getTraitrise() {
		return traitrise;
	}
	public void direBonjour() {
		super.direBonjour();
		parler("Mon traitrise est :"+getTraitrise());
	}
		
	public void raconner(Commerçant commercant) {
		
		
	}
	
	
}


