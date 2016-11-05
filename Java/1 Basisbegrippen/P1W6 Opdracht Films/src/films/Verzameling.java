package films;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/11/2016 21:00
 */
public class Verzameling {
    private final int MAX_AANTAL = 9;
    private Film[][] films;
    private int index;
    private boolean isVol;

    public Verzameling() {
        this.films = new Film[MAX_AANTAL][MAX_AANTAL];
    }

    public int getIndex() {
        return index;
    }

    public Film[][] getFilms() {
        return films;
    }

    public boolean isVol() {
        return isVol;
    }

    public void voegFilmToe(Film film) {
        this.films[index][index] = film;
        if (index >= MAX_AANTAL) {
            isVol = true;
        } else {
            index++;
        }
    }
}
