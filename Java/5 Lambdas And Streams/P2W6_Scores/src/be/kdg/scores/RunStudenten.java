package be.kdg.scores;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 17:02
 */
public class RunStudenten {
    public static void main(String[] args) {
        Studenten studenten = new Studenten();
        System.out.println("Overzicht resultaten:");
        System.out.println(studenten.getScores());
    }
}
