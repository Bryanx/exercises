package arraybuilder;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 14:11
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder[] kleuren = new StringBuilder[4];
        kleuren[0] = new StringBuilder("Harten");
        kleuren[1] = new StringBuilder("Schoppen");
        kleuren[2] = new StringBuilder("Klaveren");
        kleuren[3] = new StringBuilder("Ruiten");

        for (StringBuilder kleur :
                kleuren) {
            System.out.println(kleur);
        }

        String tekst = "Java leer je niet in een twee drie";
        String[] woorden = tekst.split(" ");

        for (String woord : woorden) {
            System.out.print("\"" + woord + "\" ");
        }
        System.out.println();

        String woord = "JavaScript";
        char[] letters = woord.toCharArray();

        for (char letter:
             letters) {
            System.out.print(letter + " ");
        }

        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }

    }
}
