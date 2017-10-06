package oefening;

import oefening.reflection.RentCar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Class<RentCar> rental = RentCar.class;
        System.out.println("Package naam: " + rental.getPackage());
        System.out.print("Constructor: ");
        for (Constructor con : rental.getConstructors()) {
            System.out.print(con + "\n");
        }
        System.out.print("\nMethoden: ");
        for (Method method : rental.getDeclaredMethods()) {
            System.out.print(method.getName() + " ");
        }
        System.out.print("\nAttributen: ");
        for (Field field : rental.getDeclaredFields()) {
            System.out.print(field.getName() + " ");
        }
        System.out.println("\n");
        for (Method method : rental.getMethods()) {
            if (method.getName().equals("computeRentalCost")) {
                Object car;
                try {
                    car = rental.newInstance();
                    method.invoke(car, 500);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            Object obj = rental.newInstance();

            for (Field field : rental.getDeclaredFields()) {
                if (field.getName().equals("type")) {
                    field.setAccessible(true);
                    try {
                        field.set(obj, "extra large");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            for (Method method : rental.getMethods()) {
                if (method.getName().equals("getType")) {
                    try {
                        String test = (String) method.invoke(obj);
                        System.out.println("Waarde van type: " + test);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

/*
    Package naam: package oefening.reflection
    Constructor: public oefening.reflection.RentCar(int)
    Methoden: getType setRate setType getRate computeRentalCost wait wait wait equals toString hashCode getClass notify notifyAll
    Attributen: rate type price

    The cost of your rental car is €180
    Waarde van type: extra large
*/
