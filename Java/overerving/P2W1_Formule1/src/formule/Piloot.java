package formule;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/11/2016 09:52
 */
public class Piloot {
    private String naam;
    private String team;
    private Tijd tijd;

    public Piloot(String naam, String team) {
        this.naam = naam;
        this.team = team;
    }

    public void setTijd(Tijd tijd) {
        this.tijd = tijd;
    }

    public Tijd getTijd() {
        return tijd;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %-20s",
        this.naam,
        this.team,
        this.tijd);
    }
}
