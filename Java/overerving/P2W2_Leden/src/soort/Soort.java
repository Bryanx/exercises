package soort;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/11/2016 14:45
 */
public enum Soort {
    GEWOON, STEUNEND, ERELID;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
