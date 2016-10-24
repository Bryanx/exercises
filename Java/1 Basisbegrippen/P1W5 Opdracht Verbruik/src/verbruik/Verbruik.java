package verbruik;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/10/16 20:57
 */
public class Verbruik {
    private int geredenKilometers;
    private double getankteLiters;
    private int aantalTankbeurten;

    public void verhoogGeredenKilometers(int getal) {
        this.geredenKilometers += getal;
    }

    public void verhoogGetankteLiters(double waarde) {
        this.getankteLiters += getankteLiters;
    }

    public void verhoogAantalTankbeurten() {
        this.aantalTankbeurten += 1;
    }

    public double gemiddeldVerbruik() {
        return this.aantalTankbeurten * this.getankteLiters / this.geredenKilometers * 100;
    }

    @Override
    public String toString() {
        return String.format("Aantal tankbeurten: %d \nGetankte liters: %.2f \nGereden kilometers: %d",
                this.aantalTankbeurten,
                this.getankteLiters,
                this.geredenKilometers);
    }

}
