import model.Klas;
import model.Student;

/**
 * @author Bryan de Ridder
 * @version 1.0 24-02-17 08:43
 */
public class Main {
    public static void main(String[] args) {
        Klas k = new Klas();
        k.loadBinary();
        System.out.println(k);
//        k.addStudent(new Student("Karel", 14));
//        k.addStudent(new Student("Appelman", 15));
//        System.out.println(k);
//        k.saveBinary();
    }
}
