package synchronization;

public class Bankrekening {
    private String rekeningNummer;
    private int saldo;

    public Bankrekening(String reknr, int bedrag) {
        rekeningNummer = reknr;
        saldo = bedrag;
    }

    public void geldOpname(int bedrag) throws InterruptedException {
        synchronized (this) {
            System.out.println("Geldopname te " + Thread.currentThread().getName()
                    + " van rekening " + rekeningNummer);
            System.out.println("Bedrag: " + bedrag);
            if (bedrag <= saldo) { // Controle om niet met een negatief saldo te eindigen
                Thread.sleep(100); // tijd nodig voor de transactie
                saldo -= bedrag;
                System.out.println("Nieuw saldo: " + saldo);
            } else {
                System.out.println("Het saldo is te klein!");
            }
        }
        System.out.println();
    }
}

