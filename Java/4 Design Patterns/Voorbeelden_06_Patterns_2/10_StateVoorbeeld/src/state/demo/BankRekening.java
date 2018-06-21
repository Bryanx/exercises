package state.demo;

public class BankRekening {
    private final String houder;
    private double saldo;
    private double rente;
    private double minLimiet;
    private double maxLimiet;

    private State status;

    public BankRekening(String houder) {
        this.houder = houder;
        status = new Normaal(this);
    }

    public String getHouder() {
        return houder;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRente() {
        return rente;
    }

    public double getMinLimiet() {
        return minLimiet;
    }

    public double getMaxLimiet() {
        return maxLimiet;
    }

    public void setState(State status) {
        this.status = status;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setRente(double rente) {
        this.rente = rente;
    }

    public void setMinLimiet(double minLimiet) {
        this.minLimiet = minLimiet;
    }

    public void setMaxLimiet(double maxLimiet) {
        this.maxLimiet = maxLimiet;
    }

    public void stort(double bedrag) {
        status.stort(bedrag);
    }

    public void neemOp(double bedrag) {
        status.neemOp(bedrag);
    }

    public void betaalRente() {
        status.betaalRente();
    }

    public String toString() {
        return "Saldo: " + saldo + "  Status: " + status;
    }
}