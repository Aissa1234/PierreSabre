package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	public Samourai (String seigneur,String nom,String boissonPref,int argent) {
		super(nom,boissonPref,argent);
		this.seigneur=seigneur;
		
	}
	public String getSeigneur() {
		return seigneur;
	}
	public void direBonjour() {
		super.direBonjour();
		parler("je suis fier de servir le seigneur"+getSeigneur());
	}
	public void Boire(String boisson) {
		System.out.println("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}
	
}
