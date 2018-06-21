package be.kdg.programmeertalen;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTaalFactory;
import be.kdg.programmeertalen.model.ProgrammeerTalenSet;
import be.kdg.programmeertalen.patterns.UnmodifiableProgrammeerTalen;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_5 {
    public static void main(String[] args) {

//        ObservableProgrammeerTalen observable = new ObservableProgrammeerTalen();
//        ObserverProgrammeerTaal observer = new ObserverProgrammeerTaal();
//        observable.addObserver(observer);
//
//        Data.getLijst().forEach(observable::voegToe);
//
//        for (ProgrammeerTaal programmeerTaal : Data.getLijst()) {
//            observable.verwijder(programmeerTaal.getNaam());
//        }
//        System.out.println(ProgrammeerTaalFactory.newEmptyProgrammeerTaal());
//        Random r = new Random();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(ProgrammeerTaalFactory.newRandomProgrammeerTaal());
//        }

        ProgrammeerTalenSet set = new ProgrammeerTalenSet();
        set.voegToe(ProgrammeerTaalFactory.newEmptyProgrammeerTaal());
        UnmodifiableProgrammeerTalen unmodi = new UnmodifiableProgrammeerTalen(set);
        System.out.println(unmodi.gesorteerdOpAantalGebruikers());
    }
}
