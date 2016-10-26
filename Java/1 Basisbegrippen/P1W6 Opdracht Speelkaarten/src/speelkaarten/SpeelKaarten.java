package speelkaarten;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 15:57
 */
public class SpeelKaarten {
    public static void main(String[] args) {
        String[] kleuren = {
                "Harten", "Schoppen", "Ruiten", "Klaveren"
        };
        String[] waarden = {
                "Aas", "Twee", "Drie", "Vier", "Vijf",
                "Zes", "Zeven", "Acht", "Negen", "Tien",
                "Boer", "Dame", "Heer"
        };

        SpeelKaart kaart = new SpeelKaart(kleuren, waarden);

        kaart.toon();
    }
}