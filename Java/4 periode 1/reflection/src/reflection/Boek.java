package reflection;

import java.util.Objects;

public class Boek {
    private String titel;
    private String auteur;
    private double prijs;

    public Boek() {
        titel = "Onbekend";
        auteur = "Anoniem";
        prijs = 0.0;
    }

    public Boek(String titel, String auteur, double prijs) {
        this.titel = titel;
        this.auteur = auteur;
        this.prijs = prijs;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrijs() {
        return prijs;
    }

    @Changeable
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boek boek = (Boek) o;
        return Objects.equals(titel, boek.titel) &&
                Objects.equals(auteur, boek.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, auteur);
    }

    @Override
    public String toString() {
        return String.format("Titel: \"%s\" (%s) €%.2f", titel, auteur, prijs);
    }
}
