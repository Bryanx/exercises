package hashset3;

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

//        Set<Girl> girlsTreeSet = new TreeSet<>(Arrays.asList(girls));
        Set<Girl> girlsLinkedSet = new LinkedHashSet<>(Arrays.asList(girls));
        Set<Girl> girlsSet = new HashSet<>(Arrays.asList(girls));
//        System.out.println("\nTreeSet:");
//        System.out.println(girlsLinkedSet);
        System.out.println("LinkedHashSet:");
        System.out.println(girlsLinkedSet);
        System.out.println("\nGewone Set:");
        System.out.println(girlsSet);

    }
}
