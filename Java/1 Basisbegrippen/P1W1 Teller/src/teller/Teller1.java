package teller;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 10:17
 */
public class Teller1 {

    // Methode met de naam main
    // Het startpunt van de app

    public static void main(String[] args) {

        // Int is altijd een heel getal
        // De variabele is getal en de inhoud is 1
        int getal = 1;
        // while zorgt voor een oneindige loop
        while (true) {
            System.out.println(getal);
            getal = getal + 1;
        }
    }
}
