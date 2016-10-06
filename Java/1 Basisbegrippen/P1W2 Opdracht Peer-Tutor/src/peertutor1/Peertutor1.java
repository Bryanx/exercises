package peertutor1;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/09/16 13:50
 */
public class Peertutor1 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        double beginTemperatuur;
        double fahrenheit;
        int keuze;

        for (int i = 0; i < 3; i++) {
            System.out.println("Welke conversie wens je te doen?");
            System.out.println("1) C naar F");
            System.out.println("2) F naar C");
            keuze = keyboardScanner.nextInt();
            System.out.println("Uw keuze: " + keuze);

            switch (keuze) {
                case 1:
                    System.out.print("Geef de waarde in C: ");
                    beginTemperatuur = keyboardScanner.nextInt();
                    fahrenheit = beginTemperatuur * 1.8 + 32;
                    System.out.println(beginTemperatuur + "C = " + fahrenheit + "F");
                    break;
                case 2:
                    System.out.print("Geef de waarde in F: ");
                    fahrenheit = keyboardScanner.nextInt();
                    beginTemperatuur = fahrenheit - 32 / 1.8;
                    System.out.println(beginTemperatuur + "F = " + fahrenheit + "C");
                    break;
                default:
                    System.out.println("Foute invoer!");
            }
        }
    }
}
