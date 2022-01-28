package de.telekom.sea7.fussball;

public class Spieler {
	
	private String name;
	private int spielstaerke;

	public Spieler(String name, int spielstaerke) {
		this.name = name;
		this.spielstaerke = spielstaerke;
	}
	
	public String toString() {
		return this.name + " " + this.spielstaerke;
	}
	
}
