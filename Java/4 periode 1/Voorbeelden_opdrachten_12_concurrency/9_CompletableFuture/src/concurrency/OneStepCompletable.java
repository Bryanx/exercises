package concurrency;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneStepCompletable {
    private static final String[] words = {
            "een", "twee", "drie",
            "vier", "vijf", "zes",
            "zeven", "acht", "negen"
    };

    public static void main(String[] args) throws Exception {
    	// zet words om naar woorden stream in hoofdletters
	    CompletableFuture<Stream<String>> upperFuture = CompletableFuture.supplyAsync(
	    	() ->  Arrays.stream(words).map(word -> word.toUpperCase()));
	    System.out.printf( "Thread %s werkt verder tijdens  omzetten.\n",Thread.currentThread()
		    .getName() );
	    System.out.printf("Resultaat omzetten ontvangen in %s: %s\n" , Thread.currentThread()
		    .getName(),
		    upperFuture.get().collect(Collectors.joining(" ")));
	    System.out.printf("Einde thread %s.\n" , Thread.currentThread().getName());
    }
}



