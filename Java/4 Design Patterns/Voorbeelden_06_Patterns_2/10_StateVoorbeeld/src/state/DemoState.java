package state;

import state.demo.BankRekening;

public class DemoState {
    public static void main(String[] args) {
        BankRekening rekening = new BankRekening("Jos The Boss");
        System.out.printf("Bankrekening van %s%n", rekening.getHouder());
        rekening.stort(500);
        System.out.println(rekening);
        rekening.stort(850);
        System.out.println(rekening);
        rekening.betaalRente();
        System.out.println(rekening);
        rekening.neemOp(1100);
        System.out.println(rekening);
        rekening.neemOp(500);
        System.out.println(rekening);
        rekening.neemOp(500);
        System.out.println(rekening);
    }
}

/*
Bankrekening van Jos The Boss
Saldo: 500.0  Status: Normaal
Saldo: 1350.0  Status: Met Rente
Saldo: 1356.75  Status: Met Rente
Saldo: 256.75  Status: Normaal
Saldo: -243.25  Status: Negatief
Geen opname mogelijk!
*/