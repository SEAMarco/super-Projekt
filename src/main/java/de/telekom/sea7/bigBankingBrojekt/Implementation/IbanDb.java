package de.telekom.sea7.bigBankingBrojekt.Implementation;

public class IbanDb {
	  private int id_iban;
	    private String iban;

	    public int getId_iban() {
	        return id_iban;
	    }

	    public void setId_iban(int id_iban) {
	        this.id_iban = id_iban;
	    }

	    public String getIban() {
	        return iban;
	    }

	    public void setIban(String iban) {
	        this.iban = iban;
	    }

	    public String toString() {
	        return iban;
	    }
	}

