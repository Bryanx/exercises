package singleton;

/**
 * Voorbeeld van singleton met lazy initialization
 */
public final class President {
    private String naam;
    private String partij;

    private static President enigePresident;

    // private constructor!
    private President(String naam, String partij) {
        this.naam = naam;
        this.partij = partij;
    }

    public static synchronized President getInstance() {
        if (enigePresident == null) {
            enigePresident = new President("onbekend", "onbekend");    
        }
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