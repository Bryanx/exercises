package sitebezoek;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/11/2016 23:06
 */
public class TestSiteBezoek {
    public static void main(String[] args) {
        Verdeling verdeling = new Verdeling();
        verdeling.genereerBezoekersTijden();
        verdeling.voegBezoekersTijdenToe();
        System.out.println("Verdeling:");
        System.out.println(verdeling.toonVerdeling());
        System.out.println("Totaal aantal bezoekers: " +
                verdeling.getControleTotaal());
        System.out.printf("Eerste om %-12s\n", verdeling.vroegste());
        System.out.printf("Laatste om %-11s\n ", verdeling.laatste());
    }
}