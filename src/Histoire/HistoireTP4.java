package Histoire;

import personnages.Commer�ant;
import personnages.Humain;


public class HistoireTP4 {
	
public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.Acheter("boisson", 12);
		prof.Boire();
		prof.Acheter("jeu", 2);
		prof.Acheter("kimono", 50);

	Commer�ant marco = new Commer�ant("Marco",20);
	marco.direBonjour();
	marco.seFaireExtorquer();
	marco.recevoir(15);
	marco.Boire();
}
}
