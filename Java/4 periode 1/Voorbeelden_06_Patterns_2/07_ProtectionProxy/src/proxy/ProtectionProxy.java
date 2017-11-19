package proxy;

import java.util.Scanner;

public class ProtectionProxy implements Klant{
    private String wachtwoord;
    KlantImpl klant;

    public ProtectionProxy(String wachtwoord) {
        this.wachtwoord = wachtwoord;
        klant = new KlantImpl();
        System.out.println("ProtectionProxy: creatie proxy");
    }

    public String getRekeningNummer() {
        System.out.print("Wachtwoord: ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        if (wachtwoord.equals(temp)) {
            return klant.getRekeningNummer();
        } else {
            System.out.println("ProtectionProxy: ongeldig wachtwoord");
        }
        return "";
    }
}
