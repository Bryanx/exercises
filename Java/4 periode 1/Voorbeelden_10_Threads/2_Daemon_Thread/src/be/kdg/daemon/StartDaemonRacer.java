package be.kdg.daemon;

import java.util.Scanner;

public class StartDaemonRacer {
    public static void main(String[] args) {
        DaemonRacer threadEen = new DaemonRacer("Hamilton");
        DaemonRacer threadTwee = new DaemonRacer("Rosberg");

        threadEen.setDaemon(true);
        threadTwee.setDaemon(true);

        threadEen.start();
        threadTwee.start();

        System.out.println("Druk op <ENTER> om te stoppen...");
        new Scanner(System.in).nextLine();

        System.out.printf("%s legde %d ronden af.%n", threadEen.getNaam(), threadEen.getRondeNummer());
        System.out.printf("%s legde %d ronden af.%n", threadTwee.getNaam(), threadTwee.getRondeNummer());
    }
}
