package plugins;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 11:27
 */
public interface Plugin {
    String getCommand();
    double bereken(double x, double y);
    default String getAuteur(){
        return "KdG";
    }
}
