package palindroom;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/11/2016 13:49
 */
public class Palindroom {
    public static boolean isPalindroom(String string) {
        String reverseString = "";
        String lowercase = string.toLowerCase();
        char[] chararray = lowercase.toCharArray();

        for (int i = 0; i < chararray.length; i++) {
            reverseString += chararray[chararray.length-i-1];
        }
        return lowercase.equals(reverseString);
    }
    public static boolean isZinPalindroom(String string) {
        String reverseString = "";
        String basicString = string.toLowerCase().replace(",", "")
                .replace(":", "").replace(".", "").replace(" ", "").replace("\"", "");

        char[] chararray = basicString.toCharArray();

        for (int i = 0; i < chararray.length; i++) {
            reverseString += chararray[chararray.length-i-1];
        }
        return basicString.equals(reverseString);
    }
}
