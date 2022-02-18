package de.telekom.sea7.bigBankingBrojekt.Interfaces;

import java.io.IOException;

public interface Zahlungen extends GenericList<Zahlung> {
	
	
	/**liest eine CSV Datei ein und speichert die Daten in einer ArrayList & Counter */
	public void multiImport() throws IOException;
	
	/**Methode interiert vorhandes Array und schreibt jede Iteration in eine neue Zeile einer csv Datei*/
	void multiExport(Zahlungen zahlungen) throws Exception, IOException;
	
	public int getCounter();
	
	public void setCounter(int counter);

}
