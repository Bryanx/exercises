import Domino.DominoSteen;
import Domino.Speler;

/**
 * Peer Tutoring
 * P2W5 - Collections
 */
public class TestSpel {
    public static void main(String[] args) throws Exception {
        Speler s1 = new Speler("Jos");

        s1.neemNieuweSteen(new DominoSteen(1, 1));
        s1.neemNieuweSteen(new DominoSteen(2, 1));
        s1.neemNieuweSteen(new DominoSteen(3, 5));
        s1.neemNieuweSteen(new DominoSteen(4, 6));
        s1.neemNieuweSteen(new DominoSteen(1, 4));
        s1.neemNieuweSteen(new DominoSteen(6, 1));

        System.out.printf("Speler %s\n", s1.getNaam());
        System.out.println("Aantal punten: " + s1.getAantalPunten());
        System.out.println("Aantal stenen: " + s1.getAantalStenen());
        DominoSteen steenMetMeestePunten = s1.zoekSteen();
        if (steenMetMeestePunten == null)
            throw new Exception("Steen met hoogst aantal punten is NIET gevonden, maar is er wel...");

        System.out.println("Steen met meeste aantal punten: " + steenMetMeestePunten.toString());
        System.out.printf("Getal 1 - Getal 2: %d - %d\n", steenMetMeestePunten.getGetal1(), steenMetMeestePunten.getGetal2());
        steenMetMeestePunten.verwisselGetallen();
        System.out.println("Verwissel deze steen:" + steenMetMeestePunten.toString());
        System.out.println("Aantal stenen: " + s1.getAantalStenen());

        DominoSteen steenMetEen3 = s1.zoekSteen(3);
        if (steenMetEen3 == null)
            throw new Exception("Steen met getal 3 niet gevonden, maar zou er wel moeten inzitten");
    }
}
