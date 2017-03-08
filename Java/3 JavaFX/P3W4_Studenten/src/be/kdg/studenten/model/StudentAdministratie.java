package be.kdg.studenten.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentAdministratie {
    private List<Student> studenten;
    private final InputStream inputStream;

    public StudentAdministratie() {
        studenten = new ArrayList<>();
        this.inputStream = this.getClass().getResourceAsStream("studenten.txt");
        this.readStudenten();
    }

    public List<Student> getStudenten() {
        return studenten;
    }

    private void readStudenten() {
        // Hier aanvullen...
        try (BufferedReader bufr =
                     new BufferedReader(
                             new InputStreamReader(inputStream))) {
            String line = bufr.readLine();
            while (line != null) {
                String[] parts = line.split(";");
                Student temp = new Student(parts[0], parts[1], Integer.parseInt(parts[2]),parts[3]);
                studenten.add(temp);
                line = bufr.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
