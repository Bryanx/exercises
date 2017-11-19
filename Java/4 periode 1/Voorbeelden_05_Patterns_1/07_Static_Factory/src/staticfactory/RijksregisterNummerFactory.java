package staticfactory;

public class RijksregisterNummerFactory {
    private RijksregisterNummerFactory() {
        // empty
    }

    static public RijksregisterNummer newNummer(String nummer) {
        // TODO: nummer valideren
        return new RijksregisterNummerImpl(nummer);
    }
}

/*
Hoe kan een rijksregisternummer gecontroleerd worden?

Om de juistheid van een rijksregisternummer te controleren, moet de check digit van dit nummer berekend worden.



De check digit bestaat uit 2 cijfers. Dit getal is het complement van 97 van modulo 97 van het getal gevormd door:

hetzij de eerste 9 cijfers van het rijksregisternummer indien de persoon voor 1/1/2000 geboren is (zie voorbeeld 1),
hetzij het cijfer 2 gevolgd door de eerste 9 cijfers van het rijksregisternummer indien de persoon na
31/12/1999 geboren is (zie voorbeeld 2). 
Modulo 97 van een getal is de rest van de deling van het getal door 97.

Voorbeeld 1:
RN = 72020290081: 97 - (modulo 97 van 720202900) = 97 - 16 = 81

Voorbeeld 2:
RN = 00012556777: 97 - (modulo 97 van 2000125567) = 97 - 20 = 77
*/
