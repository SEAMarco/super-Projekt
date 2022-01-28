package de.telekom.de.bigBankingBrojekt.Interfaces;

public interface Zahlung {
	/**Get Methode mit Beispiel mit normaler Exception Klasse aus Java*/
	String getEmpfaenger() throws Exception;
	
	/** Get Methode mit Beispiel mit normaler Exception Klasse aus Java */
	String getEmpfaengerIBAN() throws Exception;
	
	/** Get Methode mit Beispiel mit normaler Exception Klasse aus Java */
	String getEmpfaengerBIC() throws Exception;
	
	/** Get Methode mit Runtime Exception Beispiel */
	double getBetrag() ;
	
	/** Get Methode mit Beispiel mit normaler Exception Klasse aus Java */
	String getWaehrung() throws Exception;
	
	/** Get Methode mit Beispiel mit normaler Exception Klasse aus Java */
	String getVerwendungszweck() throws Exception;
	
	public int getCounter();

}
