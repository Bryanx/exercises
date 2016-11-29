package film;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 21:59
 */
public enum Geluid {
    PCM, DOLBY, DOLBY_HD, DTS, DTS_HD;

    @Override
    public String toString() {
        if (this == DOLBY) {
            return "Dolby";
        } else if (this == DOLBY_HD) {
            return "Dobly HD";
        }
        return name().replace('_',' ');
    }
}
