package be.kdg.events.model;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-02-17 09:33
 */
public class EventModel {
    public boolean isCapital(String text) {
        if (text.charAt(0) >= 'A' && text.charAt(0) <= 'Z') {
            return false;
        }
        return true;
    }
}
