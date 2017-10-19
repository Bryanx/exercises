package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTaalFactory;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.ProgrammeerTalenSet;
import be.kdg.programmeertalen.patterns.ObservableProgrammeerTalen;
import be.kdg.programmeertalen.patterns.ObserverProgrammeerTaal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
//        for (int i = 0; i < 15; i++) {
//            System.out.println(ProgrammeerTaalFactory.newRandomProgrammeerTaal());
//        }

        for (int i = 0; i < 15; i++) {
            System.out.println(ProgrammeerTaalFactory.newRandomProgrammeerTaal());
        }
    }
}
