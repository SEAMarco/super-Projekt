package de.telekom.sea7.vererbung;

public class AutoTest2 {
	
	// Ist die Testklasse für die eigene Übung
	
	public static void main(String[] args) {
	
		Auto auto = new Auto(null, 1);
		System.out.println(auto.classnameList());
		
	
	// ERGEBNIS
	// Ausgabe Klassename Auto (3. Ebene)
	// AUsgabe Klassename BaseObject (2. Ebene)
	// Ausgabe Klassename Object.class (1. Ebene)
	
	
	}
	
}
