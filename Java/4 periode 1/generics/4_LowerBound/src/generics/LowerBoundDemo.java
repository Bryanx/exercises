package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo over de werking van generics in combinatie met wildcards.
 * Hier: lower bound
 */
public class LowerBoundDemo {

    /**
     * Lower bound methode. Let op het gebruik van super.
     * Alle klassen en de klasse Integer zelf
     */
    private static void addIntegers(List<? super Integer> list) {
        list.add(50);
        list.add(100);
    }

    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        addIntegers(list1);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        addIntegers(list2);
        System.out.println(list2);

        List<Number> list3 = new ArrayList<>();
        addIntegers(list3);
        System.out.println(list3);
    }
}
