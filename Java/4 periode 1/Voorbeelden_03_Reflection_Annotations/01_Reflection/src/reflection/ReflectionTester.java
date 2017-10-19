package reflection;

import model.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.time.LocalDate;
import java.util.Hashtable;

public class ReflectionTester {

    public static void printName(Object obj) {
        Class aClass = obj.getClass();
        System.out.printf("Volledige naam van de klasse: %s\n", aClass.getName());
    }

    public static void printMethods(Object obj) {
        Class aClass = obj.getClass();
        System.out.printf("%d methoden gevonden in de klasse %s:\n",
                aClass.getDeclaredMethods().length, aClass.getSimpleName());
        for (Method method : aClass.getDeclaredMethods()) {
            System.out.printf("\t%s (returns: %s, parameters: %d)\n",
                    method.getName(), method.getReturnType(), method.getParameterCount());
        }
    }

    public static void printConstructors(Object obj) {
        Class aClass = obj.getClass();
        System.out.printf("%d constructors gevonden in de klasse %s:\n",
                aClass.getDeclaredConstructors().length, aClass.getName());
        for (Constructor constructor : aClass.getDeclaredConstructors()) {
            System.out.printf("\t%s (parameters: %d)\n",
                    constructor.getName(), constructor.getParameterCount());
        }
    }

    public static void makeAlive(Class aClass) {
        try {
            System.out.printf("Nieuw object instantieren van de klasse %s:\n", aClass.getName());
            Object object = aClass.newInstance(); //default constructor oproepen
            System.out.println(object.toString());

            for (Method method : aClass.getDeclaredMethods()) {
                if (method.getName().startsWith("get")) {
                    Object result = method.invoke(object);
                    System.out.printf("\tResult van %s: %s\n", method.getName(), result); //...en resultaat ervan afgedrukt
                }
            }

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void examineFields(Object object) {
        try {
            Class aClass = object.getClass();
            System.out.printf("Fields van %s:\n", aClass.getName());
            for (Field field : aClass.getDeclaredFields()) {
                System.out.printf("\"%s\" van het type: %s\n", field.getName(), field.getType());
                field.setAccessible(true); //Om toch toegang te krijgen tot private fields
                System.out.printf("\ttoegang: %s \n\twaarde: %s\n",
                        Modifier.toString(field.getModifiers()),
                        field.get(object));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ReflectionTester{}";
    }

    public static void changeByReflection(Object object) {
        System.out.println("private fields wijzigen!!!");
        System.out.println("VOOR reflection: " + object);
        try {
            Class aClass = object.getClass();
            Field field = aClass.getDeclaredField("studNr");
            field.setAccessible(true);
            field.set(object, 666);
            field = aClass.getDeclaredField("naam");
            field.setAccessible(true);
            field.set(object, "Mephisto");
            field = aClass.getDeclaredField("geboorteDatum");
            field.setAccessible(true);
            field.set(object, LocalDate.now());
            System.out.println("NA reflection: " + object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

