package be.kdg.programmeertalen;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.Taal;
import be.kdg.programmeertalen.reflection.ReflectionTools;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_3 {
    public static void main(String[] args) {
        ReflectionTools.classAnalysis(Taal.class);
        System.out.println();
        ReflectionTools.classAnalysis(ProgrammeerTaal.class);
//        System.out.println("Aangemaakt object door runAnnotated: ");
//        Object obj = ReflectionTools.runAnnotated(Taal.class);
//        System.out.println(obj);
    }
}
