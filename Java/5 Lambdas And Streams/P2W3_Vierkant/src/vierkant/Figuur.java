package vierkant;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:02
 */
public abstract class Figuur implements Berekenbaar, Herschaalbaar {
    private String soort;
    protected Figuur(String soort) {
        this.soort = soort;
    }
    @Override
    public String toString() {
        return "Soort: \"" + soort + "\"";
    }
}
