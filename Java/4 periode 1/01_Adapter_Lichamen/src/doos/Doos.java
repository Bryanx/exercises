package doos;

/**
 * De interface Doos bevat 3 gemeenschappelijke methoden, die gelden voor alle
 * dozen, ongeacht hun vorm.
 * HIER MAG JE NIETS WIJZIGEN!
 */
public interface Doos {

    /**
     * De methode verpakkingsOppervlakte berekent de hoeveelheid karton die nodig is
     * voor de doos.
     * @return de oppervlakte in m2
     */
    public double verpakkingsOppervlakte();

    /**
     * De methode tapeLengte berekent de lengte die nodig is om de doos te omwikkelen met tape.
     * Het is gebruikelijk dat een doos 2 keer omwikkeld wordt met tape.
     * @return de benodigde tapelengte in m
     */
    public double tapeLengte();

    /**
     * De methode volume berekent het volume van de doos in m3.
     * @return het volume in m3
     */
    public double volume();

}