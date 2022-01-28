package de.telekom.sea7.hundelexikon;

public class Labrador extends Hund {

    String Farbe;

    public Labrador(String Rasse, double Gewicht, String Groeße, String Farbe) {
        super(Rasse, Gewicht, Groeße);
        this.Farbe = Farbe;
    }

    public String DatenLabrador() {
        Labrador labrador = new Labrador(Rasse, Gewicht, Groeße, Farbe);
        String Datensatz = "Rasse: " + labrador.Rasse +
                           "\nGewicht: " + labrador.Gewicht + 
                           "\nGroeße: " + labrador.Groeße +
                           "\nFarbe: " + labrador.Farbe;

        return Datensatz;

    }
}
