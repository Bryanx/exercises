package annotations;

public class RuimtePunt extends Punt {
    private int z;

    public RuimtePunt() {
        this(0, 0, 0);
    }

    // Geen overriding!
    public RuimtePunt(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Deprecated
    public void setZ(int z) {
        this.z = z;
    }

    public void setCoordinaten(int x, int y, int z) {
        setCoordinaten(x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        RuimtePunt ruimtePunt = (RuimtePunt) object;
        return z == ruimtePunt.z;

    }

    @Override
    public int hashCode() {
         return 31 * super.hashCode() + z;
    }

    @Override
    public String toString() {
        return super.toString() + " z = " + z;
    }
}

