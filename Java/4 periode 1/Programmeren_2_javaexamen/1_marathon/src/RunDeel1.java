import marathon.MarathonLoper;
import parsing.FileIO;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Examen Programmeren 2 - Java
 * Januari 2017
 */
public class RunDeel1 {
    public static void main(String[] args) {
        List<MarathonLoper> myList = FileIO.jdomReadXml("1_marathon/files/marathon.xml");
        System.out.println("Na JDOM:");
        // Opgave 1.1
        myList.forEach(System.out::println);

        System.out.println("\nTOP-3:");
        // Opgave 1.2
        String result = myList.stream()
                .sorted(Comparator.comparing(MarathonLoper::getTimeString))
                .limit(3)
                .map(marathonLoper -> marathonLoper.getNaam() + "(" + marathonLoper.getTimeString() + ")")
                .collect(Collectors.joining(" < "));
        System.out.println(result);

        System.out.println("\nKenia:");
        //Opgave 1.3
        Map<Boolean, List<MarathonLoper>> myMap = myList
                .stream()
                .sorted(Comparator.comparing(MarathonLoper::getNaam))
                .collect(Collectors.partitioningBy(m -> m.getHerkomst().equalsIgnoreCase("kenia")));

        myMap.get(true).forEach(System.out::println);

        //Opgave 1.4
        FileIO.writeJson(myMap.get(true), "1_marathon/files/kenia.json");
    }
}
