package be.kdg.voertuigen;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/2016 15:11
 */
public class Auto extends Voertuig implements GemotoriseerdeVoertuigen {
    private LocalDate inschrijvingsDatum;
    private double co2;

    public Auto(String merk, String model, LocalDate inschrijvingsDatum, double co2) {
        super(merk, model);
        this.inschrijvingsDatum = inschrijvingsDatum;
        this.co2 = co2;
    }

    @Override
    public boolean isBestuurbaarDoorKinderen() {
        return false;
    }

    @Override
    public double getCO2() {
        return this.co2;
    }

    @Override
    public String toString() {
        return "Auto: " + super.toString() + " - date: " +
                this.inschrijvingsDatum;
    }
}
