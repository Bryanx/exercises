package be.kdg.no;

import java.util.Arrays;

public class NoParameter {
        public static void main(String[] args) {
            for (int i = 3; i < 8; i++) {
                int size = (int) Math.pow(10, i);
                System.out.printf("Sorting array of length %,d.%n", size);
                Timer.timerOperation(() -> sortArray(size)); // () indien geen parameters
            }
        }

        public static double[] randomGetallen(int lengte) {
            double[] getallen = new double[lengte];
            for (int i = 0; i < lengte; i++) {
                getallen[i] = Math.random();
            }
            return (getallen);
        }

        public static void sortArray(int length) {
            double[] getallen = randomGetallen(length);
            Arrays.sort(getallen);
        }
}

/*
/*
Sorting array of length 1.000.
Verlopen tijd: 1,16 ms
Sorting array of length 10.000.
Verlopen tijd: 3,63 ms
Sorting array of length 100.000.
Verlopen tijd: 16,51 ms
Sorting array of length 1.000.000.
Verlopen tijd: 137,89 ms
Sorting array of length 10.000.000.
Verlopen tijd: 1167,37 ms
*/
