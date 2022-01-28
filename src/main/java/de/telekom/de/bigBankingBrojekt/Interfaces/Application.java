package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.io.IOException;

public interface Application {
	
	/** die run Methode wurde durch die Starter Klasse aufgerufen
	*   die Methode selbst ruft unser Menü (MenüView) auf
	*/
	void run(String[] args) throws IOException, Exception;

}
