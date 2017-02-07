package be.kdg.studenten.model;

import java.util.ArrayList;
import java.util.List;

public class StudentAdministratie {
    private List<Student> studenten;

    public StudentAdministratie() {
        studenten = new ArrayList<>();
        studenten.add(new Student("Vermeulen","Jos",12,"INF103A"));
        studenten.add(new Student("Van Hoof","Marianne",189,"INF102A"));
        studenten.add(new Student("Haest","Wim",18976,"INF101B"));
        studenten.add(new Student("Wouters","Griet",145,"INF101A"));
        studenten.add(new Student("Masschelier","Kirsten",3,"INF105B"));
        studenten.add(new Student("Stoop","Flup",896,"INF107A"));
        studenten.add(new Student("Wyns","Sven",8985,"INF107A"));
        studenten.add(new Student("Vermassen","Tim",764576,"INF102B"));
        studenten.add(new Student("Vanderpoel","Gerrit",345,"INF103B"));
        studenten.add(new Student("Aemelinckx","Siegfried",896,"INF107A"));
        studenten.add(new Student("Vermeylen","Werner",5451,"INF105A"));
        studenten.add(new Student("Hoogstraten","Koen",1443,"INF105B"));
    }

    public List<Student> getStudenten() {
        return studenten;
    }
}
