package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.Stijl;
import be.kdg.programmeertalen.threading.ProgrammeerTaalRunnable;

import java.util.stream.Stream;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_9 {
    private static final int TESTCOUNT = 100;

    public static void main(String[] args) {

        ProgrammeerTalen talen = new ProgrammeerTalen();
        Data.getLijst().forEach(talen::voegToe);

        ProgrammeerTaalRunnable run1 = new ProgrammeerTaalRunnable(p -> p.getStijl() == Stijl.OBJECTORIENTED);
        ProgrammeerTaalRunnable run2 = new ProgrammeerTaalRunnable(p -> p.getStijl() == Stijl.FUNCTIONEEL);
        ProgrammeerTaalRunnable run3 = new ProgrammeerTaalRunnable(p -> p.getStijl() == Stijl.IMPERATIEF);

        Thread een = new Thread(run1, "een");
        Thread twee = new Thread(run2, "twee");
        Thread drie = new Thread(run3, "een");

        een.start();
        twee.start();
        drie.start();

        try {
            een.join();
            twee.join();
            drie.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        run1.getLijst().stream().limit(5).forEach(System.out::println);
        run2.getLijst().stream().limit(5).forEach(System.out::println);
        run3.getLijst().stream().limit(5).forEach(System.out::println);


        double totaal = 0L;
        for (int i = 0; i < TESTCOUNT; i++) {
            long start = System.currentTimeMillis();
            Thread een2 = new Thread(run1);
            Thread twee2 = new Thread(run2);
            Thread drie2 = new Thread(run3);

            een2.start();
            twee2.start();
            drie2.start();

            try {
                een2.join();
                twee2.join();
                drie2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            totaal += System.currentTimeMillis() - start;
        }

        System.out.println("3 threads verzamelen elk 1000 talen (gemiddelde uit 100 runs): " + totaal/TESTCOUNT + "ms.");
    }
}
