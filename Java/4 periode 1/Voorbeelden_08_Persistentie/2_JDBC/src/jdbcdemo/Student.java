package jdbcdemo;

public class Student {
    private int id; // primary key
    private String naam;
    private double score;

    public Student(int id, String naam, double score) {
        this.id = id;
        this.naam = naam.trim();
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%3d %-20s %.1f", id, naam, score);
    }
}
