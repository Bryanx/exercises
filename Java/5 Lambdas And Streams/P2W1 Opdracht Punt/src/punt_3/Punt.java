package punt_3;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 11:29
 */
public class Punt {
    protected int x;
    protected int y;

    public Punt() {
        this(0, 0);
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Punt{" +
                "x=" + x +
                ", y=" + y;
    }
}
