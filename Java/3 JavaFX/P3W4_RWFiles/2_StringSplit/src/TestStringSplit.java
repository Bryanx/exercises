/**
 * In dit voorbeeld wordt het rooster van het gezelschapsspel "Vier op een rij" voorgesteld ahv een String.
 * Het rooster bevat 6 rijen van telkens 7 elementen
 * Met de split-methode van de klasse String wordt het rooster eerst in rijen uiteen getrokken
 * en vervolgens wordt elke rij in elementen uiteen getrokken.
 * Elk element is leeg ('_'), rood ('R') of geel ('G')
 */

public class TestStringSplit {
    public static void main(String[] args) {
        StringBuilder inhoud = new StringBuilder();
        inhoud.append("_,_,_,_,_,_,_").append("\n");
        inhoud.append("_,_,_,_,_,_,_").append("\n");
        inhoud.append("_,_,_,_,_,_,_").append("\n");
        inhoud.append("_,_,_,_,_,_,_").append("\n");
        inhoud.append("_,R,G,G,_,_,_").append("\n");
        inhoud.append("_,G,G,R,R,_,_").append("\n");

        // splits regel per regel op "\n"
        String[] regels = inhoud.toString().split("\n");
        for (String regel : regels) {
            // splits lijn in elementen op ","
            String[] elementen = regel.split(",");
            for (String element : elementen) {
                System.out.printf("%s", element);
            }
            System.out.println();
        }
    }
}
