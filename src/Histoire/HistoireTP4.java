package Histoire;


import personnages.Humain;


public class HistoireTP4 {
	
public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.Acheter("boisson", 12);
		prof.Boire();
		prof.Acheter("jeu", 2);
		prof.Acheter("kimono", 50);
}

}
