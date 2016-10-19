package dozen;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 14:20
 */
public class Doos {
    //EIGENSCHAPPEN
    private String soort;
    private double lengte;
    private double breedte;
    private double hoogte;

    //CONSTRUCTORS
    public Doos(String soort, double lengte, double breedte, double hoogte) {
        //waardes worden opgeslagen in de eigenschapen
        this.soort = soort;
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public Doos(String soort, double lengte) {
        //Breedte en hoogte krijgen nu de waarde van hoogte
        this(soort, lengte, lengte, lengte);
    }

    //METHODES
    public double oppervlakte() {
        return lengte * breedte * 2 + lengte * hoogte * 2 + breedte * hoogte * 2;
    }

    public double volume() {
        return lengte * breedte * hoogte;
    }

    public double tapeLengte() {
        double grootste = Math.max(Math.max(breedte, lengte), hoogte);
        return 2 * (breedte + lengte + hoogte - grootste);
    }

    public String toString() {
        StringBuilder bodyBuilder = new StringBuilder();
        bodyBuilder.append("Soort: " + this.soort + "\n");
        bodyBuilder.append("Lengte: " + this.lengte + "cm\n");
        bodyBuilder.append("Breedte: " + this.breedte + "cm\n");
        bodyBuilder.append("Hoogte: " + this.hoogte + "cm\n");
        bodyBuilder.append("Oppervlakte: " + oppervlakte() + "cm²\n");
        bodyBuilder.append("Volume: " + volume() + "cm³\n");
        bodyBuilder.append("Minimale tapelengte: " + tapeLengte() + "cm\n");
        return bodyBuilder.toString();
    }


}
