package telefoon;

/**
 * @author Bryan de Ridder
 * @version 1.0 17/11/2016 21:33
 */
public class Telefoon {
    private final int LENGTE_MOBIEL = 10;
    private final int LENGTE_VAST = 9;
    private String soort;
    private String nummer;

    public Telefoon(String soort, String nummer) {
        this.soort = soort;
        this.nummer = nummer;
    }

    public String getSoort() {
        return soort;
    }

    public String getNummer() {
        return nummer;
    }

    public boolean isGeldigNummer() {
        int aantalCijfers = this.nummer.length();
        boolean geldig = true;
        if (this.nummer.charAt(0) == ('0')) {
            if (aantalCijfers == LENGTE_MOBIEL && this.soort.equals("mobiel")) {
                geldig = true;
            } else if (aantalCijfers == LENGTE_VAST && this.soort.equals("vast")) {
                geldig = true;
            } else {
                geldig = false;
            }
        } else {
            geldig = false;
        }
        return geldig;
    }
}
