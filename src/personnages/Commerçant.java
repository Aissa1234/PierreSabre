package personnages;

	public class Commer�ant extends Humain {
			public Commer�ant(String nom, int argent) {
				super(nom,"th�", argent);
		}
			public int seFaireExtorquer() {
				int tune =getArgent();
				perdreArgent(tune);
				parler("J�ai tout perdu! Le monde est trop injuste...");
				return tune;
			}
			
			public void recevoir(int don) {
				gagnerArgent(don);
				parler( don+" sous! Je te remercie g�n�reux donateur!");
			}
	}
