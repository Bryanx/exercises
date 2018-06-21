package hashset;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 14:40
 */
public class Main {
    public static void main(String[] args) {
        String[]girls = {"An", "Bea", "Bea", "Diana",
                "Zoë", "Katleen", "Kristin", "Bea", "Kristin",
                "Gertrude"};

        Set<String> namenSet = new HashSet<>(Arrays.asList(girls));

        System.out.println("Met forea: ");
        for (String s : namenSet) {
            System.out.println(s);
        }

//        for (int i = 0; i < namenSet.size(); i++) {
//            System.out.println(namenSet.get(i));
//        }

        System.out.println("\nMet itco: ");
        for (Iterator<String> iterator = namenSet.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

//        Collections.sort(namenSet);
    }
}
