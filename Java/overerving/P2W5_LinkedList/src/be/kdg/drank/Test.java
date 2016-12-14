package be.kdg.drank;

/**
 * @author Bryan de Ridder
 * @version 1.0 14/12/2016 09:24
 */
public class Test {
    public static void main(String[] args) {
        Kaart kaart = new Kaart();
        kaart.voegDrankToe(new Drank("Cola", 3.50, false));
        kaart.voegDrankToe(new Drank("Sprite", 4.50, false));
        kaart.voegDrankToe(new Drank("Gin", 2.50, true));
        kaart.voegDrankToe(new Drank("Tonic", 2.00, true));
        kaart.voegDrankToe(new Drank("Fanta", 2.00, false));
        kaart.voegDrankToe(new Drank("Rum", 2.50, true));
        kaart.voegDrankToe(new Drank("Ice-Tea", 2.20, false));

        System.out.println(kaart);
        System.out.println("De Duurste be.kdg.drank is: \n" + kaart.duurste() + "\n");
        System.out.println("De alcoholische dranken zijn: \n" + kaart.getAlcoholischeDranken() + "\n");
        kaart.verwijderDuurderDan(3);
        System.out.println("Alle dranken duurder dan €3: \n" + kaart + "\n");

        Drank[] dranken = new Drank[2];
        dranken[0] = new Drank("Red Bull", 0.50, false);
        dranken[1] = new Drank("PaardenUrine", 20.50, true);

        kaart.voegDrankenToe(dranken);
        System.out.println("Dranken inclusief toegevoegde dranken: \n" + kaart + "\n");
        kaart.sorteerOpPrijs();
        System.out.println("Dranken gesorteerd op prijs: \n" + kaart + "\n");
        kaart.sorteerOpNaam();
        System.out.println("Dranken gesorteerd op naam: \n" + kaart);


    }
}
