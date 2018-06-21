package be.kdg;

import be.kdg.data.Artikel;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Artikel> supplier = () -> new Artikel(11, "Lenovo", "B70-80 80MR000CMB", 999);
        Artikel artikel = supplier.get();
        System.out.println(artikel);

        Supplier<Integer> intSupplier = Artikel::getAantalArtikels;
        System.out.println("Aantal artikels: " + intSupplier.get() );
    }
}

/*
 11 - Lenovo  - B70-80 80MR000CMB       - € 999,00
Aantal artikels: 1
*/