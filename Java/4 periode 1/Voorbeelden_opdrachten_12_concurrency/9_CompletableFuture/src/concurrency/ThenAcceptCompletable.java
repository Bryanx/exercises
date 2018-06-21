package concurrency;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThenAcceptCompletable {
    private static final String[] words = {
            "een", "twee", "drie",
            "vier", "vijf", "zes",
            "zeven", "acht", "negen"
    };

    public static void main(String[] args)  {
	    ExecutorService pool = Executors.newFixedThreadPool(3);
	    // zet words om naar woorden stream in hoofdletters
	    CompletableFuture.supplyAsync(() ->  Arrays.stream(words).map(word -> word.toUpperCase()),
		    pool)
		    .thenAccept(result -> System.out.println("Omzetten words in hoofdletters is gedaan: "
			    + result.collect(Collectors.joining(" "))));
		    System.out.println( "Thread main werkt verder tijdens  omzetten" );
	    System.out.println("Einde main thread."   );
	    pool.shutdown();
    }
}

/*
The sum of lengths is 36
*/

