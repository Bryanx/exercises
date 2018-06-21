package singleton;

/*
  Singleton op de klassieke wijze (voorkeur)
 */

public final class President {

    private String naam;
    private String partij;

    private static President enigePresident = new President();

    // private constructor
    private President() {
        this.naam = "onbekend";
        this.partij = "onbekend";
    }

    public static synchronized President getInstance() {
        return enigePresident;
    }

    public String getNaam() {
        return naam;
    }

    public String getPartij() {
        return partij;
    }

    public void setPresident(String naam, String partij) {
        this.naam = naam;
        this.partij = partij;
    }

    @Override
    public String toString() {
        return "President: " + naam + ", partij: " + partij;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
