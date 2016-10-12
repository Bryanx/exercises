package wijnvat;

import vat.Vat;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 11:41
 */
public class Wijnvat {
    public static void main(String[] args) {
        int aantal = 0;
        Vat wijnVat = new Vat(100);

        wijnVat.vul(110);

        System.out.println("Capaciteit: " + wijnVat.getCapaciteit() + " Inhoud: " + wijnVat.getInhoud());
        System.out.println(wijnVat.getInhoud() == wijnVat.getCapaciteit() ? "Het vat is vol" : "Het vat is niet vol");

        wijnVat.maakLeeg();

        do {
            wijnVat.vul(3);
            aantal++;
        } while (!wijnVat.isVol());

        System.out.println("Uit het wijnvat kon nog " + aantal + " keer 3 liter worden gehaald.");

    }
}
