package bibliotheek;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 13:49
 */
public class Boek {

    private String titel;
    private String auteur;
    private int paginas;
    private boolean uitgeleend = false;

    public Boek(String auteur, String titel, int paginas) {
        this.paginas = Math.abs(paginas);


    }

    Boek() {
        get("onbekend", "onbekend", paginas);
    }

    public void get(String onbekend, String onbekend1, int paginas) {
    }


    public void set(uitgeleend) {
        get(True);
    }

    public void printDetails() {
        System.out.printf("Het boek %s (%d pagina's");
    }
}
