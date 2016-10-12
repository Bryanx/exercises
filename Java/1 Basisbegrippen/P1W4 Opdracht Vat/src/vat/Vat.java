package vat;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 11:13
 */
public class Vat {
    private int inhoud;
    private int capaciteit;
    /**
     * Constructor waarbij de capaciteit als parameter binnen komt.
     */
    public Vat(int deCapaciteit) {
        if (deCapaciteit < 0) {
            System.out.println("De capaciteit moet positief zijn!");
            capaciteit = 0;
        } else {
            capaciteit = deCapaciteit;
        }
    }
    /**
     * Geeft de actuele inhoud terug
     */
    public int getInhoud() {
        return inhoud;
    }
    /**
     * Geeft de capciteit terug
     */
    public int getCapaciteit() {
        return capaciteit;
    }
    /**
     * Zorgt ervoor dat het vat met een bepaalde hoeveelheid bijgevuld wordt
     */
    public void vul(int hoeveelheid) {
        if (hoeveelheid < 0) {
            System.out.println("De bij te vullen hoeveelheid mag niet negatief zijn!");
        } else {
            if ((inhoud + hoeveelheid) > capaciteit) {
                inhoud = capaciteit;
            } else {
                inhoud += hoeveelheid;
            }
        }
    }
    /**
     * Vult het vat volledig
     * */
    public void vulVolledig() {
        inhoud = capaciteit;
    }
    /**
     * Geeft aan of het vat vol is of niet
     */
    public boolean isVol() {
        return inhoud == capaciteit;
    }
    /**
     * Vewijdert een bepaalde hoeveelheid uit het vat
     */
    public void verwijder(int hoeveelheid) {
        if (hoeveelheid < 0) {
            System.out.println("De bij te vullen hoeveelheid mag niet negatief zijn!");
        } else {
            if (hoeveelheid > inhoud) {
                inhoud = 0;
            } else {
                inhoud -= hoeveelheid;
            }
        }
    }
    /**
     * Maakt het vat helemaal leeg
     */
    public void maakLeeg() {
        inhoud = 0;
    }
    /**
     * Geeft de mate dat het vat gevuld is in procent
     */
    public double getPercentageGevuld() {
        double percent = 0.0;
        if (capaciteit == 0) {
            System.out.println("Onbepaald, de capaciteit is 0!");
        } else {
            percent = inhoud * 100.0 / capaciteit;
        }
        return percent;
    }
}