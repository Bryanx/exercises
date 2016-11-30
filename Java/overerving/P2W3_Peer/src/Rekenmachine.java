/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 11:34
 */

import plugins.*;

import static java.lang.Integer.parseInt;

public class Rekenmachine {
    public static final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
    }

    public void installeer(Plugin teInstallerenPlugin) {
        if (aantalPlugins < MAX_AANTAL_PLUGINS) {
            ingeladenPlugins[aantalPlugins] = teInstallerenPlugin;
            aantalPlugins++;
        }
    }

    public double bereken(String operator, double x, double y) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (operator.equals(ingeladenPlugins[i].getCommand())) {
                return ingeladenPlugins[i].bereken(x, y);
            }
        }
        return Double.POSITIVE_INFINITY;

    }

    @Override
    public String toString() {
        String resultaat = "plugins: ";
        for (int i = 0; i < aantalPlugins; i++) {
            resultaat += ingeladenPlugins[i].getCommand() + " ";
        }
        return resultaat;
    }
}
