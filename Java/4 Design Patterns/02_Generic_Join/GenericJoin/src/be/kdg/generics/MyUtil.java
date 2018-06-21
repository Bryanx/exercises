package be.kdg.generics;

import java.util.Collection;

/**
 * Vul hier eerst de methode aan zodat alle elementen uit de collection na elkaar gescheiden door
 * de separator in de string komen. Tip: Je kunt een for each lus gebruiken.
 */
public class MyUtil {
    public static <T>String join(Collection<T> collection, String seperator) {
        StringBuilder sb = new StringBuilder();
        collection.forEach((item)->sb.append(item+seperator));
        String string = sb.toString();

        return string.substring(0, string.length() - 1);
    }
}
