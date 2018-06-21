package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Voorbeeld bij het gebruik van generics in combinatie met wildcards.
 * Hier: unbound
 */
public class UnBoundDemo {
    /**
     * Unbound methode. Let op het gebruik van <?>
     */
    private static void printData(List<?> list) {
        for (Object object : list) {
            System.out.print(object + "::");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);

        printData(ints);

        List<String> strings = new ArrayList<>();
        strings.add("Just");
        strings.add("Another");
        strings.add("Day");
        printData(strings);

        List<Object> objects = new ArrayList<>();
        objects.add(3.14);
        objects.add("Hello");
        objects.add(new Random());
        printData(objects);
    }
}
