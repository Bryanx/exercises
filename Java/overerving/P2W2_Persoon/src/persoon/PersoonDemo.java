package persoon;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:46
 */
public class PersoonDemo {
    public static void main(String[] args) {
        Persoon[] personen = {
                new Persoon(1000, "Jos"),
                new Persoon(1001, "Jos"),
                new Persoon(1000, "Jos"),
                new Student(1000, "Jos", 201301),
                new Student(1002, "George", 201302),
                new Student(1003, "William", 201303),
                new Student(1004, "Kate", 201304)
        };
        // Toon alle personen (met for each)
        for (Persoon persoon : personen) {
            System.out.println(persoon);
        }
        // Tel het aantal Persoon objecten met id gelijk aan 1000.
        Persoon zoekId = new Persoon(1000, "Boris");
        int aantal = 0;
        // hier aanvullen
        for (int i = 0; i < personen.length; i++) {
            if (!(personen[i] instanceof Student) && personen[i].equals(zoekId)) {
                aantal++;
            }
        }
        System.out.println("Aantal Persoon objecten met id 1000 = " +
                aantal);
        // Tel het aantal Student objecten
        int teller = 0;
        for (Persoon persoon : personen) {
            if (persoon instanceof Student) {
                teller++;
            }
        }
        System.out.println("Aantal Student objecten = " + teller);
    }
}