package be.kdg.prime;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 18:19
 */
public class FactorenRunnable implements Runnable {
    private static long getal;
    private static int aantalFactoren = 0;
    private int begin;
    private int einde;

    public FactorenRunnable(int begin, long teOnderzoekenGetal) {
        if (begin == 0) {
            this.begin = 2;
        } else {
            this.begin = begin;
        }
        getal = teOnderzoekenGetal;
        einde = begin + 99;
    }

    @Override
    public void run() {
        for (int i = begin; i < einde+1; i++) {
            if (getal % i == 0) {
                aantalFactoren++;
                System.out.println("Factor " + i + " --> " + Thread.currentThread().getName());
            }
        }
    }

    public static int getAantalFactoren() {
        return aantalFactoren;
    }
}
