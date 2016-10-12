package getallenrooster;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 11/10/16 15:44
 */
public class Getallenrooster {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int getal;

        System.out.print("Geef een getal (1..30) stop met 0: ");
        getal = keyboardScanner.nextInt();

        for (int i = 0; i < getal; i++) {
            System.out.print("======");
        }
        System.out.print("=\n");
        for (int i = 1; i <= getal; i++) {
            System.out.print("|");
            for (int teller = i; teller <= getal * i; teller += i) {
                System.out.printf("%4d |", teller);
            }
            System.out.println();
        }
        for (int i = 0; i < getal; i++) {
            System.out.print("======");
        }
        System.out.print("=\n");

    }
}
