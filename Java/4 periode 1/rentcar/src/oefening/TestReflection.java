package oefening;

import oefening.reflection.RentCar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Class<RentCar> rental = RentCar.class;


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
