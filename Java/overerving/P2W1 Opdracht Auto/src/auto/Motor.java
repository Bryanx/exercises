package auto;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 08:01
 */
public class Motor {
    private final int MAX_TOERENTAL = 5800;
    private int toerental;

    public void verhoogToerental(int toename) {
        if (toerental < MAX_TOERENTAL) {
            this.toerental += toename;
        }else {
            System.out.println("Hij gaat niet harder.");
        }
    }

    public int getToerental() {
        return toerental;
    }

    public void setToerental(int toerental) {
        this.toerental = toerental;
    }
}
