package film;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 22:01
 */
public class Film {
    private String titel;
    private int jaar;
    private Drager drager;
    private Geluid geluid;

    public Film(String titel, int jaar, Drager drager, Geluid geluid) {
        this.titel = titel;
        this.jaar = jaar;
        this.drager = drager;
        this.geluid = geluid;
    }

    @Override
    public String toString() {
        return String.format("%-20s %d %-10s %s",
                this.titel,
                this.jaar,
                this.drager,
                this.geluid);
    }
}
