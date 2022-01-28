package de.telekom.sea7.neuerTag;

public class Starter {

	public static void main(String[] args) {
		
		// Abstrakkt/allgemein            Konkret eine Anwendung
		ApplicationImpl applicationImpl = new ApplicationImpl();
		
		// Startet die Applikation
		applicationImpl.run(args);

	}

}
