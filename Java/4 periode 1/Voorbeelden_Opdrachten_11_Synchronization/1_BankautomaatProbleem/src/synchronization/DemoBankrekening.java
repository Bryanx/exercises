package synchronization;

public class DemoBankrekening {
    private static final int BEGINSALDO = 1325;

    public static void main(String[] args) {
        Bankrekening rekening = new Bankrekening("BE26-3699-6941-1532", BEGINSALDO);

        Automaat antwerpen = new Automaat("Antwerpen", rekening);
        Automaat gent = new Automaat("Gent", rekening);

        System.out.println("Beginsaldo: " + BEGINSALDO + "\n");
        antwerpen.start();
        gent.start();
    }
}


