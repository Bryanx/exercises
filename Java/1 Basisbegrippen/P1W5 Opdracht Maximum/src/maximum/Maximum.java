package maximum;

/**
 * @author Bryan de Ridder
 * @version 1.0 24/10/16 12:41
 */
public class Maximum {
    private int een;
    private int twee;
    private int drie;

    //CONSTRUCTORS
    public Maximum() {
        System.out.println("Oprooep default constructor");
    }

    public Maximum(int een, int twee, int drie) {
        System.out.println("Oprooep int constructor");
        this.een = een;
        this.twee = twee;
        this.drie = drie;
    }

    public Maximum(long een, long twee, long drie) {
        System.out.println("Oprooep long constructor");
        this.een = (int) een;
        this.twee = (int) twee;
        this.drie = (int) drie;
    }

    public Maximum(double een, double twee, double drie) {
        System.out.println("Oprooep double constructor");
        this.een = (int) een;
        this.twee = (int) twee;
        this.drie = (int) drie;
    }

    //METHODS
    public double max() {
        return Math.max(this.een, Math.max(this.twee, this.drie));
    }

    public double max(int een, int twee, int drie) {
        System.out.println("Oproep int parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(long een, long twee, long drie) {
        System.out.println("Oproep long parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(double een, double twee, double drie) {
        System.out.println("Oproep double parameters methode");
        return Math.max(een, Math.max(twee, drie));
    }

}
