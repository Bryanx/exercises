package temperatuurconversie;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 16:46
 */
public class TemperatuurConversie {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int keuze;
        double fahrenheit;
        double celsius;

        while (true) {
            System.out.print("Welke conversie wens je te doen? (1=C/2+F): ");
            keuze = keyboardScanner.nextInt();

            if (keuze == 1) {
                System.out.println("Uw Keuze: " + keuze);
                System.out.print("Geef de waarde in celsius : ");
                celsius = keyboardScanner.nextDouble();
                fahrenheit = celsius * 1.8 + 32;
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
            }else if (keuze == 2) {
                System.out.println("Uw Keuze: " + keuze);
                System.out.print("Geef de waarde in fahrenheit : ");
                fahrenheit = keyboardScanner.nextDouble();
                celsius = (fahrenheit - 32) / 1.8;
                System.out.println(fahrenheit + "°F = " + celsius + "°C");
            }else if (keuze == 0 || keuze > 2) {
                System.out.println("Uw Keuze: " + keuze);
                System.out.println("Tot ziens.");
                break;
            }
        }
    }
}
