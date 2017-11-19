package be.kdg.function;

public class Piloot {
    private String team;
    private String naam;
    private int nummer;

    public Piloot(String team, String naam, int nummer) {
        this.team = team;
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getTeam() {
        return team;
    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return String.format("%-10s %2d %s", naam, nummer, team);
    }
}
