package de.telekom.sea7.vererbung;

public class Program extends BaseObject {

	public Program() {
		super( null, 1); // da zu diesem Zeitpunkt noch kein Parent existiert muss ich null übergeben
	}
	
	public void run(String[] args) {
		
		// This kann nur genutzt werden, 
		// weil wir eine Objektinstanz mit der Run-Methode erzeugt haben
		Auto auto = new Auto(this,5);
		System.out.println(auto);
	}
}
