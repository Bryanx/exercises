package proxy;

public class ProtectionDemo {
    public static void main(String[] args) {
        Klant klant = new ProtectionProxy("bla");
        System.out.println("Main ontvangt: " + klant.getRekeningNummer());
    }
}

/*
KlantImpl: creatie klant
ProtectionProxy: creatie proxy
Wachtwoord: bla
KlantImpl: rekeningNummer = BE01-2345-6789-0123
Main ontvangt: BE01-2345-6789-0123

KlantImpl: creatie klant
ProtectionProxy: creatie proxy
Wachtwoord: boe
ProtectionProxy: ongeldig wachtwoord
Main ontvangt:
*/
