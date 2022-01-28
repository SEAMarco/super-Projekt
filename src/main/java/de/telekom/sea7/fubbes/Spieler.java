package de.telekom.sea7.fubbes;

public class Spieler {
	
	private String spielername;
	private int spielerstaerke;

	public Spieler(String spielername, int spielerstaerke) {
		this.spielername = spielername;
		this.spielerstaerke = spielerstaerke;
	}
	
	public String toString() {
		return this.spielername + " " + this.spielerstaerke;
	}

	public int getSpielerstaerke() {
		return spielerstaerke;
	}
	
	
}
