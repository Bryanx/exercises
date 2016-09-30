package peertutor3;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/09/16 13:51
 */
public class Peertutor3 {
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