package plugins;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 11:33
 */
public class Wortel implements Plugin{
    @Override
    public String getCommand() {
        return "√";
    }
    @Override
    public double bereken(double x, double y) {
        return Math.sqrt(x +y);
    }
}
