package punt_4;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 11:30
 */
public class Punt3D extends Punt {
    private int z;

    public Punt3D() {
        super(0, 0);
        this.z = 0;
    }

    public Punt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + " z="+ this.z;
    }
}
