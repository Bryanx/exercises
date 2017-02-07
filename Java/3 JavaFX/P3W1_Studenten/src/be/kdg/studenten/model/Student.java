package be.kdg.studenten.model;

public class Student {
    private String naam;
    private String voornaam;
    private int nummer;
    private String klas;

    public Student(String naam, String voornaam, int nummer, String klas) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.nummer = nummer;
        this.klas = klas;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getNummer() {
        return nummer;
    }

    public String getKlas() {
        return klas;
    }
}
