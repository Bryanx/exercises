import model.Student;
import reflection.ReflectionTester;

import java.sql.Ref;
import java.time.LocalDate;

public class DemoReflection {
    public static void main(String args[]) {
        Student student = new Student(123456, "Igor De Verschrikkelijke", LocalDate.of(1995, 9, 18));
        Integer intObj = new Integer(123);

        ReflectionTester.printName(student);
        ReflectionTester.printName(intObj);
        System.out.println();

        ReflectionTester.printMethods(student);
        ReflectionTester.printConstructors(student);
        System.out.println();

        ReflectionTester.makeAlive(Student.class);
        System.out.println();

        ReflectionTester.examineFields(student);
        System.out.println();

        ReflectionTester.changeByReflection(student);
    }
}
