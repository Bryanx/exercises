package generics;

public class GenericMethodTest {


    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and String
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] strArray = {"Just", "Another", "Day"};
        // Call generic method:
        printArray(intArray);
        printArray(doubleArray);
        printArray(strArray);
    }
}