package personnages;

public class Humain {
	
	private String nom;
	private String boissonPref;
	private int argent;
	
	public Humain(String nom,String boissonPref,int argent) {
		this.nom=nom;
		this.boissonPref=boissonPref;
		this.argent=argent;
		}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		System.out.println("Bonjour ! je m'appelle "+nom+" et j'aime boire du "+boissonPref);
	}
	
	public void Boire() {
		System.out.println("Mmmm,un bon verre de "+boissonPref+" ! GLOUPS!");
	}


	public void perdreArgent(int perte) {
	argent -= perte;
	}

	public void gagnerArgent(int gain) {
	argent += gain;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}

	public void Acheter(String bien,int prix) {
			if (argent>=prix) {
				System.out.println("- J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+ " à "+prix+" sous");
				perdreArgent(prix);
			}
			else {
				System.out.println("Je n'ai plus que " + argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+"  à "+prix+ " sous.");
				
			}
		}
	}

	

