package getalleninvoer;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 22:35
 */
public class GetallenInvoer {
    private int[] getallen;

    public GetallenInvoer(int lengte) {
        this.getallen = new int[lengte];
    }

    public void voegGetalToe(int plaats, int getal) {
        this.getallen[plaats] = getal;
    }

    public int som() {
        int som = 0;
        for (int i = 0; i < this.getallen.length; i++) {
            som += getallen[i];
        }
        return som;
    }

    public int kleinste() {
        int kleinste = Integer.MAX_VALUE;
        for (int i = 0; i < this.getallen.length; i++) {
            if (getallen[i] < kleinste) {
                kleinste = getallen[i];
            }
        }
        return kleinste;
    }

    public int grootste() {
        int grootste = Integer.MIN_VALUE;
        for (int i = 0; i < this.getallen.length; i++) {
            if (getallen[i] > grootste) {
                grootste = getallen[i];
            }
        }
        return grootste;
    }

    public String toonGetallen() {
        System.out.print("De ingevoerde getallen zijn: ");
        for (int i = 0; i < this.getallen.length; i++) {
            System.out.print(getallen[i] + " ");
        }
        return "\nDe som van de getallen is " + this.som() + "\n" +
                "Het kleinste getal is " + this.kleinste() + "\n" +
                "Het grootste getal is " + this.grootste();
    }
}
