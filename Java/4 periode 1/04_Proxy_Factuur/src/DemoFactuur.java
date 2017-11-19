import artikel.Artikel;
import facturatie.*;
import klant.Adres;
import klant.Klant;

public class DemoFactuur {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("14578-12", "Canon PIXMA MG5150", 91.94);
        Artikel a2 = new Artikel("11179-17", "Epson Stylus SX425W", 84.45);
        Artikel a3 = new Artikel("578-33", "Nikon D3100", 464.16);
        Artikel a4 = new Artikel("18552-1", "Samsung Syncmaster BX2450", 252.50);
        Artikel a5 = new Artikel("5680-3", "Acer X110", 119.99);

        Klant klant = new Klant("Geronimo Gadget", new Adres("Nationalestraat 777", 2000, "Antwerpen"), "45587-GDG");

        Factuur factuur = new Factuur(666, "01/12/2010", klant, 0.06);
        factuur.voegLijnToe(a1, 1);
        factuur.voegLijnToe(a2, 2);
        factuur.voegLijnToe(a3, 1);
        factuur.voegLijnToe(a4, 5);
        factuur.voegLijnToe(a5, 2);

        factuur.printFactuur();
        /*   TODO: Verwijder de commentaartekens om je oplossing uit te testen */

        Factureerbaar andereFactuur = new OnwijzigbareFactuur(factuur);
        System.out.println("Pogingen om factuurgegevens te wijzigen:");

        try {
            andereFactuur.setKlant(new Klant("Dummy", new Adres("Kerkstraat 5", 2640, "Mortsel"), "99999"));
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        try {
            andereFactuur.setDatum("test");
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        try {
            andereFactuur.verwijderLijn(a1);
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        try {
            andereFactuur.voegLijnToe(a1, 1);
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        System.out.println();
        andereFactuur.printFactuur();

    }
}

/* Verwachte afdruk:
Factuur 666      datum: 01/12/2010
	Geronimo Gadget
	Nationalestraat 777, 2000 ANTWERPEN
------------------------------------------------------------------------------
artikel 14578-12 Canon PIXMA MG5150                91,94€     1x
artikel 11179-17 Epson Stylus SX425W               84,45€     2x
artikel 578-33   Nikon D3100                      464,16€     1x
artikel 18552-1  Samsung Syncmaster BX2450        252,50€     5x
artikel 5680-3   Acer X110                        119,99€     2x
------------------------------------------------------------------------------
                             Totaal excl. BTW:    2227,48€
                             BTW  (6,00%)    :     133,65€
                             Totaal incl. BTW:    2361,13€
------------------------------------------------------------------------------

Pogingen om factuurgegevens te wijzigen:
java.lang.UnsupportedOperationException: Klantgegevens kunnen niet gewijzigd worden
java.lang.UnsupportedOperationException: Factuurdatum kan niet gewijzigd worden
java.lang.UnsupportedOperationException: Er kunnen geen factuurlijnen verwijderd worden
java.lang.UnsupportedOperationException: Er kunnen geen factuurlijnen worden toegevoegd

Factuur 666      datum: 01/12/2010
	Geronimo Gadget
	Nationalestraat 777, 2000 ANTWERPEN
------------------------------------------------------------------------------
artikel 14578-12 Canon PIXMA MG5150                91,94€     1x
artikel 11179-17 Epson Stylus SX425W               84,45€     2x
artikel 578-33   Nikon D3100                      464,16€     1x
artikel 18552-1  Samsung Syncmaster BX2450        252,50€     5x
artikel 5680-3   Acer X110                        119,99€     2x
------------------------------------------------------------------------------
                             Totaal excl. BTW:    2227,48€
                             BTW  (6,00%)    :     133,65€
                             Totaal incl. BTW:    2361,13€
------------------------------------------------------------------------------

 */
