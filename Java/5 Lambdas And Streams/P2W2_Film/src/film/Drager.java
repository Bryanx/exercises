package film;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 21:55
 */
public enum Drager {
    BLU_RAY, DVD;

    @Override
    public String toString() {
        if (this == BLU_RAY) {
            return "BluRay";
        }
        return name();
    }
}
