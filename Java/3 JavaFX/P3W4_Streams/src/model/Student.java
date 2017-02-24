package model;

/**
 * @author Bryan de Ridder
 * @version 1.0 24-02-17 08:44
 */
public class Student {
    private String naam;
    private int leeftijd;

    public Student(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
}
