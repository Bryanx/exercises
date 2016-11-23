package wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private Wijn[] wijnen = new Wijn[MAX_AANTAL];  //voorlopig gevuld met 10 null-objecten
    private String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public void voegWijnToe(Wijn wijn) {
        if (aantal > MAX_AANTAL) {
            System.out.println("Kan niet meer wijn bij");
        } else {
            this.wijnen[aantal] = wijn;
            aantal++;
        }

    }

    public boolean zoekWijn(Wijn wijn) {
        for (Wijn fles: wijnen) {
            if (fles.getNaam().equals(wijn.getNaam())) {
                return true;
            }
        }

        return false;
    }

    public Wijn getOudsteWijn() {
        Wijn wijn = null;
        int oudstedatum = LocalDate.now().getYear();
        if (aantal == 0) {
            return null;
        } else {
            for (int i = 0; i < aantal; i++) {
                if (wijnen[i].getOogstDatum().getYear() < oudstedatum) {
                    oudstedatum = wijnen[i].getOogstDatum().getYear();
                    wijn = wijnen[i];
                }
            }
            return wijn;

        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        result.append("\nWijnen:\n");
        StringBuilder wijnenTekst = new StringBuilder();
        for (int i = 0; i < aantal; i++) {
            if (wijnen[i] instanceof Wijn) {
                wijnenTekst.append(wijnen[i] + "\n");
            }
        }
        result.append(wijnenTekst);

        result.append("\nChampagnes:\n");
        StringBuilder champagneTekst = new StringBuilder();
        for (int i = 0; i < aantal; i++) {
            if (wijnen[i] instanceof Champagne) {
                champagneTekst.append(wijnen[i] + "\n");
            }
        }
        result.append(champagneTekst);

        result.append("\nLikeuren:\n");
        StringBuilder likeurenTekst = new StringBuilder();
        for (int i = 0; i < aantal; i++) {
            if (wijnen[i] instanceof Likeur) {
                likeurenTekst.append(wijnen[i] + "\n");
            }
        }
        result.append(likeurenTekst);

        return result.toString();
    }
}
