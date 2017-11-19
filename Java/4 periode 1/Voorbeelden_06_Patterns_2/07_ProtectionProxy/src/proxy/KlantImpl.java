package proxy;

public class KlantImpl implements Klant {
    private String rekeningNummer = "BE01-2345-6789-0123";

    public KlantImpl() {
        System.out.println("KlantImpl: creatie klant");
    }

    public String getRekeningNummer() {
        System.out.println("KlantImpl: rekeningNummer = " + rekeningNummer); 
        return rekeningNummer;
    }
}
