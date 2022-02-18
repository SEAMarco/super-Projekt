package de.telekom.sea7.bigBankingBrojekt;

/** Eigene Exception Klasse
 */



public class OutOfRangeException extends Exception {
	
	
	/** bei Aufruf der Methode wenn eine entsp. OutOfRangeException auftritt
	 *  wird der Methode ein Fehlertext übergeben welche diese in der Console ausgibt
	 */
	public OutOfRangeException (String message) {
		super (message);
	}

}
