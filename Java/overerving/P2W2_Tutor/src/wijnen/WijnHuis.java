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
        } else if (!zoekWijn(wijn)) {
            this.wijnen[aantal] = wijn;
            aantal++;
        }


    }

    public boolean zoekWijn(Wijn wijn) {
        for (Wijn fles : wijnen) {
            if (fles != null) {
                if (fles.getNaam().equals(wijn.getNaam())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Wijn getOudsteWijn() {
        Wijn oudsteWijn = wijnen[0];
        if (aantal == 0) {
            return null;
        } else {
            for (int i = 1; i < aantal; i++) {
                if (wijnen[i].getOogstDatum().isBefore(oudsteWijn.getOogstDatum())) {
                    oudsteWijn = wijnen[i];
                }
            }
            return oudsteWijn;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder("\nWijnen:\n");

        StringBuilder champagneTekst = new StringBuilder("\nChampagnes:\n");

        StringBuilder likeurenTekst = new StringBuilder("\nLikeuren:\n");

        for (int i = 0; i < aantal; i++) {
            if (wijnen[i] instanceof Champagne) {
                wijnenTekst.append("\t" + wijnen[i] + "\n");
            } else if (wijnen[i] instanceof Likeur) {
                champagneTekst.append("\t" + wijnen[i] + "\n");
            } else {
                likeurenTekst.append("\t" + wijnen[i] + "\n");
            }
        }
        result.append(wijnenTekst + "" + champagneTekst + "" + likeurenTekst);
        return result.toString();
    }
}
