package be.kdg.contact.model;

public class Message {
    private final String naam;
    private final String voornaam;
    private final String email;
    private final String bericht;

    public Message(String naam, String voornaam, String email, String bericht) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.email = email;
        this.bericht = bericht;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getEmail() {
        return email;
    }

    public String getBericht() {
        return bericht;
    }

    @Override
    public String toString() {
        return naam + ':' + voornaam + ':' + email + ':' + bericht;
    }
}
