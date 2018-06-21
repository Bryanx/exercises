package threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class StringListCallable implements Callable<String> {

    private List<String> stringList;

    public StringListCallable(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public String call() throws Exception {
            return stringList.stream()
                    .map(s -> s.substring(0, 2).toUpperCase())
                    .collect(Collectors.joining("-"));
    }

    //Opgave 4.1
}
