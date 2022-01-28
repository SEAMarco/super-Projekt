package de.telekom.sea7.hundelexikon;

public class Hund {

    String Rasse;
    double Gewicht;
    String Groeße;

    public Hund (String Rasse, double Gewicht, String Groeße) {
        this.Rasse = Rasse;
        this.Gewicht = Gewicht;
        this.Groeße = Groeße;

    }

        public String gesamt(double Gewicht) {
            double gesamt = Gewicht * 3 / 100 * 1000;
            String Ausgabetext = "Gesamt Futter pro Tag: " + gesamt + " g";
            return Ausgabetext;
        }

        public String anteilFleisch(double Gewicht) {
            double gesamt = Gewicht * 3 / 100 * 1000;
            String AusgabeAnteilFleisch = "Gesamt Fleischanteil pro Tag: " + gesamt * 80 / 100 + " g";
            return AusgabeAnteilFleisch;
        }

        public String anteilPflanzen(double Gewicht) {
            double gesamt = Gewicht * 3 / 100;
            String AusgabeAnteilPflanzen = "Gesamt Pflanzenanteil pro Tag: " + gesamt * 20 / 100 + " g";
            return AusgabeAnteilPflanzen;
        }

        public String AusgabeGesamt (double Gewicht) {
            String Ausgabe = "\n " + this.gesamt(Gewicht) + 
                             "\n " + this.anteilFleisch(Gewicht) + 
                             "\n " + this.anteilPflanzen(Gewicht);
            return Ausgabe; 
        }



    }
