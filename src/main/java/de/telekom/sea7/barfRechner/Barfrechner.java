package de.telekom.sea7.barfRechner;
import java.util.Scanner; // Import der Scanner-Funktions-Bibliothek

public class Barfrechner {

    public static void main(String[] args) {

    	// Kopie/neueInstanz der BarfVorlage Klasse erstellen und in der Variablen kopieBarfVorlage ablegen.
        BarfVorlage kopieBarfVorlage = new BarfVorlage(); 
        
        // Initialisierung des Scanners und Zuweisung der Funktionen in die Variable meinScanner
        Scanner meinScanner = new Scanner(System.in); 
            
        // Menü
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("|xxxxxxxxxxx Barf-Rechner xxxxxxxxxxx|");
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("|                                    |");
        System.out.println("| (1) Gesamtmenge berechnen          |");
        System.out.println("| (2) Anteil Fleisch berechnen       |");
        System.out.println("| (3) Anteil Pflanzlich berechnen    |");
        System.out.println("| (4) Alles berechnen                |");
        System.out.println("| (5) Berechnungsgrundlage anzeigen  |");
        System.out.println("|                                    |");
        System.out.println("| exit: Abbruch Programm             |");
        System.out.println("|                                    |");
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("");
        System.out.println("Bitte entprechend deines Wunsches eine Zahl eingeben:");
        System.out.println("");
        
        // Einlesen von Systemeingaben vom Typ Int und zuweisung in die Variable input
        int inputMenue = meinScanner.nextInt();
        // Eingaben des Users die unter input gespeichert wurden einer variablen eingegebeneAuswahl zuweisen
        int eingegebeneAuswahl = inputMenue;
        
        // switch entsprechend der Auswahl und Aufruf der entsprechenden Funktion
        switch(eingegebeneAuswahl) {
        case 1: 
        	System.out.println("----------------------------------------");
        	System.out.println("-  Berechnung Gesamtmenge durchführen  -");
        	System.out.println("----------------------------------------");
            System.out.println("Bitte gib das Gewicht deines Hundes ein:");

            double input = meinScanner.nextDouble();
            double eingegebenesKoerpergewicht = input;
            System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.gesamt(eingegebenesKoerpergewicht) + " kg Nahrung");	
        break;
        case 2: 
        	System.out.println("----------------------------------------");
        	System.out.println("------  Anteil Fleisch berechnen  ------");
        	System.out.println("----------------------------------------");
            System.out.println("Bitte gib das Gewicht deines Hundes ein:");
        	
        	double input2 = meinScanner.nextDouble();
            double eingegebenesKoerpergewicht2 = input2;
            System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.anteilFleisch(eingegebenesKoerpergewicht2) + " kg Fleisch");
        break;
        case 3:
        	System.out.println("----------------------------------------");
        	System.out.println("----  Anteil Pflanzlich berechnen  -----");
        	System.out.println("----------------------------------------");
            System.out.println("Bitte gib das Gewicht deines Hundes ein:");
        	
        	double input3 = meinScanner.nextDouble();
            double eingegebenesKoerpergewicht3 = input3;
            System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.anteilPflanzen(eingegebenesKoerpergewicht3) + " kg pflanzliche Nahrung");
        break;
        case 4: 
        	System.out.println("----------------------------------------");
        	System.out.println("-----------  Alles berechnen  ----------");
        	System.out.println("----------------------------------------");
            System.out.println("Bitte gib das Gewicht deines Hundes ein:");
        	
        	double input4 = meinScanner.nextDouble();
            double eingegebenesKoerpergewicht4 = input4;
            System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.gesamt(eingegebenesKoerpergewicht4) + " kg Nahrung");	
            System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.anteilFleisch(eingegebenesKoerpergewicht4) + " kg Fleisch");
            System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.anteilPflanzen(eingegebenesKoerpergewicht4) + " kg pflanzliche Nahrung");
            
            
            
        break;
        case 5:
        	System.out.println("----------------------------------------");
        	System.out.println("-------  Berechnungsgrundlage  ---------");
        	System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println(kopieBarfVorlage.getProzentzahl() + "% des Körpergewichts wird für die Nahrungsberechnung verwendet.");
            System.out.println(kopieBarfVorlage.getFleisch() + "% des Körpergewichts wird für die Berechnung des Fleischanteils verwendet.");
            System.out.println(kopieBarfVorlage.getPflanzen() + "% des Körpergewichts wird für die Berechnung des pflanzlichen Anteils verwendet.");
        break;
        default: System.out.println("Du hast eine Falsche Eingabe gemacht!");
     }
                 
   }

}