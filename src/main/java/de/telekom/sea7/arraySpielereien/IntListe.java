package de.telekom.sea7.arraySpielereien;

public class IntListe {
	
	// Array Propertie
	private int[] liste = new int[5];
	
	// Methode zum Setzen von Werten an eine bestimmte Position
	public void setliste( int position, int value) {
		liste[position] = value;
	}
	
	// Methode zum Auslesen eines einzelnes Wertes von der Position
	public int getliste( int position ) {
		return liste[position];
	}

}
