package de.telekom.de.bigBankingBrojekt.Implementation;

import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlung;

/**
 * Beschreibung einer einzelnen Zahlung
 */
public class ZahlungImpl implements Zahlung {

	private String empfaenger;
	private String empfaengerIBAN;
	private String empfaengerBIC;
	private double betrag;
	private String waehrung;
	private String verwendungszweck;
	private int counter;   /** dieser Counter erhält den Wert bei jeder Initialisierung
	 					       von der ZahlungenImpl (aktuelle ArrayPosition)*/
	

	/**
	 * Eigener Constructor, der direkt bereits Werte beim erstellen der Instanz in
	 * den Variablen speichert
	 */
	public ZahlungImpl(String empfaenger, String empfaengerIBAN, String empfaengerBIC, double betrag, String waehrung,
			String verwendungszweck, int counter) {

		this.empfaenger = empfaenger;
		this.empfaengerIBAN = empfaengerIBAN;
		this.empfaengerBIC = empfaengerBIC;
		this.betrag = betrag;
		this.waehrung = waehrung;
		this.verwendungszweck = verwendungszweck;
		this.counter = counter;
		
	}

	public String getEmpfaenger() throws Exception {
		if (empfaenger == null) {
			throw new Exception("Der Empfänger darf nicht leer sein.");
		} else {
			return empfaenger;
		}
	}

	public String getEmpfaengerIBAN() throws Exception {
		if (empfaengerIBAN == null) {
			throw new Exception("Die IBAN des Empfängers darf nicht leer sein.");
		} else {
			return empfaengerIBAN;
		}
	}

	public String getEmpfaengerBIC() throws Exception {
		if (empfaengerBIC == null) {
			throw new Exception("Die BIC des Empfängers darf nicht leer sein.");
		} else {
			return empfaengerBIC;
		}
	}

	public double getBetrag() {
		if (betrag > 500) {
			throw new RuntimeException(
					"500 Euro ist viel Geld!! Aus Datenschutzgründen geben wir keine Beträge größer als 500 Euro bekannt.");
		} else {
			return betrag;
		}
	}

	public String getWaehrung() throws Exception {
		if (waehrung == null) {
			throw new Exception("Die Währung einer Transaktion darf nicht leer sein.");
		} else {
			return waehrung;
		}
	}

	public String getVerwendungszweck() throws Exception {
		if (verwendungszweck == null) {
			throw new Exception("Es fehlt der Verwendungszweck, dies ist nicht erlaubt!");
		} else {
			return verwendungszweck;
		}
	}

	public int getCounter() {
		return counter;
	}

	
	
	
}
