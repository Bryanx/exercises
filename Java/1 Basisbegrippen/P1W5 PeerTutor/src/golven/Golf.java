package golven;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 16:39
 */
public class Golf {
    private double amplitude;
    private double frequentie;

    //DEFAULT CONSTRUCTOR
    public Golf() {
        this.amplitude = 1.0;
        this.frequentie = 1.0;
    }

    //METHODES
    public void setAmplitude(double amplitude) {
        if (amplitude <= 0) {
            System.out.println("Geef een waarde boven de 0.");
        } else {
            this.amplitude = amplitude;
        }
    }

    public void setFrequentie(double frequentie) {
        if (frequentie <= 0) {
            System.out.println("Geef een waarde boven de 0.");
        } else {
            this.frequentie = frequentie;
        }
    }

    public double getYwaarde(double x) {
        return this.amplitude * Math.sin(frequentie * x);
    }

    @Override
    public String toString() {
        return String.format("y = %.1f sin (%.1f x)",
                this.amplitude, this.frequentie);
    }
}
