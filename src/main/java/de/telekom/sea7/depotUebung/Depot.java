package de.telekom.sea7.depotUebung;

import java.util.ArrayList;

public class Depot {

	private Object[] unserObjectArray = new Object[9];
	private int speicherposition = 0;

	// Eigene Add-Methode welche am Ende des Array ein weiteres Objekt anhängt
	public boolean add(Object eingabe) {
		if (speicherposition < unserObjectArray.length) {
			this.unserObjectArray[speicherposition] = eingabe;
			System.out.println("Dein Objekt wurde auf Index " + speicherposition + " gespeichert.");
			speicherposition++;
			System.out.println("Das nächste Objekt würde auf Index " + speicherposition + " gespeichert.");
			return true;
		} else {
			System.out.println(
					"Das Hinzufügen eines weiteren Objekts in das Array ist nicht möglich. Erweitere zunächst die Größe des Arrays");
			return false;
		}
	}

	// Gibt das Objekt der angefragten Position zurück
	public Object getUnserObjectArray(int position) {
		if (position < unserObjectArray.length) {
			System.out.println("Viel Spass mit deinem Objekt eines Hundes von der Position " + position);
			System.out.println(unserObjectArray[position]);
			return unserObjectArray[position];
		} else {
			System.out.println("ERROR: Du versuchst Daten außerhablb des Arrays abzufragen.");
			return null;
		}
	}

	// Alle belegten Index Speicherplätze löschen und speicherzähler auf 0 zurück
	public void clearArray() {
		unserObjectArray = new Object[unserObjectArray.length];
		speicherposition = 0;
	}

	// Überprüfung ob alle Index Speicherplätze leer sind
	public boolean isEmpty() {	
		if (speicherposition == 0) {
			System.out.println("ist leer!");
			return true;
		} else {
			System.out.println("hat noch Inhalte!");
			return false;
		}
	}
	
	
	// Überprüfung ob die maximale Anzahl der Speicherstellen erreicht ist
	public boolean isFull() {
		if (speicherposition == unserObjectArray.length) {
			System.out.println("Maximale Speicherauslastung, weitere Einträge nicht möglich!");
			return true;
		} else {
			System.out.println("Array hat noch Platz für weitere Hunde!");
			return false;
		}
	}
	
	// Gibt die Anzahl der Objekte im Array zurück
	public int size() {
		System.out.println("Es sind " + (speicherposition) + " Objekte im Array!");
		return speicherposition;	
	}


}
