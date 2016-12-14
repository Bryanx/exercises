package Domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Peer Tutoring
 * P2W5 - Collections
 */
public class Speler implements Comparable<Speler> {
    private String naam;
    //OPGAVE 3
    private List<DominoSteen> stenen;
    //private ???? stenen;


    public Speler(String naam) {
        this.naam = naam;
        //OPGAVE 3
        stenen = new ArrayList<>();
        //stenen = new ????
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalStenen(){
        //OPGAVE 4
        return stenen.size();
    }

    public  int getAantalPunten(){
        int totaalAantalPunten = 0;
        //OPGAVE 5
        for (DominoSteen dominoSteen : stenen) {
            totaalAantalPunten += dominoSteen.getAantalPunten();
        }

        return totaalAantalPunten;
    }

    public void neemNieuweSteen(DominoSteen getrokkenSteen){
        //OPGAVE 6
        stenen.add(getrokkenSteen);
    }

    public  DominoSteen zoekSteen(){
        DominoSteen teZoekenSteen = null;
        //OPGAVE 7.1
        Collections.max(stenen);
        stenen.remove(teZoekenSteen);
        return teZoekenSteen;
    }

    public DominoSteen zoekSteen(int getal){
        DominoSteen teZoekenSteen = null;
        //OPGAVE 7.2
        for (DominoSteen dominoSteen : stenen) {
            if (dominoSteen.getGetal1() == getal) teZoekenSteen = dominoSteen;
            if (dominoSteen.getGetal2() == getal) teZoekenSteen = dominoSteen;
        }
        stenen.remove(teZoekenSteen);
        return teZoekenSteen;
    }


    @Override
    public int compareTo(Speler o) {
        return getAantalPunten() - o.getAantalPunten();
    }
}
