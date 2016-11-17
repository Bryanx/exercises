package auto;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 08:01
 */
public class Motor {
    private final int MAX_TOERENTAL = 5800;
    private int toerental = 0;

    public void verhoogToerental(int toename) {
        if (toerental + toename > MAX_TOERENTAL) {
            this.toerental = MAX_TOERENTAL;
        } else {
            this.toerental += toename;
        }
    }

    public int getToerental() {
        return this.toerental;
    }

    public void setToerental(int toerental) {
        if (toerental < MAX_TOERENTAL) {
            this.toerental = toerental;
        } else {
            this.toerental = MAX_TOERENTAL;
        }
    }
}
