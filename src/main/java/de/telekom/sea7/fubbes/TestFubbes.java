package de.telekom.sea7.fubbes;

public class TestFubbes {

	public static void main(String[] args) {
	
		// Spieler generieren
		Spieler spieler1 = new Spieler("Herbert", 50);
		Spieler spieler2 = new Spieler("Olaf", 40);
		Spieler spieler3 = new Spieler("Marco", 70);
		Spieler spieler4 = new Spieler("Julian", 10);
		
		System.out.println(spieler1.toString());
		System.out.println(spieler2.toString());
		System.out.println(spieler3.toString());
		System.out.println(spieler4.toString());
		
		// Mannschaften generieren
		Mannschaft team1 = new Mannschaft("Fantasy-Team");
		Mannschaft team2 = new Mannschaft("Dortmund");
		
		System.out.println(team1);
		System.out.println(team2);
		
		team1.addSpieler(spieler1);
		team1.addSpieler(spieler2);
		team2.addSpieler(spieler3);
		team2.addSpieler(spieler4);
				
		System.out.println(team1);
		System.out.println(team2);
		
		
		
		// Spiel generieren
		Spiel spiel1 = new Spiel();
		
		spiel1.addMannschaft(team1);
		spiel1.addMannschaft(team2);
				
		System.out.println(spiel1);
		
		spiel1.anpfiff(50, 40, 70, 10);
		System.out.println(spiel1);
	}

}
