package annotations;

public class Punt {
    private int x;
    private int y;

    public Punt() {
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Deprecated
    public void setX(int x) {
        this.x = x;
    }

    @Deprecated
    public void setY(int y) {
        this.y = y;
    }

    public void setCoordinaten(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        final Punt punt = (Punt) object;
        return x == punt.x && y == punt.y;
    }

    @Override
    public int hashCode() {
        return 29 * x + y;
    }
}
