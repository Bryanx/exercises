package be.kdg.deamonlambda;

import java.util.Random;
import java.util.Scanner;

/*
 * Let op! Dit programma geeft niet dezelfde uitvoer als de andere Daemon versies.
 * In dit geval moet ik het rondenummer in de lus afdrukken (beperking van de lambda expression).
 * Zie onderaan voor een mogelijke uitvoer!
 */
public class StartDaemonRacer {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Runnable myRunnable = () -> {
	        //Todo: vul lambda expressie aan

        };

        Thread threadEen = new Thread(myRunnable, "Hamilton");
        Thread threadTwee = new Thread(myRunnable, "Rosberg");

        threadEen.setDaemon(true);
        threadTwee.setDaemon(true);

        threadEen.start();
        threadTwee.start();

        System.out.println("Druk op <ENTER> om te stoppen...");
        new Scanner(System.in).nextLine();
    }
}

/*
Druk op <ENTER> om te stoppen...
Rosberg START
Hamilton START
Hamilton legt ronde  1 af
Hamilton legt ronde  2 af
Rosberg  legt ronde  1 af
Hamilton legt ronde  3 af
Rosberg  legt ronde  2 af
Hamilton legt ronde  4 af
Hamilton legt ronde  5 af
Rosberg  legt ronde  3 af
Hamilton legt ronde  6 af
Hamilton legt ronde  7 af
Rosberg  legt ronde  4 af
Rosberg  legt ronde  5 af
Hamilton legt ronde  8 af
Rosberg  legt ronde  6 af
 */