package de.telekom.sea7.hundelexikon;

public class StartLexikon {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    /*Hund hund = new Hund ("Labrador", 30, "mittel");
    System.out.println("Rasse: " + hund.Rasse + 
            "\nGewicht: " + hund.Gewicht + " kg" + 
            "\nGroeße: " + hund.Groeße);
    */
    Labrador labrador = new Labrador("Labrador",25.5,"mittel", "braun");
    Labrador labrador1 = new Labrador("Labrador",31.1,"mittel", "schwarz");
    BorderCollie border = new BorderCollie ("Border Collie",20,"mittel", "schwarz weiß", "langhaarig");

    System.out.println(labrador.DatenLabrador());

    System.out.println(labrador.AusgabeGesamt(labrador.Gewicht));

    System.out.println("-------------------");

    // Labrador

    System.out.println(labrador1.DatenLabrador());
    System.out.println(labrador1.AusgabeGesamt(labrador1.Gewicht));

    System.out.println("-------------------");

    // Border Collie

    System.out.println(border.DatenBorderCollie());
    System.out.println(border.AusgabeGesamt(border.Gewicht));

    System.out.println("-------------------");


    }


}
