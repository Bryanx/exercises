package asciitabel;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 12:12
 */
public class AsciiTabel {
    public static void main(String[] args) {

        int getal = 31;
        char ascii;
        final int AANTAL_KOLOMMEN = 6;

        while (getal++ > 30 && getal < 127) {
            ascii = (char) getal;

            System.out.print(ascii + (getal > 99 ? " (" + getal + ")\t\t" : " ( " + getal + ")\t\t"));

            if (getal % AANTAL_KOLOMMEN == 1) {
                System.out.println();
            }
        }
    }
}
