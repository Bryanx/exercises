package state.demo;

public class Normaal implements State {
    private final BankRekening rekening;
    private double saldo;

    public Normaal(BankRekening rekening) {
        saldo = rekening.getSaldo();
        this.rekening = rekening;
        initialiseer();
    }

    void initialiseer() {
        rekening.setRente(0.0);
        rekening.setMinLimiet(0.0);
        rekening.setMaxLimiet(1000.0);
    }

    public void stort(double bedrag) {
        saldo += bedrag;
        rekening.setSaldo(saldo);
        testStatusWijziging();
    }

    public void neemOp(double bedrag) {
        saldo -= bedrag;
        rekening.setSaldo(saldo);
        testStatusWijziging();
    }

    private void testStatusWijziging() {
        if (saldo < rekening.getMinLimiet()) {
            rekening.setState(new Negatief(rekening));
        } else if (saldo > rekening.getMaxLimiet()) {
            rekening.setState(new MetRente(rekening));
        }
    }

    public String toString() {
        return "Normaal";
    }
}