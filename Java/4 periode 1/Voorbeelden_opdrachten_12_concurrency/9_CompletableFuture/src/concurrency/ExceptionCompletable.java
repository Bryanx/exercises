package concurrency;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ExceptionCompletable {
    private static  String[] words = {
            "een", "twee", "drie",
            "vier", "vijf", "zes",
            "zeven", "acht", "negen"
    };

    public static void main(String[] args) throws Exception {
    	words=null;
	    ExecutorService pool = Executors.newFixedThreadPool(3);
	    // zet words om naar woorden stream in hoofdletters
	    CompletableFuture.supplyAsync(() ->
				Arrays.stream(words)
                        .map(word -> word.toUpperCase()), pool)
		    .thenApply(stream -> stream.map(word -> new StringBuffer(word).reverse()))
		    .handle((result, x) -> {
                if (x == null) return result.collect(Collectors.joining(" "));
                else return x.toString();
            })
		    .thenAccept(print -> System.out.println("Resultaat: "+print));
		    System.out.println( "Thread main werkt verder tijdens  omzetten" );
	    System.out.println("Einde main thread."   );
	    pool.shutdown();
    }
}

