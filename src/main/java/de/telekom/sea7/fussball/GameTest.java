package de.telekom.sea7.fussball;

public class GameTest {

	public static void main(String[] args) {
		
		Spieler spieler1 = new Spieler("Herbert", 55);
		Spieler spieler2 = new Spieler("Olaf", 44);
		System.out.println(spieler1);
		System.out.println(spieler2);

		Mannschaft mannschaft1 = new Mannschaft();
		System.out.println(mannschaft1);
		
		mannschaft1.addSpieler(spieler1);
		System.out.println(mannschaft1);
		
		mannschaft1.setTeamname("Hansa Rostock");
		System.out.println(mannschaft1);
		
		mannschaft1.addSpieler(spieler2);
		System.out.println(mannschaft1);
		
		
	}

}
