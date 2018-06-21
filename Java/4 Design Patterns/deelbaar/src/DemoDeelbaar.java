import be.kdg.deelbaar.*;

/*
    TODO: Pas de klassen bGeheelGetal, Woord, Vat en Reeks aan volgens de instructies.
    Kijk of je afdruk overeenstemt met onderstaande.
 */
public class DemoDeelbaar {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        Deelbaar[] db_tab = {
                new GeheelGetal(100),
                new Woord("Javapolis"),
                new Reeks(tab),
                new Vat(500, 500)
        };

        for (Deelbaar db : db_tab) {
            System.out.println("\noorspronkelijk: " + db.toString());
            System.out.println("helft: " + db.getHelft()); //Polymorfisme!
        }
    }
}

/*
Verwachte afdruk:

oorspronkelijk: 100
helft: 50

oorspronkelijk: Javapolis
helft: Java

oorspronkelijk: [1, 2, 3, 4, 5, 6, 7]
helft: [1, 2, 3]

oorspronkelijk: capaciteit: 500l inhoud: 500l
helft: capaciteit: 500l inhoud: 250l
 */
