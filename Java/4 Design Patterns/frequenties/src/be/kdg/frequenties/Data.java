package be.kdg.frequenties;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/09/17 22:33
 */
public class Data {
    public static final int MAX = 100;
    public static Random generator;
    private List<Integer> getallen;

    public Data() {
        this.getallen = new ArrayList<>();
        generator = new Random();
        for (int i = 0; i < MAX; i++) {
            getallen.add(generator.nextInt(10));
        }
    }

    public List<Integer> getGetallen() {
        return getallen;
    }
}
