package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/2016 16:45
 */
public class main {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        namen.add("Albert");
        namen.add("Hendrik");
        namen.add("Jozefien");
        namen.add("Annabel");
        namen.add("Adelbert");

        System.out.println(namen.get(0));
        System.out.println(namen.get(namen.size()-1));

        System.out.println();

        for (String s : namen) {
            System.out.println(s);
        }
        System.out.println();

        if (namen.contains("Joske")) {
            System.out.println("Joske zit er in!");
        } else {
            System.out.println("Joske is aant chillen in de Bahamas.");
        }

        Iterator<String> namenIterator = namen.iterator();

        while (namenIterator.hasNext()) {
            if (namenIterator.next().startsWith("A"))
                namenIterator.remove();
        }

        System.out.println();

        for (String s : namen) {
            System.out.println(s);
        }

    }
}
