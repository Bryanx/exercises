package ruimtefiguren;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 12:09
 */
public class RuimteFiguren {
    RuimteFiguur[] figuren;

    public RuimteFiguren() {
        this.figuren = new RuimteFiguur[5];
        vulTabel();
    }

    private void vulTabel() {
        figuren[0] = new Bol();
        figuren[1] = new Kubus(2.0);
        figuren[2] = new Cilinder("groen", 2.0, 5.0);
        figuren[3] = new Kubus("geel", 3.0);
        figuren[4] = new Bol("rood", 2.0);
    }

    public String toonFiguren() {
        String string = "";
        for (RuimteFiguur figuur: figuren) {
            string += "kleur: " +figuur.getKleur() + figuur.oppervlakte() + figuur.inhoud();
        }
        return string;
    }
}
