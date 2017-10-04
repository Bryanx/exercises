package be.kdg.deelbaar;

/*
    TODO: De klasse Reeks implementeert de interface Deelbaar.
    Als je de reeks deelt dan geef je de eerste helft van de reeks terug
 */
public class Reeks implements Deelbaar {
    private int[] array;

    public Reeks(int[] array) {
        this.array = array;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]);
            if (i < array.length - 1) str.append(", ");
        }
        return str + "]";
    }

    @Override
    public Deelbaar getHelft() {
        int[] temp = new int[array.length/2];
        for (int i = 0; i < array.length/2; i++) {
            temp[i] = array[i];
        }
        return new Reeks(temp);
    }
}
