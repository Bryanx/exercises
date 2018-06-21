package be.kdg.deelbaar;

/*
    TODO: De klasse Vat implementeert de interface Deelbaar
    als je een vat deelt, haal je er de helft van de inhoud uit

 */
public class Vat implements Deelbaar {
    int capaciteit;
    int inhoud;

    public Vat(int capaciteit, int inhoud) {
        this.capaciteit = capaciteit;
        this.inhoud = inhoud;
    }

    public String toString() {
        return "capaciteit: " + capaciteit + "l"
                + " inhoud: " + inhoud + "l";
    }

    @Override
    public Deelbaar getHelft() {
        Vat vat = new Vat(capaciteit/2, inhoud/2);
        return vat;
    }
}
