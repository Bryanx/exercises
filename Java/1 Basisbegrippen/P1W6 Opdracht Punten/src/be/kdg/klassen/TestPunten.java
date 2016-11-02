package be.kdg.klassen;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 22:31
 */
public class TestPunten {
    public static void main(String[] args) {
        Punten punten = new Punten();
        for (int i = 0; i < punten.lengte(); i++) {
            Punt punt = punten.getPunt(i);
            System.out.println("Het punt " + punt + " heeft een afstand van " +
                    punt.afstandTotDeOorsprong() + " tot de oorsprong.");
        }
    }
}
