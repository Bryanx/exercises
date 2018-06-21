package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionRunner {
    public static void reflect(Class myClass) {
        try {
            Object object = myClass.newInstance();  // Vervang de null door het nodige.
            System.out.println("Voor reflection: " + object.toString());
            for (Method method : myClass.getDeclaredMethods()) {
                System.out.print(method.getName() + " ");
                if (method.getAnnotation(Changeable.class) != null) {
                    method.invoke(object,"Jan de Rijke");
                }
            }
            System.out.println("\nNa reflection: " + object.toString());

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        //  Vul hier verder aan!
    }
}

