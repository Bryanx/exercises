package lichaam;

/**
 * De interface Lichaam bevat 3 gemeenschappelijke methoden, die gelden voor alle
 * meetkundige figuren, zoals kubus, balk, cylinder, ...
 * HIER MAG JE NIETS WIJZIGEN!
 */

public interface Lichaam {

    /**
     * De methode volume berekent het volume van de meetkundige figuur in m3.
     *
     * @return het volume in m3
     */
    public double volume();

    /**
     * De methode grondvlak berekent de oppervlakte van zijkant die in contact staat met de grond.
     * @return de oppervlakte van het grondvlak in m2
     */
    public double grondvlak();

    /**
     * De methode verticaleOmtrek berekent de opstaande omtrek van de ruimtelijke figuur in m.
     * @return de omtrek in m
     */
    public double verticaleOmtrek();
}