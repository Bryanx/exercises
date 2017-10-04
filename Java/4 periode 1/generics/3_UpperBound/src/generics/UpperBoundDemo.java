package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo voor het gebruik van generics in combinatie met wildcards
 */
public class UpperBoundDemo {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints = " + sum);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(3.5);
        doubles.add(10.0);
        sum = sum(doubles);
        System.out.println("Sum of doubles = " + sum);

        List<Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        sum = sum(numbers);
        System.out.println("Sum of numbers = " + sum);
    }

    /**
     * upper bound methode
     * Parameter kan NIET vervangen worden door List<Number>
     */
   private static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}