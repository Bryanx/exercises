package be.kdg.supplier;

import java.util.function.Supplier;


public class MySupplier {
    public Piloot returnPiloot() {
        // Vul hieronder de juiste Lambda expression aan
        // Maak een nieuw Piloot object met als parameters
        // "Red Bull", "Verstappen" en 33.
        Supplier<Piloot> pilootSupplier = () -> new Piloot("Red Bull", "Verstappen", 33);
        return pilootSupplier.get();
    }

    public String groet(Supplier<String> supplier) {
        // Vul hier aan, vervang "..." door de juiste oproep
        return "Hello " + supplier.get() + "!";
    }
}
