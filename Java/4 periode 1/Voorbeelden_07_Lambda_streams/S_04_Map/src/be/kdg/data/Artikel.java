package be.kdg.data;

public class Artikel implements Comparable<Artikel> {
    final private int nummer;
    final private String merk;
    final private String type;
    private double prijs;

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

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return String.format("%3d - %-7s - %-23s - €%7.2f", nummer, merk, type, prijs);
    }

    @Override
    public int compareTo(Artikel anderArtikel) {
        return Integer.compare(nummer, anderArtikel.nummer);
    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 349,00
  6 - HP      - Pavilion 15-p268nb      - € 599,00
  7 - Asus    - EeeBook X205TA          - € 189,00
  1 - Lenovo  - IdeaPad G50-80          - € 499,00
  3 - Lenovo  - IdeaPad Z70-80          - € 449,00
 10 - Asus    - K555LJ-DM706T           - € 799,00
  9 - Lenovo  - IdeaPad S21e-20         - € 149,00
  5 - MSI     - GP72Qe-016BE            - €1149,00
  4 - Toshiba - Satelite Pro R50-B-109  - € 349,00
  8 - Toshiba - Satelite L50D-B-1CE     - € 599,00
*/