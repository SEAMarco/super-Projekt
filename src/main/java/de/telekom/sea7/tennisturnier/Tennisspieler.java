package de.telekom.sea7.tennisturnier;

public class Tennisspieler {
	
	private String name;
	private int itn; // Internationale Tennis Number -> Spielstärke 10 - 1 (beste)
	private int spiele;
	private int siege;
	private int niederlagen;
	
	// eigener Constructor
	public Tennisspieler(String name, int itn) {
		this.name = name;
		this.itn = itn;
	}

		
	// Eigene toString Methode
	@Override
	public String toString() {
		return  "Name: "        + getName() +
				", Itn-Wert: "  + getItn()  +
				", Spiele: "    + getSpiele() +
				", Siegquote: " + getSiegquote() +"%";
	}
	
	// -----------------
	// Berechnungs-Methoden
	// -----------------
	public void erhoeheSpielUm1() 		{ spiele++; }
	public void erhoeheSiegeUm1() 		{ siege++; }
	public void erhoeheNiederlagenUm1() { niederlagen++; }
	
	
	// -----------------
	// Get-/Set-Methoden
	// -----------------
	
	// Berechnet die Siegquote zurück, wenn mindestens 1 Spiel gespielt wurde
	public double getSiegquote() {
		double quote = 0;
				if(spiele != 0) {
					quote = siege / spiele * 100;
				}
				return quote;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItn() {
		return itn;
	}

	public void setItn(int itn) {
		this.itn = itn;
	}

	public int getSpiele() {
		return spiele;
	}

	public void setSpiele(int spiele) {
		this.spiele = spiele;
	}

	public int getSiege() {
		return siege;
	}

	public void setSiege(int siege) {
		this.siege = siege;
	}

	public int getNiederlagen() {
		return niederlagen;
	}

	public void setNiederlagen(int niederlagen) {
		this.niederlagen = niederlagen;
	}
		

}
