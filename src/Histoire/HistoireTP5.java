package Histoire;

import personnages.*;
public class HistoireTP5 {

	public static void main(String[] args) {

		Commerçant marco = new Commerçant("Marco", 20);
		Commerçant chonin = new Commerçant("Chonin", 40);
		Commerçant kumi = new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", "Warsong",30);
		Ronin roro = new Ronin ("Roro", "shochu", 60);
		Samourai akimoto=new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		
	marco.direBonjour();
	marco.seFaireExtorquer();
	marco.recevoir(15);
	marco.Boire();
		
		
		
yaku.direBonjour();
yaku.extorquer(marco);
		
		
	roro.direBonjour();
	roro.donner(marco);
	roro.provoquer(yaku);
		
	marco.seFaireConnaissanceAvec(roro);
	marco.seFaireConnaissanceAvec(yaku);
	marco.seFaireConnaissanceAvec(chonin);
	marco.seFaireConnaissanceAvec(kumi);
	marco.listerConnaissance();
	roro.listerConnaissance();
	kumi.listerConnaissance();
	yaku.direBonjour();
	
		
		
		akimoto.seFaireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
	}

}
