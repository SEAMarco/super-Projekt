package de.telekom.sea7.klassenUebung;

public class transaction {
	
	// Properties
	private String ibanSender;
	private String ibanEmpfaenger;
	private String bicSender;
	private String bicEmpfaenger;
	private String empfaengerName;
	private String verwendungszweck;
	private String ausfuehrungsdatum;
	private float betrag;
	
	
	
	// Methoden
	public String getIbanSender() {
		return ibanSender;
	}
	
	public void setIbanSender(String ibanSender) {
		// Validierung auf Deutsche IBAN
		if (ibanSender.startsWith("DE")) {
			this.ibanSender = ibanSender;
		} else {
			System.out.println("Bitte eine Deutsche IBAN verwenden!");
		}
	}
	
	public String getIbanEmpfaenger() {
		return ibanEmpfaenger;
	}
	
	public void setIbanEmpfaenger(String ibanEmpfaenger) {
		// Validierung auf Deutsche IBAN
		if (ibanEmpfaenger.startsWith("DE")) {
			this.ibanEmpfaenger = ibanEmpfaenger; 
		} else {
			System.out.println("Bitte eine Deutsche IBAN verwenden!");
		}
	}
	
	public String getBicSender() {
		return bicSender;
	}
	
	public void setBicSender(String bicSender) {
		this.bicSender = bicSender;
	}
	
	public String getBicEmpfaenger() {
		return bicEmpfaenger;
	}
	
	public void setBicEmpfaenger(String bicEmpfaenger) {
		this.bicEmpfaenger = bicEmpfaenger;
	}
	
	public String getEmpfaengerName() {
		return empfaengerName;
	}
	
	public void setEmpfaengerName(String empfaengerName) {
		this.empfaengerName = empfaengerName;
	}
	
	public String getVerwendungszweck() {
		return verwendungszweck;
	}
	
	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}
	
	public String getAusfuehrungsdatum() {
		return ausfuehrungsdatum;
	}
	
	public void setAusfuehrungsdatum(String ausfuehrungsdatum) {
		this.ausfuehrungsdatum = ausfuehrungsdatum;
	}
	
	public float getBetrag() {
		return betrag;
	}
	
	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}
	
}
