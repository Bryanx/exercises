package be.kdg.programmeertalen.data;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.Stijl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:11
 */
public class Data {

    private static final int SIZE = 15;

    public static List<ProgrammeerTaal> getLijst() {
        List<ProgrammeerTaal> talen = new ArrayList<>(SIZE);
        talen.add(new ProgrammeerTaal("Java", "James Gosling", ".java", 9,
                9000000, Stijl.OBJECTORIENTED, LocalDate.of(1995, 5, 23)));
        talen.add(new ProgrammeerTaal("R", "Ross Ihaka", ".r", 3.4,
                1500000, Stijl.FUNCTIONEEL, LocalDate.of(1993, 8, 1)));
        talen.add(new ProgrammeerTaal("C", "Dennis Ritchie", ".c", 99,
                2520000, Stijl.IMPERATIEF, LocalDate.of(1972, 1, 1)));
        talen.add(new ProgrammeerTaal("Python", "Guido van Rossum", ".py", 3.6,
                5292000, Stijl.OBJECTORIENTED, LocalDate.of(1991, 2, 20)));
        talen.add(new ProgrammeerTaal("Ruby", "Yukihiro Matsumoto", ".rb", 2.4,
                720000, Stijl.FUNCTIONEEL, LocalDate.of(1995, 1, 1)));
        talen.add(new ProgrammeerTaal("Go", "Google", ".go", 1.9,
                180000, Stijl.IMPERATIEF, LocalDate.of(2009, 11, 10)));
        talen.add(new ProgrammeerTaal("C#", "Microsoft", ".cs", 6.0,
                2988000, Stijl.OBJECTORIENTED, LocalDate.of(2000, 1, 1)));
        talen.add(new ProgrammeerTaal("Javascript", "Mozilla", ".js", 6,
                2772000, Stijl.FUNCTIONEEL, LocalDate.of(1995, 12, 4)));
        talen.add(new ProgrammeerTaal("PHP", "Rasmus Lerdorf", ".php", 7,
                3384000, Stijl.IMPERATIEF, LocalDate.of(1995, 6, 8)));
        talen.add(new ProgrammeerTaal("C++", "Bjarne Stroustrup", ".cpp", 14,
                2484000, Stijl.OBJECTORIENTED, LocalDate.of(1983, 1, 1)));
        talen.add(new ProgrammeerTaal("Rust", "Graydon Hoare", ".rs", 1.17,
                108000, Stijl.FUNCTIONEEL, LocalDate.of(2010, 1, 1)));
        talen.add(new ProgrammeerTaal("Scala", "Martin Odersky", ".scala", 1.12,
                432000, Stijl.OBJECTORIENTED, LocalDate.of(2004, 1, 20)));
        talen.add(new ProgrammeerTaal("Swift", "Apple", ".swift", 2.2,
                1044000, Stijl.OBJECTORIENTED, LocalDate.of(2014, 6, 3)));
        talen.add(new ProgrammeerTaal("Visual Basic", "Microsoft", ".vb", 10,
                540000, Stijl.EVENTDRIVEN, LocalDate.of(1991, 1, 1)));
        talen.add(new ProgrammeerTaal("Assembly", "Kathleen Booth", ".", 0,
                756000, Stijl.IMPERATIEF, LocalDate.of(1949, 1, 1)));
        return talen;
    }
}
