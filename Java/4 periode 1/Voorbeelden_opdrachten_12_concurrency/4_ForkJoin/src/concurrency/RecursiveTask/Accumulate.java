package concurrency.RecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

public class Accumulate extends RecursiveTask<Long> {
    double[] data;
    int start;
    int end;
    int threshold;

    public Accumulate(double[] data, int start, int end, int threshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    protected Long compute() {
        if ((end - start) < threshold) { // Indien te doorzoeken gebied kleiner dan drempel
	        return sequentialCompute();
        } else {  // Uitsplisen in 2 nieuwe taken
            int middle = (start + end) / 2;
            Accumulate task1 = new Accumulate(data, start, middle, threshold);
            Accumulate task2 = new Accumulate(data, middle, end, threshold);
            invokeAll(task1,task2);
	        try {
		        return task1.get()+task2.get();
	        } catch (InterruptedException | ExecutionException e) {
		        e.printStackTrace();
		        return 0L;
	        }
        }
    }


	// bereken in één blok van start tot end
	protected Long sequentialCompute(){
		long sum = 0;
		for (int i = start; i < end; i++) {
			sum += data[i];
		}
		return sum;
	}

}
