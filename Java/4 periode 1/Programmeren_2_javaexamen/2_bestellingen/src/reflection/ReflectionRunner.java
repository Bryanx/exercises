package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class ReflectionRunner {

    public static void reflect(Class myClass) {
        // Opgave 2.7
        Object object = null;
        try {
            object = myClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("Voor reflection: " + object);



        for (Method method : myClass.getDeclaredMethods()) {
            System.out.print(method.getName() + " ");
            if (method.getAnnotation(Changeable.class) != null) {
                try {
                    method.invoke(object, "Bryan de Ridder");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            
        }

        System.out.println("\nNa reflection: " + object);
    }
}
