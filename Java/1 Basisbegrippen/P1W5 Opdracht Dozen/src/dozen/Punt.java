package dozen;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 15:14
 */
public class Punt {
    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
