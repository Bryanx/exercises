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
            this.machten[i] = machten[(int)Math.pow(i, 2)];
            System.out.println(machten[i]);
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < machten.length; i++) {
            System.out.printf("2 tot de macht %d", i);
        }
        return "";
    }

}
