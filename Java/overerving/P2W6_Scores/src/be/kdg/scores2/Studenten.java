package be.kdg.scores2;

import be.kdg.scores.Student;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 17:02
 */
public class Studenten {
    private List<be.kdg.scores.Student> data = new ArrayList<>();
    public Studenten() {
        data.add(new be.kdg.scores.Student("Marieke", 13 ));
        data.add(new be.kdg.scores.Student("Marjolein", 18));
        data.add(new be.kdg.scores.Student("Marijke", 15));
        data.add(new be.kdg.scores.Student("Marie Laure", 14));
    }
    // De eerste regel van deze methode mag je niet wijzigen!
    public String getScores() {
        Set<Student> studenten = new TreeSet<>(data);
        private List<Student> data = new ArrayList<>();
        data.addAll(studenten);
        Collections.sort(data, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) return -1;
                if (o1.getScore() < o2.getScore()) return 1;
                return o1.naam.compareTo(o2.naam);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : studenten) {
            sb.append(student + "\n");
        }
        return sb.toString();
        }

    }
}
