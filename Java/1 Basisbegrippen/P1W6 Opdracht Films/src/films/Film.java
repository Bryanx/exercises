package films;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/11/2016 20:58
 */
public class Film {
    private String titel;
    private int jaar;

    public Film(String titel, int jaar) {
        this.titel = titel;
        this.jaar = jaar;
    }

    public String getTitel() {
        return this.titel;
    }

    public int getJaar() {
        return this.jaar;
    }


}
