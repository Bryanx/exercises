package klant;

/**
 * HIER NIETS WIJZIGEN!
 */
public class Adres {
    private String straatNr;
    private int postcode;
    private String gemeente;

    public Adres(String straatNr, int postcode, String gemeente) {
        this.straatNr = straatNr;
        setPostcode(postcode);
        setGemeente(gemeente);
    }

    public String getStraatNr() {
        return straatNr;
    }

    public void setStraatNr(String straatNr) {
        this.straatNr = straatNr;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = (postcode > 0 && postcode < 10000) ? postcode : 0;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente.toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("%s, %d %s", straatNr, postcode, gemeente);
    }
}
