package verkoper;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/2016 22:42
 */
public class TestVerkoper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef de omzet van de eerste verkoper: ");
        double omzet = scanner.nextDouble();
        Verkoper greg = new Verkoper("Greg", omzet);
        System.out.print("Geef de omzet van de tweede verkoper: ");
        omzet = scanner.nextDouble();
        Verkoper carl = new Verkoper("Carl", omzet);
        System.out.print("Geef de omzet van de derde verkoper: ");
        omzet = scanner.nextDouble();
        Verkoper fleur = new Verkoper("Fleur", omzet);
        /* Vul hier aan */

        if (greg.heeftGrotereOmzet(carl, fleur)) {
            System.out.println("De beste verkoper is " + greg.getNaam() + " met een omzet van €" + greg.getOmzet());
        } else if (carl.heeftGrotereOmzet(greg, fleur)) {
            System.out.println("De beste verkoper is " + carl.getNaam() + " met een omzet van €" + carl.getOmzet());
        } else {
            System.out.println("De beste verkoper is " + fleur.getNaam() + " met een omzet van €" + fleur.getOmzet());
        }
    }
}