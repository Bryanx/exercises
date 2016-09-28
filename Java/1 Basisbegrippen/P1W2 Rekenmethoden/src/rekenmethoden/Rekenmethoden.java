package rekenmethoden;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 14:44
 */
public class Rekenmethoden {
    public static void main(String[] args) {

        int eersteGetal = 8;
        int tweedeGetal = 5;
        int result;

        System.out.println("Som: " + (eersteGetal + tweedeGetal));
        System.out.println("Verschil: " + (eersteGetal - tweedeGetal));
        System.out.println("Product: " + (eersteGetal * tweedeGetal));
        System.out.println("Quotient: " + (eersteGetal / tweedeGetal));
        System.out.println("Rest: " + (eersteGetal % tweedeGetal)+"\n");


        result = ++eersteGetal;
        System.out.println("Resultaat: " + result);
        System.out.println("Eerste getal: " + eersteGetal+"\n");

        result = eersteGetal++;
        System.out.println("Resultaat: " + result);
        System.out.println("Eerste getal: " + eersteGetal+"\n");

        result = --eersteGetal;
        System.out.println("Resultaat: " + result);
        System.out.println("Eerste getal: " + eersteGetal+"\n");

        result = eersteGetal--;
        System.out.println("Resultaat: " + result);
        System.out.println("Eerste getal: " + eersteGetal);
    }
}
