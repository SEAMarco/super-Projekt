package de.telekom.sea7.fubbes;

import java.util.ArrayList;

public class Spiel {

	private	ArrayList<Object> teams = new ArrayList<>();
	private int heimtore;
	private int auswaertstore;

	
	public void addMannschaft(Object Teams) {
		teams.add(Teams);
	}
	
	public String toString() {
		return this.teams + " " + this.heimtore + ":" + this.auswaertstore;
	}
	
	public void anpfiff(int staerkeSpieler1, int staerkeSpieler2, int staerkeSpieler3, int staerkeSpieler4) {
		
		
		int team1Staerke = staerkeSpieler1 + staerkeSpieler2;
		int team2Staerke = staerkeSpieler3 + staerkeSpieler4;
		
		if (team1Staerke > team2Staerke) {
			heimtore++;
		} else {
			auswaertstore++;
		}
		
		
	}
	
}
