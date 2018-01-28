package concurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class CallableDemo {
    private static final String[] words = {
            "een", "twee", "drie",
            "vier", "vijf", "zes",
            "zeven", "acht", "negen"
    };

    public static void main(String[] args) throws Exception {

        //3 threads in een pool gestoken.
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<Integer>> set = new HashSet<>(); //voor resultaten.
        for (String word : words) {
            Callable<Integer> callable = new WordLengthCallable(word); //elk woord wordt de lengte opgevraagd
            Future<Integer> future = pool.submit(callable); //wordt uitgevoerd door een thread.
            set.add(future); // resultaat gaat in de set
        }
        int sum = 0;

        for (Future<Integer> future : set) {
            sum += future.get(); //uit iedere future in de set wordt het resultaat gehaald en geconcat.
        }

        System.out.printf("The sum of lengths is %s%n", sum);
        System.out.printf("The numbers of words is %d%n", set.size());

        for (String word : words) {
            Callable<String> reverse = () -> reverseString(word);
            Future<String> future = pool.submit(reverse);
            System.out.print(future.get()+ " ");
        }
        pool.shutdown(); //threads worden afgesloten.
    }

    private static String reverseString(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i > -1; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}

/*
The sum of lengths is 36
*/

