package be.kdg.craps.model.craps;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/10/17 14:06
 */
public class BeveiligdCrapsSpel implements CrapsSpel {

    private final String naam;
    private final String wachtwoord;
    private CrapsSpel spel;

    public BeveiligdCrapsSpel(CrapsSpel spel, String naam, String wachtwoord) {
        this.naam = naam;
        this.wachtwoord = wachtwoord;
        this.spel = spel;
        if (Gebruikers.getInstance().login(naam, wachtwoord)) this.spel = new CrapsSpelImpl();
        else throw new IllegalAccessError("Login failed");
    }

    @Override
    public void reset() {
        if (Gebruikers.getInstance().login(this.naam, this.wachtwoord))
            this.spel.reset();
        else throw new IllegalAccessError("Login failed");
    }

    @Override
    public CrapsToestand getToestand() {
        if (Gebruikers.getInstance().login(this.naam, this.wachtwoord))
            return this.spel.getToestand();
        throw new IllegalAccessError("Login failed");
    }

    @Override
    public int getTeGooienWaarde() {
        if (Gebruikers.getInstance().login(this.naam, this.wachtwoord))
            return this.spel.getTeGooienWaarde();
        throw new IllegalAccessError("Login failed");
    }

    @Override
    public void gooi() {
        if (Gebruikers.getInstance().login(this.naam, this.wachtwoord))
            this.spel.gooi();
        else throw new IllegalAccessError("Login failed");

    }

    @Override
    public int getDobbelsteen(int nummer) {
        if (Gebruikers.getInstance().login(this.naam, this.wachtwoord))
            return this.spel.getDobbelsteen(nummer);
        throw new IllegalAccessError("Login failed");
    }
}
