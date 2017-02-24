package model;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 24-02-17 08:46
 */
public class Klas {
    private List<Student> studenten;

    public Klas() {
        studenten = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studenten.add(student);
    }

    @Override
    public String toString() {
        String s = "";
        for (Student student : studenten) {
            s += student.getNaam() + ", " + student.getLeeftijd() + "\n";
        }
        return s;
    }

    public void save() {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("files/klas.txt")))) {
            for (Student student : studenten) {
                pw.write(student.getNaam() + "|" + student.getLeeftijd() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try (BufferedReader bw = new BufferedReader(new FileReader("files/klas.txt"))) {
            String line = bw.readLine();
            while (line!=null) {
                String[] s = line.split("\\|");
                Student temp = new Student(s[0],Integer.parseInt(s[1]));
                studenten.add(temp);
                line = bw.readLine();
            }
        } catch (FileNotFoundException e) {
            //no problem
        } catch (NumberFormatException e) {
            System.out.println("File corrupted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
