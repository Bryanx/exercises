package punt;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 11:32
 */
public class TestPunt {
    public static void main(String[] args) {
        Punt punt = new Punt(1, 2);
        Punt3D punt3d = new Punt3D(4, 5, 6);
        System.out.println("Coordinaten punt: " + punt.getX() + ',' +
                punt.getY());
        System.out.println("Coordinaten punt3d: " + punt3d.getX() + ',' +
                punt3d.getY() + ',' + punt3d.getZ());
    }
}
