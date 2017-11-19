import employee.Data;
import employee.Employee;
import employee.Gender;
import employee.Role;
import robomail.RoboMailNewStyle;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        List<Employee> employeeList = Data.getDataAsList();
        RoboMailNewStyle robo = new RoboMailNewStyle();

        System.out.println("\n==== RoboMail Tests 01 ====");
        System.out.println("\n=== Members of HR ===");
        robo.mail(employeeList, e -> e.getDept().equals("HR"));
        //robo.mail(...);

        System.out.println("\n=== All Sales ===");
        robo.mail(employeeList, e -> e.getDept().equals("Sales"));
        //robo.mail(...);

        System.out.println("\n=== All Sales Executives ===");
        robo.mail(employeeList, e -> e.getDept().equals("Sales") && e.getRole().equals(Role.EXECUTIVE));
        //robo.mail(...);

        System.out.println("\n=== All Sales Employees over 50 ===");
        robo.mail(employeeList, e -> e.getDept().equals("Sales") && e.getAge() > 50);
        //robo.mail(...);

        System.out.println("\n=== All Female Employees ===");
        robo.mail(employeeList, e -> e.getGender().equals(Gender.FEMALE));
        //robo.mail(...);
    }
}

/* Gewenste afdruk:
==== RoboMail Tests 01 ====

=== Members of HR ===
Emailing: John Doe age 28 at john.doe@example.com
Emailing: Nancy Smith age 55 at phil.smith@examp;e.com

=== All Sales ===
Emailing: Jane Doe age 25 at jane.doe@example.com
Emailing: John Adams age 52 at john.adams@example.com
Emailing: Betty Jones age 65 at betty.jones@example.com

=== All Sales Executives ===
Emailing: Betty Jones age 65 at betty.jones@example.com

=== All Sales Employees over 50 ===
Emailing: John Adams age 52 at john.adams@example.com
Emailing: Betty Jones age 65 at betty.jones@example.com

=== All Female Employees ===
Emailing: Jane Doe age 25 at jane.doe@example.com
Emailing: Nancy Smith age 55 at phil.smith@example.com
Emailing: Betty Jones age 65 at betty.jones@example.com
 */