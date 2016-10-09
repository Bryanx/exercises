package kader;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 09/10/16 19:58
 */
public class Kader {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char symbool;
        int lengte;
        int breedte;

        System.out.print("Geef het symbool: ");
        symbool = keyboard.next().charAt(0);
        System.out.print("Geef de lengte: ");
        lengte = keyboard.nextInt();
        System.out.print("Geef de breedte (2..20): ");
        breedte = keyboard.nextInt();


        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < lengte; i++) {
                System.out.print(symbool);
            }
            System.out.println();
            for (int i = 0; i < breedte - 2; i++) {
                System.out.print(symbool);
                for (int j = 0; j < lengte - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(symbool);
            }
            for (int i = 0; i < lengte; i++) {
                System.out.print(symbool);
            }
        }
    }
}
