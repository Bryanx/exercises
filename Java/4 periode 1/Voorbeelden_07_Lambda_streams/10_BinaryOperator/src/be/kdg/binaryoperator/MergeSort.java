package be.kdg.binaryoperator;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;

// Voorlopig, tot een beter (eenvoudiger) voorbeeld gevonden wordt
// http://stackoverflow.com/questions/24855746/understanding-when-and-how-to-use-java-8-lambdas
public class MergeSort {
    public static Function<int[], int[]> mergeSort;

    public static void main(String[] args) {
        int values[] = {3, 12, 6, 7, 2, 1, 23, 4, 5, 7, 8, 4, 2, 5, 365};
        mergeSort = a -> {
            BinaryOperator<int[]> merge = (t, u) -> {
                int[] result = new int[t.length + u.length];
                for (int i = 0, j = 0, k = 0; i < result.length; i++) {
                    if (j == t.length) {
                        result[i] = u[k++];
                    } else if (k == u.length) {
                        result[i] = t[j++];
                    } else {
                        result[i] = t[j] < u[k] ? t[j++] : u[k++];
                    }
                }
                return result;
            };
            if (a.length <= 1) {
                return a;
            }
            return merge.apply(mergeSort.apply(Arrays.copyOfRange(a, 0, a.length / 2)),
                    mergeSort.apply(Arrays.copyOfRange(a, a.length / 2, a.length)));
        };
        System.out.println(Arrays.toString(mergeSort.apply(values)));
    }
}
