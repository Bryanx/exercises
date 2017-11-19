package state.demo;

public class MetRente implements State {
    private final BankRekening rekening;
    private double saldo;

    public MetRente(BankRekening rekening) {
        saldo = rekening.getSaldo();
        this.rekening = rekening;
        initialiseer();
    }

    void initialiseer() {
        rekening.setRente(0.005);
        rekening.setMinLimiet(1000.0);
        rekening.setMaxLimiet(1e10);
    }

    public void stort(double bedrag) {
        saldo += bedrag;
        rekening.setSaldo(saldo);
    }

    public void neemOp(double bedrag) {
        saldo -= bedrag;
        rekening.setSaldo(saldo);
        testStatusWijziging();
    }

    public void betaalRente() {
        saldo += rekening.getRente() * saldo;
        rekening.setSaldo(saldo);
    }

    private void testStatusWijziging() {
        if (saldo < 0.0) {
            rekening.setState(new Negatief(rekening));
        } else if (saldo < rekening.getMinLimiet()) {
            rekening.setState(new Normaal(rekening));
        }
    }

    public String toString() {
        return "Met Rente";
    }
}