package concurrency;

import java.util.concurrent.Callable;

public class WordLengthCallable implements Callable<Integer> {
    private String word;

    public WordLengthCallable(String word) {
        this.word = word;
    }

    public Integer call() throws Exception {
        return word.length();
    }
}
