package temperatuur;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 09:38
 */
public class TemperatuurExpert {
    //ATRIBUTEN
    private double[] temp;
    private int aantalTemperaturen;

    //CONSTRUCTORS
    public TemperatuurExpert(int aantal) {
        this.aantalTemperaturen = aantal;
        this.temp = new double[this.aantalTemperaturen];
    }

    //METHODES
    public void vraagTemperaturen() {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Geef de "+this.aantalTemperaturen+" temperaturen: ");
        for (int i = 0; i < this.aantalTemperaturen; i++) {
            System.out.printf("Dag %d: ", i + 1);
            this.temp[i] = keyboardScanner.nextDouble();
        }
    }

    public void toonRapport() {
        System.out.println("Overzicht:");
        System.out.println("=================");
        double total = 0;
        for (int i = 0; i < this.aantalTemperaturen; i++) {
            System.out.printf("Dag %d: %10.2f\n", i + 1, this.temp[i]);
            total += this.temp[i];
        }
        System.out.println("=================");
        System.out.printf("Gemiddelde: %5.1f\n", total/this.aantalTemperaturen);
        System.out.println("=================");

    }
}
