package factorydemo;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/10/17 20:40
 */
public class FiguurFactory {

    private FiguurFactory() {}

    public static Figuur getVierkant(double zijde) {
        return Vierkant.newVierkant(zijde);
    }

    public static Figuur getRechthoek(double zijde) {
        return Rechthoek.newRechthoek(zijde,zijde);
    }

    public static Figuur getRechthoek(double breedte, double hoogte) {
        return Rechthoek.newRechthoek(breedte,hoogte);
    }

    public static Figuur getFiguur(FiguurType type, double zijde) {
        if (type == FiguurType.VIERKANT) return Vierkant.newVierkant(zijde);
        if (type == FiguurType.RECHTHOEK) return Rechthoek.newRechthoek(zijde,zijde);
        throw new IllegalArgumentException();
    }

    public static Figuur getFiguur(FiguurType type, double dimEen, double dimTwee) {
        if (type == FiguurType.RUIT) return Ruit.newRuit(dimEen,dimTwee);
        if (type == FiguurType.RECHTHOEK) return Rechthoek.newRechthoek(dimEen,dimTwee);
        throw new IllegalArgumentException();
    }
}
