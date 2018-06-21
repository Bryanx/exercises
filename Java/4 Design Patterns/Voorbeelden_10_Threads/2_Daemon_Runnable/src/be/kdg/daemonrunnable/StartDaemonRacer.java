package be.kdg.daemonrunnable;

import java.util.Scanner;

public class StartDaemonRacer {

    public static void main(String[] args) {
        DaemonRunnableRacer racer1 = new DaemonRunnableRacer("Verstappen");
        DaemonRunnableRacer racer2 = new DaemonRunnableRacer("Hamilton");

        racer1.getThread().setDaemon(true);
        racer2.getThread().setDaemon(true);

        racer1.getThread().start();
        racer2.getThread().start();

        System.out.println("Druk op ENTER om te stoppen");
        new Scanner(System.in).nextLine();

        System.out.println(racer1.getNaam() + " " + racer1.getRondeNummer());
        System.out.println(racer2.getNaam() + " " + racer2.getRondeNummer());
    }
}
