package patterns;

public class AfbeeldingProxy implements Afbeelding {
    private String filename;
    private Afbeelding afbeelding;

    public AfbeeldingProxy(String filename) {
        this.filename = filename;
    }

    public void toonAfbeelding() {
        if (afbeelding == null) {
            afbeelding = new AfbeeldingImpl(filename); // alleen ophalen indien nodig
        }
        afbeelding.toonAfbeelding();
    }
}

