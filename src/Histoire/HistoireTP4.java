package Histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;


public class HistoireTP4 {
	
public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.Acheter("boisson", 12);
		prof.Boire();
		prof.Acheter("jeu", 2);
		prof.Acheter("kimono", 50);

	Commerçant marco = new Commerçant("Marco",20);
	marco.direBonjour();
	marco.seFaireExtorquer();
	marco.recevoir(15);
	marco.Boire();
	
	
	Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir","whisky","Warsong",30);
	yakuLeNoir.direBonjour();
	yakuLeNoir.extorquer(marco);
	
	Ronin roro = new Ronin("Roro","shochu",60);
	roro.direBonjour();
	roro.donner(marco);
	
	roro.provoquer(yakuLeNoir);
}
}
