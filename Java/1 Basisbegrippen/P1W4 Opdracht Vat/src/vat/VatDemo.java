package vat;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 11:16
 */
public class VatDemo {
    public static void main(String[] args) {

        int tapjes = 0;

        Vat bierVat = new Vat(50);
        System.out.println("Inhoud: " + bierVat.getInhoud());
        System.out.println("Capaciteit: " + bierVat.getCapaciteit());

        bierVat.vulVolledig();
        System.out.println("Tap 8 pintjes.");
        bierVat.verwijder(2);
        System.out.println("Inhoud: " + bierVat.getInhoud());
        System.out.println(bierVat.getPercentageGevuld() + "% vol");

        for (int i = 0; i < 200; i++) {
            if (bierVat.getInhoud() == 0) {
                System.out.println("Het vat is leeg er zijn: " + tapjes + " pintjes uit het vat gehaald.");
                break;
            } else {
                bierVat.verwijder(1);
                tapjes += 4;
            }
        }
    }
}
