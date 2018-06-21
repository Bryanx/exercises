package be.kdg.scores;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 17:02
 */
public class Studenten {
    private List<Student> data = new ArrayList<>();
    public Studenten() {
        data.add(new Student("Marieke", 13 ));
        data.add(new Student("Marjolein", 18));
        data.add(new Student("Marijke", 15));
        data.add(new Student("Marie Laure", 14));
    }
    // De eerste regel van deze methode mag je niet wijzigen!
    public String getScores() {
        Set<Student> studenten = new TreeSet<>(data);
        studenten.clear();
        Collections.sort(data);
        studenten.addAll(data);
        StringBuilder sb = new StringBuilder();
        for (Student student : studenten) {
            sb.append(student + "\n");
        }
        return sb.toString();
    }
}
