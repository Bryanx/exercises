package be.kdg.programmeertalen.model;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:07
 */
public enum Stijl {
    OBJECTORIENTED("Object-Oriented"),
    FUNCTIONEEL("Functioneel"),
    IMPERATIEF("Imperatief"),
    EVENTDRIVEN("Event-Driven"),
    GEEN("Geen");

    private String string;

    Stijl(String name){
        string = name;
    }

    @Override
    public String toString() {
        return string;
    }
}

