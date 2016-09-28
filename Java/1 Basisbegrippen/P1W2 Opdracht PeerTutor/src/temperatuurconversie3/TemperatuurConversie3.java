package temperatuurconversie3;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 17:06
 */
public class TemperatuurConversie3 {
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
        }else {
            System.out.print("Geef de stapwaarde: ");
            stapWaarde = keyboardScanner.nextInt();


            System.out.println("=====================");
            System.out.println("|\t°C\t|\t°F\t\t|");
            System.out.println("|-------------------|");

            while (beginTemperatuur < eindTemperatuur) {
                System.out.println("|\t" + beginTemperatuur + "\t|\t" + (beginTemperatuur * 1.8 + 32) + "\t|");
                beginTemperatuur += stapWaarde;
            }
            System.out.println("=====================");
        }
    }
}
