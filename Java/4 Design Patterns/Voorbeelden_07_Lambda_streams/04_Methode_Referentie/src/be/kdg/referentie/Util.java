package be.kdg.referentie;

public class Util {
    public static String transform(String string, StringFunctie functie) {
        return functie.pasFunctieToe(string);
    }

    public static String benadruk(String string) {
        return string + "!!";
    }
}
