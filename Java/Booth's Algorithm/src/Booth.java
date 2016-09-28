import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/09/16 10:55
 */
public class Booth {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        long Aaccent = 11110 00000, P = 00000111000, A = 00010000000;
        int aantal_bits = 5;


//        System.out.println("Voer een binair cijfer in voor A: ");
//        A = keyboardScanner.nextLong();
//
//        System.out.println("Voer een binair cijfer in voor A': ");
//        Aaccent = keyboardScanner.nextLong();
//
//        System.out.println("Voer een binair cijfer in voor P: ");
//        P = keyboardScanner.nextLong();

        while (aantal_bits > 0) {
            System.out.println("P"+aantal_bits+" = "+P);

            //als einde 11 of 00 is
            if (P % 100 == 11 || P % 100 == 00) {
                //arithmetic shift right
                P = P/10;
            }else if (P % 100 == 10) {
                System.out.println("P = P + A' en Arithmetic shift right");
            }else if (P % 100 == 01) {
                System.out.println("P = P + A en Arithmetic shift right");
            }
            aantal_bits--;

        }
        System.out.println("P"+aantal_bits+" = "+P);
    }
}
