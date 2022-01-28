package de.telekom.sea7.nextLevelBanking;

public class VorlageUeberweisung {
	// INHALT
	// - Parameter einer einzelnen Überweisung
	// - Get-Methoden zum Auslesen einzlener Parameter
	// - Set-Methoden zum Setzen einzelner Parameter
	// - Constructor zum Erzeugen eines Objekts mit den einzelnen Parametern

	// Properties
	private String empfaenger;
	private String empfaengerIban;
	private String empfaengerBic;
	private double betrag;
	private String waehrung;
	private String verwendungszweck;

	// Eigener Constructor
	public VorlageUeberweisung(String empfaenger, String empfaengerIban, String empfaengerBic, double betrag,
			String waehrung, String verwendungszweck) {
		this.empfaenger = empfaenger;
		this.empfaengerIban = empfaengerIban;
		this.empfaengerBic = empfaengerBic;
		this.betrag = betrag;
		this.waehrung = waehrung;
		this.verwendungszweck = verwendungszweck;
	}

	// Aufgehübschte toString Methode für bessere hübschere Ausgaben
	public String toString() {
		return "Empfänger: " + this.empfaenger + " | Empfänger IBAN: " + this.empfaengerIban + " | Empfänger BIC: "
				+ this.empfaengerBic + " | Betrag: " + this.betrag + " " + this.waehrung + " | Verwendungszweck: "
				+ this.verwendungszweck;
	}

	// Get-/Set-Methoden
	public String getEmpfaenger() {
		return empfaenger;
	}

	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}

	public String getEmpfaengerIban() {
		return empfaengerIban;
	}

	public void setEmpfaengerIban(String empfaengerIban) {
		this.empfaengerIban = empfaengerIban;
	}

	public String getEmpfaengerBic() {
		return empfaengerBic;
	}

	public void setEmpfaengerBic(String empfaengerBic) {
		this.empfaengerBic = empfaengerBic;
	}

	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	public String getWaehrung() {
		return waehrung;
	}

	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}

	public String getVerwendungszweck() {
		return verwendungszweck;
	}

	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}

}
