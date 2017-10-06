import reflection.Boek;
import reflection.ReflectionRunner;

// HIER MAG JE NIETS WIJZIGEN!

public class TestReflection {
    public static void main(String[] args) {
        ReflectionRunner.reflect(Boek.class);
    }
}

// Verwachte afdruk:
/*
Voor reflection: Titel: "Onbekend" (Anoniem) €0,00
equals toString hashCode getAuteur setAuteur getPrijs getTitel
Na reflection: Titel: "Onbekend" (Jan de Rijke) €0,00
*/