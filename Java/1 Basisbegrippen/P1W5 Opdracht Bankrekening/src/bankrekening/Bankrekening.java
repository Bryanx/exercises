package bankrekening;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/10/16 15:56
 */
public class Bankrekening {
    private String houder;
    private String iban;
    private double saldo;

    public Bankrekening(String houder, String iban) {
        this.houder = houder;
        this.iban = iban;
        this.saldo = 0;
    }

    public Bankrekening(String houder, String iban, double saldo) {
        this.houder = houder;
        this.iban = iban;
        this.saldo = saldo;
    }


    public String getHouder() {
        return houder;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void storting(double storting) {
        this.saldo += storting;
    }

    public boolean opname(double bedrag) {
        if (this.saldo - bedrag < 0) {
            return false;
        } else {
            this.saldo -= bedrag;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("De rekening %s op naam van %s" +
                "heeft een saldo van €%.2f", this.iban, this.houder, this.saldo);
    }

}
