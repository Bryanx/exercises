package composite;

/** Examen Programmeren 2 - Java
 * Januari 2017
 * IN DEZE KLASSE MAG JE NIETS WIJZIGEN!
 */
public class Muur implements Schilderbaar{
    private double hoogte;
    private double breedte;

    public Muur(double hoogte, double breedte) {
        this.hoogte = hoogte;
        this.breedte = breedte;
    }

    public double benodigdeVerf() {
        return (hoogte * breedte) / 8;
    }
}
