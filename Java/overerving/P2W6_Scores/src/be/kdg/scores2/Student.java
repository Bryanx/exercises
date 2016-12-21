package be.kdg.scores2;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 17:00
 */
public class Student {
    public String naam;
    public int score;

    public Student(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("%-15s -----> %d", this.naam, this.score);
    }
}
