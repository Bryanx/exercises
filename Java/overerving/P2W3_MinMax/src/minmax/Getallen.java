package minmax;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 17:06
 */
public class Getallen implements MinMax {
    private int[] getallen = new int[100];
    private int aantal;

    public void add(int waarde) {
        this.getallen[aantal] = waarde;
        aantal++;
    }

    @Override
    public String minimum() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < aantal; i++) {
            if (getallen[i] < min) {
                min = getallen[i];
            }
        }
        return Integer.toString(min);
    }

    @Override
    public String maximum() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < aantal; i++) {
            if (getallen[i] > max) {
                max = getallen[i];
            }
        }
        return Integer.toString(max);
    }

    public void toon(){
        for (int i = 0; i < aantal; i++) {
            System.out.print(getallen[i] + " ");
        }
        System.out.println();
    }
}
