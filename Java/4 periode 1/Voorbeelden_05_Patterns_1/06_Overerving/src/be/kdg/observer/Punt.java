package be.kdg.observer;

public class Punt {
    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void verdubbelX() {
        x *= 2;
    }

    public void verdubbelY() {
        y *= 2;
    }

    @Override
    public String toString() {
        return "(x,y) = (" + x + "," + y + ")";
    }
}
