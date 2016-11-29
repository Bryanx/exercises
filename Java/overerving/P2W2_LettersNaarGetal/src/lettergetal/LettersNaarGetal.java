package lettergetal;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 21:04
 */
public class LettersNaarGetal {
    private static String[] cijfers = {
            "nul", "een", "twee", "drie", "vier",
            "vijf", "zes", "zeven", "acht", "negen"
    };
    public static long zetOm(String string) {
        long getal = 0L;
        String[] stringInvoer = string.split(" ");
        for (int i = 0; i < cijfers.length; i++) {
            for (int j = 0; j < stringInvoer.length; j++) {
                if (cijfers[i].equals(stringInvoer[j])) {
                    getal += i * (Math.pow(10,j));
                }
            }
        }
        return getal;
    }
}