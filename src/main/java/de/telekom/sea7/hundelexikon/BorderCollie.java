package de.telekom.sea7.hundelexikon;

public class BorderCollie extends Hund {

    String Farbe;
    String Fell;

    public BorderCollie(String Rasse, double Gewicht, String Groeße, String Farbe, String Fell) {
        super(Rasse, Gewicht, Groeße);
        this.Farbe = Farbe;
        this.Fell = Fell;
    }

    public String DatenBorderCollie() {
        BorderCollie border = new BorderCollie(Rasse, Gewicht, Groeße, Farbe, Fell);
        String Datensatz = "Rasse: " + border.Rasse +
                           "\nGewicht: " + border.Gewicht + 
                           "\nGroeße: " + border.Groeße +
                           "\nFarbe: " + border.Farbe +
                           "\nFell: " + border.Fell;

        return Datensatz;

    }

}