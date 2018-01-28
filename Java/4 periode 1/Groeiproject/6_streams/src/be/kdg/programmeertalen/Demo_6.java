package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.Stijl;
import be.kdg.programmeertalen.util.Functies;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_6 {
    public static void main(String[] args) {

        ProgrammeerTalen talen = new ProgrammeerTalen();

        Data.getLijst().forEach(talen::voegToe);

        //Lambda's

        System.out.println("Gesorteerd op naam:");
        talen.gesorteerdOp(ProgrammeerTaal::getNaam).forEach(System.out::println);

        System.out.println("\n\nGesorteerd op aantal gebruikers:");
        talen.gesorteerdOp(ProgrammeerTaal::getAantalGebruikers).forEach(System.out::println);

        System.out.println("\n\nGesorteerd op oprichtingsdatum:");
        talen.gesorteerdOp(ProgrammeerTaal::getOpgerichtIn).forEach(System.out::println);

        //Filtered List
        System.out.println("\n\nFunctionele talen:");
        Functies.filteredList(Data.getLijst(), p -> p.getStijl().equals(Stijl.FUNCTIONEEL)).forEach(System.out::println);

        System.out.println("\n\nMeeste gebruikers:");
        Functies.filteredList(Data.getLijst(), p -> p.getAantalGebruikers() > 5000000).forEach(System.out::println);

        System.out.println("\n\nImperatieve talen:");
        Functies.filteredList(Data.getLijst(), p -> p.getStijl().equals(Stijl.IMPERATIEF)).forEach(System.out::println);

        //Averige List
        System.out.println("\n\nGemiddelde versie:");
        System.out.println(Functies.averageList(Data.getLijst(), ProgrammeerTaal::getLaatsteVersie));

        System.out.println("\n\nGemiddelde aantal gebruikers:");
        System.out.println(Functies.averageList(Data.getLijst(), p -> (double) p.getAantalGebruikers()));

        //Count if
        System.out.println("\n\nAantal talen dat OO is: ");
        System.out.println(Functies.countIf(Data.getLijst(), p -> p.getStijl().equals(Stijl.OBJECTORIENTED)));

        System.out.println("\n\nAantal talen met een 'a' in de naam: ");
        System.out.println(Functies.countIf(Data.getLijst(), p -> p.getNaam().contains("a")));



        //Streams

        System.out.println("\n\nAantal na 1990: ");
        System.out.println(Data.getLijst().stream()
                .filter(p -> p.getOpgerichtIn().isBefore(LocalDate.of(1990, 1, 1)))
                .count());

        System.out.println("\n\nGesorteerd op Stijl en dan op naam: ");
        Data.getLijst().stream()
                .sorted(Comparator.comparing(ProgrammeerTaal::getStijl)
                        .thenComparing(ProgrammeerTaal::getNaam))
                .forEach(System.out::println);

        System.out.println("\n\nAlle oprichters in CAPS reversed en geen duplicates: ");
        System.out.println(Data.getLijst().stream()
                .map(ProgrammeerTaal::getOprichter)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", ")).toUpperCase());

        System.out.println("\n\nEen willekeurige ProgrammeerTaal na 2000: ");
        Data.getLijst().stream()
                .filter(p -> p.getOpgerichtIn().isAfter(LocalDate.of(2000, 1, 1)))
                .map(ProgrammeerTaal::getNaam)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("\n\nProgrammeertaal met meeste gebruikers: ");
        Data.getLijst().stream()
                .max(Comparator.comparingInt(ProgrammeerTaal::getAantalGebruikers))
                .map(ProgrammeerTaal::getNaam)
                .ifPresent(System.out::println);

        System.out.println("\n\nGesorteerde talen op naam begint met R: ");
        System.out.println("[" + Data.getLijst().stream()
                .filter(p -> p.getNaam().charAt(0) == 'R')
                .map(ProgrammeerTaal::getNaam)
                .sorted()
                .collect(Collectors.joining(", ")) + "]");

        System.out.println("\nOpgesplits in voor en na 2000: ");
        Map<Boolean, List<ProgrammeerTaal>> map = Data.getLijst().stream()
                .collect(Collectors.partitioningBy
                        (p -> p.getOpgerichtIn().isAfter(LocalDate.of(2000,1,1))));

        List<ProgrammeerTaal> voor = map.get(false);
        List<ProgrammeerTaal> na = map.get(true);
        System.out.println("\nVoor 2000");
        voor.forEach(System.out::println);
        System.out.println("\nNa 2000");
        na.forEach(System.out::println);
    }
}
