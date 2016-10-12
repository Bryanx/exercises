package persoon;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 10:56
 */
public class PersoonDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String naam;
        int leeftijd;

        System.out.print("Geef de naam: ");
        naam = keyboard.nextLine();

        System.out.print("Geef de leeftijd: ");
        leeftijd = keyboard.nextInt();

        Persoon ik = new Persoon(naam, leeftijd);

        System.out.println("Mijn naam: " + ik.getNaam());
        System.out.println("Mijn leeftijd: " + ik.getLeeftijd());

        ik.setLeeftijd(42);

        System.out.println("Mijn naam: " + ik.getNaam());
        System.out.println("Mijn leeftijd: " + ik.getLeeftijd());

        ik.setNaam("Joske");

        System.out.println("Mijn naam: " + ik.getNaam());
        System.out.println("Mijn leeftijd: " + ik.getLeeftijd());


    }
}
