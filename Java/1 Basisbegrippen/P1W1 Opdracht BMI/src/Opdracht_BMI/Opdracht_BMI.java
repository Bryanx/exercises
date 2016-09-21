package Opdracht_BMI;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 15:33
 */
public class Opdracht_BMI {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        String naam;
        double lengte, gewicht, BMI;

        System.out.println("Wat je naam?");
        naam = keyboardScanner.nextLine();
        System.out.println("Wat is je lengte in meters?");
        lengte = keyboardScanner.nextDouble();
        System.out.println("Wat is je gewicht in kg?");
        gewicht = keyboardScanner.nextInt();

        BMI = gewicht / (lengte * lengte);
        System.out.println(BMI);

        if (BMI < 18.5) {
            System.out.print("Beste " + naam);
            System.out.print(", je BMI bedraagt " + BMI);
            System.out.print(". Helaas, dat is ondergewicht.");
        }else if (BMI < 24.9) {
            System.out.print("Beste " + naam);
            System.out.print(", je BMI bedraagt " + BMI);
            System.out.print(". Proficiat, dat is normaalgewicht.");
        }else if (BMI < 29.9) {
            System.out.print("Beste " + naam);
            System.out.print(", je BMI bedraagt " + BMI);
            System.out.print(". Helaas, dat is overgewicht.");
        }else if (BMI < 39.9) {
            System.out.print("Beste " + naam);
            System.out.print(", je BMI bedraagt " + BMI);
            System.out.print(". Helaas, dat is zwaarlijvigheid.");
        }else if (BMI > 40) {
            System.out.print("Beste " + naam);
            System.out.print(", je BMI bedraagt " + BMI);
            System.out.print(". Helaas, dat is obesitas.");
        }

    }
}
