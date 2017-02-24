import model.Klas;
import model.Student;

/**
 * @author Bryan de Ridder
 * @version 1.0 24-02-17 08:43
 */
public class Main {
    public static void main(String[] args) {
        Klas k = new Klas();
        k.load();
        System.out.println(k);
        k.addStudent(new Student("Jefke", 12));
        k.addStudent(new Student("Leo", 25));
        System.out.println(k);
        k.save();
    }
}
