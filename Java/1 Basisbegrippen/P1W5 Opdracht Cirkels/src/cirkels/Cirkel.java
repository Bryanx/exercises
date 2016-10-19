package cirkels;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 15:36
 */
public class Cirkel {
    private int straal;
    private String kleur = "Zwart";

    public Cirkel(int straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    public Cirkel(int straal) {
        this(straal, "Zwart");
    }

    public double omtrek() {
        return this.straal * 2 * Math.PI;
    }

    public double oppervlakte() {
        return Math.pow(straal, 2) * Math.PI;
    }

    public double verschilOmtrek(Cirkel andereCirkel) {
        double verschil = omtrek() - andereCirkel.omtrek();
        return Math.abs(verschil);
    }

    public double verschilOppervlakte(Cirkel andereCirkel) {
        double verschil = oppervlakte() - andereCirkel.oppervlakte();
        return Math.abs(verschil);
    }

    @Override
    public String toString() {
        StringBuilder bodybuilder = new StringBuilder();
        bodybuilder.append("Kleur: " + this.kleur + "\n");
        bodybuilder.append("Straal: " + this.straal + "\n");
        bodybuilder.append(String.format("Omtrek: %.2f", omtrek()) + "\n");
        bodybuilder.append(String.format("Oppervlakte: %.2f", oppervlakte()) + "\n");
        return bodybuilder.toString();
    }

}
