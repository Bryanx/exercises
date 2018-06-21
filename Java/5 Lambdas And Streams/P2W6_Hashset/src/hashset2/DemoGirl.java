package hashset2;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 14:46
 */
public class DemoGirl {
    public static void main(String[] args) {
        Girl[] girls = {new Girl("An", 20),new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Katleen", 18),
                new Girl("Bea", 20)};

        List<Girl> girlsList = new ArrayList<>(Arrays.asList(girls));
        Set<Girl> girlsSet = new HashSet<>(Arrays.asList(girls));
        System.out.println("\nList:");
        System.out.println(girlsList);
        System.out.println("\nSet:");
        System.out.println(girlsSet);

    }
}
