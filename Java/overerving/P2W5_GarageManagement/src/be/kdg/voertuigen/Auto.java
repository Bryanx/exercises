package be.kdg.voertuigen;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 21:21
 */
public class Auto extends Voertuig implements GemotoriseerdVoertuig {
    private LocalDate inschrijvingsDatum;
    private double CO2Uitstoot;

    public Auto(String merk, String model, LocalDate inschrijvingsDatum, double CO2Uitstoot) {
        super(merk, model);
        this.inschrijvingsDatum = inschrijvingsDatum;
        this.CO2Uitstoot = CO2Uitstoot;
    }


    @Override
    public double getCO2Uitstoot() {
        return CO2Uitstoot;
    }

    @Override
    public String toString() {
        return "Auto: " + super.toString() + " - date: " + this.inschrijvingsDatum;
    }
}
