package punt_4;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 11:32
 */
public class TestPunt {
    public static void main(String[] args) {
        Punt[] punten = {
                new Punt(),
                new Punt3D(),
                new Punt(2, 3),
                new Punt3D(4, 5, 6)
        };
        for (Punt punt : punten) {
            System.out.println(punt);
        }

        boolean isPuntGelijk = punten[2].equals(new Punt(2, 3));
        boolean isPunt3DGelijk = punten[3].equals(new Punt3D(4, 5, 6));
        boolean isPunt3DNietGelijk = punten[3].equals(new Punt3D(3, 5, 6));
        System.out.println("\nPunt gelijk: " + isPuntGelijk);
        System.out.println("Punt3D gelijk: " + isPunt3DGelijk);
        System.out.println("Punt3D niet gelijk: " + isPunt3DNietGelijk);
    }
}
