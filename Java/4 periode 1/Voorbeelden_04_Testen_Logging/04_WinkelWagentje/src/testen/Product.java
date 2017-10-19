package testen;

public class Product {
    private String naam;
    private double prijs;

    public Product(String naam, double prijs) {
        if(naam == null || naam.isEmpty()) {
            throw new IllegalArgumentException("Foutieve waarde voor naam");
        }
        if(prijs <= 0.0) {
            throw new IllegalArgumentException("Ongeldige waarde voor prijs");
        }
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return String.format("%-20s €%7.2f", naam, prijs);
    }
}

