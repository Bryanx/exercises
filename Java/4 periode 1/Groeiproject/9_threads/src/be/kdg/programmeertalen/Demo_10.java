package be.kdg.programmeertalen;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTaalFactory;
import be.kdg.programmeertalen.model.Stijl;
import be.kdg.programmeertalen.threading.ProgrammeerTaalAttacker;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/17 11:37
 */
public class Demo_10 {
    public static void main(String[] args) {
        List<ProgrammeerTaal> talen = Stream.generate(ProgrammeerTaalFactory::newRandomProgrammeerTaal)
                .limit(1000)
                .collect(Collectors.toList());


        Thread een = new Thread(new ProgrammeerTaalAttacker(talen, p -> p.getStijl() == Stijl.OBJECTORIENTED));
        Thread twee = new Thread(new ProgrammeerTaalAttacker(talen, p -> p.getAantalGebruikers() > 500000000));
        Thread drie = new Thread(new ProgrammeerTaalAttacker(talen, p -> p.getNaam().toLowerCase().contains("e")));

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

        System.out.println("Na uitzuivering: ");
        System.out.println("Aantal OO talen: " +
                talen.stream().filter(p -> p.getStijl() == Stijl.OBJECTORIENTED).count());
        System.out.println("Aantal talen met 500M+ users: " +
                talen.stream().filter(p -> p.getAantalGebruikers() > 500000000).count());
        System.out.println("Aantal talen met 'e' in de naam: " +
                talen.stream().filter(p -> p.getNaam().toLowerCase().contains("e")).count());
    }
}
