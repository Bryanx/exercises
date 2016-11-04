package machtenvantwee;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 02/11/2016 18:18
 */
public class TestMachtenVanTwee {
    public static void main(String[] args) {
        MachtenVanTwee macht = new MachtenVanTwee();
        int aantal = 0;
        boolean herhaal = true;
        Scanner scanner = new Scanner(System.in);
        macht.getMax();
        do {
            System.out.printf("Hoeveel machten van 2 wil je afdrukken (1..%d)?",
                    macht.getMax());
            if (scanner.hasNextInt()) {
                aantal = scanner.nextInt();
                if (aantal > 0 && aantal <= macht.getMax()) {
                    herhaal = false;
                }
            }
            scanner.nextLine();
        } while (herhaal);
        macht.maakTabel(aantal);
//        macht.vulTabel();
        System.out.println((int)Math.pow(4, 2));
//        macht.toString();
        // maak de tabel
        // vul de tabel met de machten van 2
        // toon de tabel via toString
    }
}