package be.kdg.klassen;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 22:20
 */
public class Punt {
    private int x;
    private int y;

    public Punt() {
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double afstandTotDeOorsprong() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
