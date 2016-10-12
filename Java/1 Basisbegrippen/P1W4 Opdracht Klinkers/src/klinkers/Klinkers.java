package klinkers;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 13:49
 */
public class Klinkers {
    private String woord;
    private int a = 0; // Teller voor het aantal keer de klinker a
    private int e = 0;
    private int i = 0;
    private int o = 0;
    private int u = 0;

    public Klinkers(String woord) { // Constructor
        this.woord = woord;
    }

    public int getA() { // Getter voor het aantal keer a
        return a;
    }

    public int getE() {
        return e;
    }

    public int getI() {
        return i;
    }

    public int getO() {
        return o;
    }

    public int getU() {
        return u;
    }

    public void telKlinkers() {
// Vul aan, doorloop de string met een for lus en gebruik een switch om de
// overeenstemmende klinkerteller te verhogen als het character één van de
//klinkers is.
    }

    public void reset() {
        // Vul aan, zet alle klinkertellers terug op nul.
    }
}