package personnages;

	public class Commerçant extends Humain {
			public Commerçant(String nom, int argent) {
				super(nom,"thé", argent);
		}
			public int seFaireExtorquer() {
				int tune =getArgent();
				perdreArgent(tune);
				parler("J’ai tout perdu! Le monde est trop injuste...");
				return tune;
			}
			
			public void recevoir(int don) {
				gagnerArgent(don);
				parler( don+" sous! Je te remercie généreux donateur!");
			}
	}
