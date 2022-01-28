package de.telekom.sea7.klassenUebung;


public class Person { 

	// Variablen
	private int gebTag;
	private int gebMonat;
	private int gebJahr;
	private String vorname;
	private String nachname;

	// Constructor
	public Person(int gebTag, int gebMonat, int gebJahr, String vorname, String nachname) {
		
		this.gebTag = gebTag;
		this.gebMonat = gebMonat;
		this.gebJahr = gebJahr;
		this.vorname = vorname;
		this.nachname = nachname;
		
	}
	
	// Individuelle toString Methode welche die Standmethode aus Object.class ersetzt, damit nicht die Referenz, sondern auch ein String ausgegeben wird
	public String toString() {
		return  "Geburtstag: " + this.gebTag +
				"\nGeburtsmonat: " + this.gebMonat +
				"\nGeburtsjahr: " + this.gebJahr +
				"\nVorname: " + this.vorname +
				"\nNachname: " + this.nachname;
	}
	
	// Ersetzt die Standard equals Methode aus der Object.class
    public boolean equals(Person neuePerson) {
        
    	if (this.vorname.equals(neuePerson.vorname)) {
    		System.out.println("Person existiert bereits!");
    		return true;
    	} else {
    		System.out.println("Neue Person");
    		return false;
    	}
    	
    }
    
	
}