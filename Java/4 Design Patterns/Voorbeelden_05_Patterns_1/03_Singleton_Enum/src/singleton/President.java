package singleton;

/*
  Singleton via enum
 */
public enum President {
    INSTANCE;

    private String naam;
    private String partij;

    // constructor van een enum is al private,
    // dus hoeft niet meer gemaakt te worden.


    // getters
    public String getNaam() {
        return naam;
    }

    public String getPartij() {
        return partij;
    }

    // setter
    public void setPresident(String naam, String partij) {
        this.naam = naam;
        this.partij = partij;
    }

    @Override
    public String toString() {
        return "singleton.President: " + naam + ", partij: " + partij;
    }
}
