package be.kdg;

import be.kdg.supplier.MySupplier;
import be.kdg.supplier.Piloot;

public class TestSupplier {
    public static void main(String[] args) {
        MySupplier supplier = new MySupplier();

        System.out.println(supplier.returnPiloot());
        // Vervang de puntjes door de juiste lambda expression
        // zodat je de verwachte afdruk bekomt.
        System.out.println(supplier.groet(() -> "Max"));

        Piloot piloot = new Piloot("k","d",23);
    }
}

/*
Verstappen 33 Torro Rosso
Hello Max!
 */