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

    public void vulTabel() {
        for (int i = 0; i < machten.length; i++) {
            this.machten[i] = (int) Math.pow(2, i);
        }
    }

    @Override
    public String toString() {
        String print = "Machten van 2\n";
        for (int i = 0; i < machten.length; i++) {
            print += ("2 tot de macht " + i + " = " + machten[i] + "\n");
        }
        return print;
    }

}
