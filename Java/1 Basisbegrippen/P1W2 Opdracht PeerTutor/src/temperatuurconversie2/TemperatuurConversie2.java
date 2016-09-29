package temperatuurconversie2;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 17:06
 */
public class TemperatuurConversie2 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int beginTemperatuur;
        double eindTemperatuur;
        int stapWaarde;
        double fahrenheit;

        System.out.print("Geef de begintemperatuur in °C: ");
        beginTemperatuur = keyboardScanner.nextInt();
        System.out.print("Geef de eindtemperatuur in °C: ");
        eindTemperatuur = keyboardScanner.nextDouble();

        if (beginTemperatuur > eindTemperatuur) {
            System.out.println("Begin temperatuur kan niet kleiner zijn dan de eindtemperatuur.");
            return;
        }


        System.out.print("Geef de stapwaarde: ");
        stapWaarde = keyboardScanner.nextInt();

        System.out.println(beginTemperatuur + " °C = " + (beginTemperatuur * 1.8 + 32) + "°F");

        while (beginTemperatuur < eindTemperatuur) {
            beginTemperatuur += stapWaarde;
            fahrenheit = beginTemperatuur * 1.8 + 32;
            System.out.println(beginTemperatuur + " °C = " + fahrenheit + "°F");
        }
    }
}
