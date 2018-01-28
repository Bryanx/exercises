package concurrency.RecursiveAction;

import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    double[] data;
    int start;
    int end;
    int threshold;

    public Transform(double[] data, int start, int end, int threshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.threshold = threshold;

        double val = 234255.2342;
        val = val * 100;
        val = (double) ((int) val);
        val = val / 100;
    }

    protected void compute() {
        if ((end - start) < threshold) { // Indien te doorzoeken gebied kleiner dan drempel
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0)  // Evven of oneven?
                    data[i] = Math.sqrt(data[i]);  // Vierkantswortel
                else
                    data[i] = Math.cbrt(data[i]);  // Kubuswortel
            }
        } else {  // Uitsplisen in 2 nieuwe taken
            int middle = (start + end) / 2;
            invokeAll(new Transform(data, start, middle, threshold),
                    new Transform(data, middle, end, threshold));
        }
    }
}
