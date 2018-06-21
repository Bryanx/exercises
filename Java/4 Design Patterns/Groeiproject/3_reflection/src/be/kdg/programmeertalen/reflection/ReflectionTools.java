package be.kdg.programmeertalen.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/17 14:39
 */
public class ReflectionTools {
    public static void classAnalysis(Class aClass) {
        System.out.println("Analyse van klasse: " + aClass.getSimpleName());
        for (int i = 0; i < 50; i++) System.out.print("=");
        System.out.println("\nFully qualified name\t: " + aClass.getName());
        System.out.println("Naam van de superklasse\t: " + aClass.getSuperclass().getSimpleName());
        System.out.println("Naam van de package\t: " + aClass.getPackage().getName());
        System.out.print("Interfaces\t: ");
        for (Class intface : aClass.getInterfaces()) {
            System.out.print(intface.getName() + " ");
        }
        System.out.print("\nConstructors:\n");
        for (Constructor constructor : aClass.getConstructors()) {
            System.out.println("\t" + constructor.getName());
        }
        System.out.print("Attributen\t: ");
        for (Field field : aClass.getDeclaredFields()) {
            System.out.print(field.getName() + " ");
        }
        System.out.print("\nGetters\t: ");
        for (Method method : aClass.getMethods()) {
            if (method.getName().startsWith("get"))
                System.out.print(method.getName() + " ");
        }
        System.out.print("\nSetters\t: ");
        for (Method method : aClass.getDeclaredMethods()) {
            if (method.getName().startsWith("set"))
                System.out.print(method.getName() + " ");
        }
        System.out.print("\nAndere methoden\t: ");
        for (Method method : aClass.getDeclaredMethods()) {
            String name = method.getName();
            if (!(name.startsWith("set") || name.startsWith("get")))
                System.out.print(method.getName() + " ");
        }
        System.out.println();

    }

    public static Object runAnnotated(Class aClass) {
        Object obj = null;
        try {
            obj = aClass.newInstance();
            for (Method method : aClass.getMethods()) {
                if (method.getAnnotation(CanRun.class) != null) {
                    method.invoke(obj, "dummy");
                }
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return obj;
    }

}

