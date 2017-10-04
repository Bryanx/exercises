package be.kdg.interfacedemo;

/**
 * De main methode van dit programma is exact gelijk aan dit van StartKlassiek.
 * In dit deel van de opgave moet je in de klassen Getallen en Woorden gebruik
 * maken van een ArrayList in plaats van een klassieke tabel.
 */
public class StartDynamisch {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 1, 10, 4, 3, 7, 6, 9};
        String[] eurolanden = {
                "Nederland", "België", "Frankrijk", "Duitsland", "Italië", "Spanje",
                "Finland", "Ierland", "Portugal", "Oostenrijk", "Luxemburg", "Griekeland",
                "Slovenië"
        };

        Sorteerder getallen = new Getallen(numbers);
        System.out.println("getallen = " + getallen);
        getallen.sort();
        System.out.println("getallen = " + getallen);
        getallen.sortReversed();
        System.out.println("getallen = " + getallen);

        Sorteerder woorden = new Woorden(eurolanden);
        System.out.println("woorden = " + woorden);
        woorden.sort();
        System.out.println("woorden = " + woorden);
        woorden.sortReversed();
        System.out.println("woorden = " + woorden);
    }
}
