import factorydemo.Figuur;
import factorydemo.FiguurFactory;
import factorydemo.FiguurType;

import java.util.Arrays;
import java.util.List;

/**
 * TODO Deze klasse demonstreert het gebruik van een factory.
 * Veronderstel dat om een of andere reden de benodigde source code
 * om dit programma uit te voeren verloren is gegaan. Gelukkig is er
 * nog wel de Javadoc documentatie (je vindt ze in de doc directory).
 * Roep in je browser index.html op en tracht aan de hand van de
 * documentatie het onderstaande demoprogramma terug aan de praat te krijgen.
 *
 * FiguurType is een enum:
 *
 * <pre>
 *      public enum FiguurType {
 *           VIERKANT, RECHTHOEK, RUIT
 *      }
 * </pre>
 *
 */
public final class Demo {
    /**
     * Main methode.
     *
     * @param args
     */
    public static void main(String[] args) {
        Figuur[] figuren = {
                FiguurFactory.getVierkant(4.0),
                FiguurFactory.getRechthoek(3.5),
                FiguurFactory.getRechthoek(3.0, 2.0),
                FiguurFactory.getFiguur(FiguurType.VIERKANT, 4.0),
                FiguurFactory.getFiguur(FiguurType.RECHTHOEK, 4.0),
                FiguurFactory.getFiguur(FiguurType.RECHTHOEK, 3.0, 2.0),
                FiguurFactory.getFiguur(FiguurType.RUIT, 3.0, 2.0),
        };

        List<Figuur> lijst = Arrays.asList(figuren);

        for (Figuur figuur : lijst) {
            if (figuur != null) {
                System.out.print(figuur);
                System.out.println("  Oppervlakte = " + figuur.oppervlakte());
            }
        }
    }
}

/*
Vierkant 4.0  Oppervlakte = 16.0
Rechthoek 3.5 3.5  Oppervlakte = 12.25
Rechthoek 3.0 2.0  Oppervlakte = 6.0
Vierkant 4.0  Oppervlakte = 16.0
Rechthoek 4.0 4.0  Oppervlakte = 16.0
Rechthoek 3.0 2.0  Oppervlakte = 6.0
Ruit 3.0 2.0  Oppervlakte = 3.0
*/
