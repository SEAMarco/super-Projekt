package de.telekom.sea7.FinalTestProject;

public class FinalTestKlasse {
	
	// Auf diese Variable haben alle Instanzen Zugriff, könne Sie aber nicht verändern
	private final int hundesteuersatzPeggysDorf = 150;
	private final int rabattierterSteuersatz = 75;

	public int FinalTestKlasse(final int hundesteuersatzPeggysDorf, final int rabattierterSteuersatz) {
		
		int faktorDerRabattierung =	hundesteuersatzPeggysDorf / rabattierterSteuersatz;
		 return faktorDerRabattierung;
	}

	
	// Nur Get-Methoden, da keine Set Methoden auf nicht veränderbare Konstanten möglich sind
	
	public int getHundesteuersatzPeggysDorf() {
		return hundesteuersatzPeggysDorf;
	}

	public int getRabattierterSteuersatz() {
		return rabattierterSteuersatz;
	}
	
	

}
