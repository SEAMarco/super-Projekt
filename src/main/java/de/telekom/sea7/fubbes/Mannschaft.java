package de.telekom.sea7.fubbes;
import java.util.ArrayList;

public class Mannschaft {
	
	private String teamname;
	private	ArrayList<Object> spieler = new ArrayList<>();

	public Mannschaft(String teamname) {
		this.teamname = teamname;
	}
	
	public void addSpieler(Object Spieler) {
		spieler.add(Spieler);
	}
	
	public String toString() {
		return this.teamname + " " + this.spieler;
	}

}
