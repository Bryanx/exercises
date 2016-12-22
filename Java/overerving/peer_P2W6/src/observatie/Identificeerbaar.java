package observatie;

import java.time.LocalDate;

/**
 * PEER TUTORING
 * P2W6
 */

// gegeven, mag je wijzigen
public interface Identificeerbaar {
    String getRingInfo();
    default LocalDate getRingDatum(){
        return LocalDate.now();
    }
}
