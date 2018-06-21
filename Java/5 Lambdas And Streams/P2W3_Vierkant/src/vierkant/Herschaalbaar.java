package vierkant;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:07
 */
public interface Herschaalbaar {
    void herschaal(int percentage);

    default void vergroot() {
        this.herschaal(150);
    }
}