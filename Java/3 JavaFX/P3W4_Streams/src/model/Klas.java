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


    //CHARACTER STREAM OUT:
    public void save() {
        try (PrintWriter pw =
                     new PrintWriter(
                             new BufferedWriter(
                                     new FileWriter("files/klas.txt",true)))) {
            for (Student student : studenten) {
                pw.write(student.getNaam() + "|" + student.getLeeftijd() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //CHARACTER STREAM IN:
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

    //BINARY STREAM OUT:
    public void saveBinary() {
        try (DataOutputStream dos =
                     new DataOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream("files/klas.bin",true)))) {
            for (Student student : studenten) {
                dos.writeUTF(student.getNaam());
                dos.writeInt(student.getLeeftijd());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //BINARY STREAM IN:
    public void loadBinary() {
        try (DataInputStream dis =
                     new DataInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("files/klas.bin")))) {
            while (true) {
                String naam = dis.readUTF();
                int leeftijd = dis.readInt();
                Student student = new Student(naam, leeftijd);
                studenten.add(student);
            }

        } catch (EOFException ignored) {
            //alles is ingelezen
        } catch (FileNotFoundException ignored) {
            //no problem
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
