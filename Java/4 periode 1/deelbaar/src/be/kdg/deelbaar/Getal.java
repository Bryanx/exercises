package be.kdg.deelbaar;

/*
    TODO: De klasse Getal implementeert de interface Deelbaar
 */
public abstract class Getal implements Deelbaar {

    public abstract void increment(int step);

    public void decrement(int step) {
        increment(-step);
    }
}


