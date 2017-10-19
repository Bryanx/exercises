package be.kdg.programmeertalen.patterns;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 15:50
 */
public class ObserverProgrammeerTaal implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
