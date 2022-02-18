package de.telekom.sea7.bigBankingBrojekt.Implementation;

public class ZahlungDb {
	
	    //IbanResImpl ibanResImpl = new IbanResImpl();

	    private int id_zahlung;
	    private IbanDb iban;
	    private double betrag;
	    private String verwendungszweck;

	    public IbanDb getIban() {
	        return iban;
	    }

	    public int getId_zahlung() {
	        return id_zahlung;
	    }

	    public void setId_zahlung(int id_zahlung) {
	        this.id_zahlung = id_zahlung;
	    }

	    public double getBetrag() {
	        return betrag;
	    }

	    public void setBetrag(double betrag) {
	        this.betrag = betrag;
	    }

	    public String getVerwendungszweck() {
	        return verwendungszweck;
	    }

	    public void setVerwendungszweck(String verwendungszweck) {
	        this.verwendungszweck = verwendungszweck;
	    }

	    public void setIban(IbanDb iban) {
	        this.iban = iban;
	    }

	}

