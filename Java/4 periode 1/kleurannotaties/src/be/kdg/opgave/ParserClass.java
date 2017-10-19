package be.kdg.opgave;

import java.lang.reflect.*;

public class ParserClass {
    public static void execute(Class<?> aClass) {
        try {
            Object anObject = aClass.newInstance();

            for (Method method : aClass.getDeclaredMethods()) {
                Kleur kleurAnnot = method.getAnnotation(Kleur.class);
                if (kleurAnnot != null) {
                    for (Method method2 : aClass.getDeclaredMethods()) {
                        if (method2.getName().equals("setKleur")) {
                            method2.invoke(anObject,kleurAnnot.kleurNaam());
                        }
                    }
                    method.invoke(anObject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}


