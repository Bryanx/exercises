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
        this.tijden = new Tijd[1000];
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
        for (int i = 0; i < tijden.length; i++) {
            int uur = tijden[i].getUren();
            if (uur == uren[i]) {
            }
        }
    }
}
