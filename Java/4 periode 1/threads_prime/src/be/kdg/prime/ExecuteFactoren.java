package be.kdg.prime;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 18:24
 */
public class ExecuteFactoren {

    private static final long DEMOGETAL = 214_577_422_401L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een getal: ");
        long getal = DEMOGETAL;
        try {
            getal = scanner.nextLong();
        } catch (InputMismatchException e) {
            // foutieve invoer, we nemen het demogetal
        }
        // Hier aanvullen!
        int aantalThreads = (int) (Math.sqrt(getal)/100)+1;
        for (int i = 0; i < aantalThreads; i++) {
            FactorenRunnable r = new FactorenRunnable(i*100, getal);
            Thread t = new Thread(r);
            t.start();
        }

        if (FactorenRunnable.getAantalFactoren() == 0) {
            System.out.println("Dit is een priemgetal!");
        }
    }//77422401
}