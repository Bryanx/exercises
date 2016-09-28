package cijfers2;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 16:13
 */
public class Cijfers2 {
        public static void main(String[] args) {
            Scanner keyboardScanner = new Scanner(System.in);

            int cijfer;
            int som;

            System.out.println("Geef een geheel getal dat uit 4 cijfers bestaat (1000..9999): ");
            cijfer = keyboardScanner.nextInt();

            som = (cijfer/1000) + (cijfer/100%10) + (cijfer/10%10) + (cijfer%10);
            System.out.println(som);
            System.out.println("De som van de afzonderlijke cijfers is "+som);
        }
    }

