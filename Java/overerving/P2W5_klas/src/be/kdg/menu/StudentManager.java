package be.kdg.menu;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/2016 14:52
 */
public class StudentManager {
    private List<Student> studenten = new ArrayList<>();

    public void toonWoonplaats() {
        return;
    }

    public void toonWoonplaatsen() {
        Set<String> woonplaatsSet = new HashSet<>();
        for (Student student : studenten) {
            woonplaatsSet.add(student.getWoonplaats());
        }
        // Om te kunnen sorteren terug in een list
        List<String> woonplaatsList = new ArrayList<>();
        for (String woonplaats : woonplaatsSet) {
            woonplaatsList.add(woonplaats);
        }
        // Nu sorteren en tonen
        Collections.sort(woonplaatsList);
        for (String s : woonplaatsList) {
            System.out.println(s);
        }
    }

    public void toonJarigen() {
        for (Student student : studenten) {
            if (student.getGeboorteDatum().getMonth()
                    .equals(LocalDate.now().getMonth()))
                System.out.println(student);
        }
    }

    public void toonOpLeeftijd() {
        BirthComparator gc = new BirthComparator();
        Collections.sort(studenten, gc);
        for (Student student : studenten) {
            System.out.println(student);
        }
    }

    public void toonOpNaam() {
        Collections.sort(studenten);
        for (Student student : studenten) {
            System.out.println(student);
        }
    }

    public void laadBestand() {
//        System.out.print("Geef de naam van het bestand: ");
//        Scanner key = new Scanner(System.in);
//        String bestandsNaam = key.nextLine()
//        Path students = Paths.get("resources", bestandsNaam);
        Path students = Paths.get("resources", "studentinfo.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(students);
            while (fileScanner.hasNext()) {
                String[] velden = fileScanner.nextLine().split(",");
                String[] gebDatumDelen = velden[1].split("\\.");
                int dag = Integer.parseInt(gebDatumDelen[0]);
                int maand = Integer.parseInt(gebDatumDelen[1]);
                int jaar = Integer.parseInt(gebDatumDelen[2]);
                LocalDate gebDatum = LocalDate.of(jaar, maand, dag);
                Student s = new Student(velden[0], gebDatum, velden[2], velden[3]);
                studenten.add(s);
            }
        } catch (IOException ioe) {
            System.out.println("bestand is fout.");
        } finally {
            if (fileScanner != null) fileScanner.close();
        }
    }

    public void deleteStudent() {
        Scanner key = new Scanner(System.in);
        System.out.print("Welke student wil je verwijderen?: ");
        String verwijderStudent = key.nextLine();

        Iterator<Student> studentIterator = studenten.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getNaam().equalsIgnoreCase(verwijderStudent)) {
                studentIterator.remove();
                System.out.println("student " + verwijderStudent + " is verwijderd!");
            }
        }
    }

    public void deleteHome() {
        Scanner key = new Scanner(System.in);
        System.out.print("Welke stad wil je verwijderen?: ");
        String deleteCity = key.nextLine();

        Iterator<Student> studentIterator = studenten.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getWoonplaats().contains(deleteCity)) {
                studentIterator.remove();
            }
        }
    }
}
