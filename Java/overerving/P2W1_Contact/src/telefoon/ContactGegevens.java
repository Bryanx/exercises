package telefoon;

/**
 * @author Bryan de Ridder
 * @version 1.0 17/11/2016 21:44
 */
public class ContactGegevens {
    private String eMail;
    private Telefoon telefoon;
    private Telefoon gsm;

    public ContactGegevens(String eMail, String telefoon, String gsm) {
        this.eMail = eMail;
        this.telefoon = new Telefoon("vast", telefoon);
        this.gsm = new Telefoon("mobiel", gsm);
    }

    public String geteMail() {
        return eMail;
    }

    public String getTelefoon() {
        return telefoon.getNummer();
    }

    public String getGsm() {
        return gsm.getNummer();
    }

    @Override
    public String toString() {
        return "E-Mail: " + this.eMail + "\n" +
                "Tel: " + this.telefoon.getNummer() + "\n" +
                "GSM: " + this.gsm.getNummer() + "\n";
    }
}
