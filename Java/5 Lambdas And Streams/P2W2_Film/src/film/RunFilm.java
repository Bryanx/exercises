package film;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 22:07
 */
public class RunFilm {
    public static void main(String[] args) {
        Verzameling verzameling = new Verzameling();
        Film[] films = verzameling.getVerzameling();
        for (int i = 0; i < verzameling.getAantal(); i++) {
            System.out.println(films[i]);
        }
    }
}