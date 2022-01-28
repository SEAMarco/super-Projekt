package de.telekom.sea7.tennisturnier;

public class Tennisturnier {
	
	private Tennisspieler s1;
	private Tennisspieler s2;
	private Tennisspieler s3;
	
	public Tennisturnier() {
		s1 = new Tennisspieler("Rafael",  4);
		s2 = new Tennisspieler("Boris" , 10);
		s3 = new Tennisspieler("Steffi",  7);
		
		duellStarten(s1,s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	

	public void duellStarten(Tennisspieler s1, Tennisspieler s2) {
		
		s1.erhoeheSpielUm1();
		s2.erhoeheSpielUm1();
		
		if(s1.getItn() > s2.getItn()) {
			s1.erhoeheSiegeUm1();
			s2.erhoeheNiederlagenUm1();
		} else if(s1.getItn() < s2.getItn()) {
			s2.erhoeheSiegeUm1();
			s1.erhoeheNiederlagenUm1();
		} else {
			// bei gleicher Stärke Zufallsgenerator
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		// Initialisierung eines Turniers mittels der Spieler die wir in der Methode Tennisturnier initialisieren
		Tennisturnier t1 = new Tennisturnier();
	}
	
}
