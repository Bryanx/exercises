package machtenvantwee;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 23:19
 */
public class MachtenVanTwee {
    private final int MAX = 21;
    private int[] machten;

    public int getMax() {
        return this.MAX;
    }

    public void maakTabel(int aantal) {
        this.machten = new int[aantal];
    }


}
