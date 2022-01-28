package de.telekom.sea7.depotUebung;

public class DepotUebungMain {

	public static void main(String[] args) {
	
		// Beispiel Objekte
		Hunde hund1 = new Hunde();
		hund1.setRasse("Affenpinscher");
		Hunde hund2 = new Hunde();
		hund2.setRasse("Bernhardiner");
		Hunde hund3 = new Hunde();
		hund3.setRasse("Chichuachua");
		Hunde hund4 = new Hunde();
		hund4.setRasse("Dogge");
		Hunde hund5 = new Hunde();
		hund5.setRasse("Englischer Setter");
		Hunde hund6 = new Hunde();
		hund6.setRasse("Foxterrier");
		Hunde hund7 = new Hunde();
		hund7.setRasse("GoldenRetriever");
		Hunde hund8 = new Hunde();
		hund8.setRasse("Husky");
		Hunde hund9 = new Hunde();
		hund9.setRasse("Irish Setter");
		Hunde hund10 = new Hunde();
		hund10.setRasse("Japanischer Gin");
		
		Depot depot = new Depot();
		
		
		// Sollte funktionieren
		depot.add(hund1);
		depot.add(hund2);
		depot.add(hund3);
		depot.add(hund4);
		depot.add(hund5);
		depot.add(hund6);
		depot.add(hund7);
	    depot.add(hund8);
		depot.add(hund9);
		// Sollte mit Hinweis abgelehnt werden
		depot.add(hund10);
		
		depot.getUnserObjectArray(3);
		
		
		
		depot.isFull();
		depot.size();
		
		// depot.clearArray();
		depot.size();
		
		depot.isEmpty();
		
		System.out.println(depot.getUnserObjectArray(3).toString());

	}

}
