package sitebezoek;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/11/2016 23:04
 */
public class Verdeling {
    private final int AANTAL = 1000;
    private Tijd[] tijden;
    private int[] uren;

    public Verdeling() {
        this.uren = new int[24];
        this.tijden = new Tijd[AANTAL];
    }

    public int[] getUren() {
        return uren;
    }

    public void genereerBezoekersTijden() {
        for (int i = 0; i < tijden.length; i++) {
            tijden[i] = new Tijd();
            tijden[i].maakRandomTijd();
        }
    }

    public void voegBezoekersTijdenToe() {
        int urenindex[] = new int[24];
        for (int j = 0; j < uren.length; j++) {
            urenindex[j] = j;
        }
        for (int i = 0; i < tijden.length; i++) {
            int uur = tijden[i].getUren();
            if (uur == urenindex[uur]) {
                uren[uur] += 1;
            }
        }
    }

    public String toonVerdeling() {
        String verdeling = "";
        for (int i = 0; i < uren.length / 2; i++) {
            verdeling += String.format("uur %2d: %2d \t uur %2d: %2d %n",
                    i,
                    uren[i],
                    i + uren.length / 2,
                    uren[i + uren.length / 2]);
        }
        return verdeling;
    }

    public int getControleTotaal() {
        return this.tijden.length;
    }

    public String vroegste() {
        int laatste = 24000000;
        Tijd vroegst = new Tijd();
        for (int i = 0; i < tijden.length; i++) {
            if (tijden[i].toInteger() < laatste) {
                laatste = tijden[i].toInteger();
                vroegst = tijden[i];
            }
        }
        return vroegst.toString();
    }

    public String laatste() {
        int vroegste = 0;
        Tijd laatst = new Tijd();
        for (int i = 0; i < tijden.length; i++) {
            if (tijden[i].toInteger() > vroegste) {
                vroegste = tijden[i].toInteger();
                laatst = tijden[i];
            }
        }
        return laatst.toString();
    }

}
