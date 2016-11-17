package auto;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 18:05
 */
public class Auto {
    private String merkNaam;
    private String nummerPlaat;
    private Motor motor = new Motor();

    public Auto(String merkNaam, String nummerPlaat) {
        this.merkNaam = merkNaam;
        this.nummerPlaat = nummerPlaat;
    }

    public Auto(String merkNaam) {
        this(merkNaam, "");
    }

    public Auto(Auto auto){
        this.merkNaam = auto.merkNaam;
        this.nummerPlaat = auto.nummerPlaat;
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

    public boolean equals(Auto auto){
        return (this.nummerPlaat.equals(auto.nummerPlaat));
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void toonToerental() {
        System.out.println(this.motor.getToerental());
    }

    @Override
    public String toString(){
        return this.merkNaam + " met kenteken: " + this.nummerPlaat;
    }
}
