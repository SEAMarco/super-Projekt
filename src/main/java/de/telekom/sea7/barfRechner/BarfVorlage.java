package de.telekom.sea7.barfRechner;

public class BarfVorlage {

		// Zentrale Klasse mit folgenden Default Werten: 
        // Prozentzahl 3% vom Körpergewicht
        // Anteil Fleisch in der Nahrung 80% 
		// Anteil Pflanzliche Nahrung 20%

        private double koerpergewicht = 0;  //in kg
        private double prozentzahl = 3;     //in %
        private double fleisch = 80;        //in %
        private double pflanzen = 20;       //in %


        /* -------------------------------------
        // öffentliche mathematische Funktionen
        ---------------------------------------*/
        
        public double gesamt(double koerpergewicht) {
        	double gesamt = koerpergewicht * 3 / 100;
            return gesamt;
        }
        
        public double anteilFleisch(double koerpergewicht) {
        	double gesamt = koerpergewicht * 3 / 100;
        	double anteilFleisch = gesamt * 80 / 100;
        	return anteilFleisch;
        }
        
        public double anteilPflanzen(double koerpergewicht) {
        	double gesamt = koerpergewicht * 3 / 100;
        	double anteilPflanzen = gesamt * 20 / 100;
            return anteilPflanzen;
        }
        
        

        /* -------------------------------------------------------------
        // öffentliche Get Funktionen zur Auskunft über Werte der Klasse
        ----------------------------------------------------------------*/

        public double getProzentzahl() {
            return prozentzahl;
        }
        public double getFleisch() {
            return fleisch;
        }
        public double getPflanzen() {
            return pflanzen;
        }

}