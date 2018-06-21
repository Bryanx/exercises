package be.kdg.scores;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 17:00
 */
public class Student implements Comparable<Student>{
    private String naam;
    private int score;

    public Student(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%-15s -----> %d", this.naam, this.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return score == student.score;

    }

    @Override
    public int hashCode() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        if (score > o.score) return -1;
        if (score < o.score) return 1;
        return naam.compareTo(o.naam);
    }
}
