package Domino;

/**
 * Peer Tutoring
 * P2W5 - Collections
 */
public class DominoSteen implements Comparable<DominoSteen> {
    private int getal1;
    private int getal2;

    public DominoSteen(int getal1, int getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }

    public int getGetal1() {
        return getal1;
    }

    public int getGetal2() {
        return getal2;
    }

    public int getAantalPunten() {
        int punten = 0;
        if (getal1 == getal2) return (getal1 + getal2)*2;
        punten = getal1+getal2;
        return punten;
    }

    public void verwisselGetallen() {
        int var = getal1;
        getal1 = getal2;
        getal2 = var;
    }

    public String toString() {
        return String.format("{%d, %d}", getal1, getal2);
    }

    @Override
    public int compareTo(DominoSteen o) {
        return this.getAantalPunten() - o.getAantalPunten();
    }
}
