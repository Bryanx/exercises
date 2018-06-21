package telefoon;

/**
 * @author Bryan de Ridder
 * @version 1.0 17/11/2016 21:48
 */
public class Contact {
    private String naam;
    private ContactGegevens gegevens;

    public Contact(String naam, String eMail, String telefoon, String gsm) {
        this.naam = naam;
        this.gegevens = new ContactGegevens(eMail, telefoon, gsm);
    }

    @Override
    public String toString() {
        return "Naam: " + this.naam + "\n" + gegevens.toString();
    }

    public void toonInfo() {
        System.out.println("Naam: " + this.naam);
        System.out.println("Email: " + gegevens.geteMail());
        System.out.println("Tel: " + gegevens.getTelefoon());
        System.out.println("GSM: " + gegevens.getGsm());
    }
}
