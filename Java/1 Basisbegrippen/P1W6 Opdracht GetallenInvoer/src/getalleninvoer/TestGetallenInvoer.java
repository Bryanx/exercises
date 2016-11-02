package getalleninvoer;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 22:51
 */
public class TestGetallenInvoer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantal;
        do {
            System.out.print("\nHoeveel getallen ga je invoeren? (stop met 0): ");
            aantal = scanner.nextInt();
            if (aantal > 0) {
                GetallenInvoer getallen = new GetallenInvoer(aantal);
                for (int i = 0; i < aantal; i++) {
                    System.out.printf("Geef getal %2d: ", i + 1);
                    int getal = scanner.nextInt();
                    getallen.voegGetalToe(i, getal);
                }
                System.out.println(getallen.toonGetallen());
            }
        } while (aantal > 0);
    }
}
