package be.kdg.demo.singleton;

/**
 * Hier mag je niets wijzigen!
 */
public class Film implements Comparable<Film> {
    private String titel;
    private int jaar;

    public Film(String titel, int jaar) {
        this.titel = titel;
        this.jaar = jaar;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Film film = (Film) object;
        return jaar == film.jaar && titel.equals(film.titel);
    }

    @Override
    public int hashCode() {
        int result = titel.hashCode();
        return 31 * result + jaar;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titel='" + titel + '\'' +
                ", jaar=" + jaar +
                '}';
    }

    public int compareTo(Film andereFilm) {
        int result = titel.compareTo(andereFilm.titel);
        if (result != 0) {
            return result;
        } else {
            return jaar - andereFilm.jaar;
        }
    }
}