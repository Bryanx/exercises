package plugins;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 11:31
 */
public class Aftrekking implements Plugin{
    @Override
    public String getCommand() {
        return "-";
    }
    @Override
    public double bereken(double x, double y) {
        return x - y;
    }
}