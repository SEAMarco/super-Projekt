package de.telekom.sea7.klassenUebung;

public class kontonummer {
	
	private String nummern;

	public void setNummern(String nummern) {
		
		if(nummern.length()<=10) {

		this.nummern = nummern;
		System.out.println("Klasse, korrekte Kontonummer eingegeben!");
		
		} else {
			System.out.println("Deine Eingabe ist zu kurz!");
		}
		
	}
}
