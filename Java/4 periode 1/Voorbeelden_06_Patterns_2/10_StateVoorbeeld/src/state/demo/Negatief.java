package state.demo;

public class Negatief implements State {
    private final BankRekening rekening;
    private double saldo;

    public Negatief(BankRekening rekening) {
        saldo = rekening.getSaldo();
        this.rekening = rekening;
        initialiseer();
    }

    void initialiseer() {
        rekening.setRente(0.0);
        rekening.setMinLimiet(-500.0);
        rekening.setMaxLimiet(1000.0);
    }

    public void stort(double bedrag) {
        saldo += bedrag;
        rekening.setSaldo(saldo);
        testStatusWijziging();
    }

    public void neemOp(double bedrag) {
        System.out.println("Geen opname mogelijk!");
    }

    public void testStatusWijziging(){
        if (saldo > 0.0 &&
                saldo < rekening.getMaxLimiet()) {
            rekening.setState(new
                    Normaal(rekening));
        } else if (saldo >
                rekening.getMaxLimiet()) {
            rekening.setState(new
                    MetRente(rekening));
        }
    }


    public String toString() {
        return "Negatief";
    }
}