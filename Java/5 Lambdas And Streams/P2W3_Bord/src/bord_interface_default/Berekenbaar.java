package bord_interface_default;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:26
 */
public interface Berekenbaar {
    public abstract double oppervlakte();

    default double omtrekVierkantBord(double zijde) {
        return zijde*4;
    }

    default double omtrekRondBord(double diameter) {
        return diameter*Math.PI;
    }
}