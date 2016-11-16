package auto;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 18:05
 */
public class Auto {
    private String merkNaam;
    private String nummerPlaat;
    private Motor motor;

    public Auto(String merkNaam, String nummerPlaat) {
        this.merkNaam = merkNaam;
        this.nummerPlaat = nummerPlaat;
    }

    public Auto(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public void geefGas() {
        this.motor.verhoogToerental(200);
    }
    public void geefGas(int toename) {
        this.motor.verhoogToerental(toename);
    }

    public void rem() {
        this.motor.setToerental(0);
    }
}
