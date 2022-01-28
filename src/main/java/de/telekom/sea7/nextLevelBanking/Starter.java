package de.telekom.sea7.nextLevelBanking;

public class Starter {
	// INHALT
	// - run-Mehtode zum direkten Einstieg in Objektorientierung
	// - Bekanntmachung einzelner Klassen für die Ausführung des Programms
	
	// Eigene Run Methode um direkt Objektorientiert zu sein
	public void run(String[] args) {
		
		// Instanz eines Models erstellen
		VorlageUeberweisung vorlageUeberweisung = new VorlageUeberweisung("TestEmpfaenger", "DE12TESTIBAN123", "BICXXX", 12.5, "€", "TestVerwendung");
		
		// Instanz einer View erstellen
		View tV = new View();
		
		// Model und View bekannt machen
		tV.setsT(vorlageUeberweisung);
		
		// Aufruf der Ausgabenmethode aus der View
		tV.menu();
		
	}
	
}
