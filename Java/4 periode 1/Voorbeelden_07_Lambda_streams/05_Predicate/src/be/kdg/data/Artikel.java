package be.kdg.data;

public class Artikel {
    final private int nummer;
    final private String merk;
    final private String type;
    final private double prijs;

    public Artikel(int nummer, String merk, String type, double prijs) {
        this.nummer = nummer;
        this.merk = merk;
        this.type = type;
        this.prijs = prijs;
    }

    public int getNummer() {
        return nummer;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return String.format("%3d - %-7s - %-23s - €%6.2f", nummer, merk, type, prijs);
    }
}
