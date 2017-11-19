import employee.Data;
import employee.Employee;
import robomail.RoboMailOldStyle;
import java.util.List;

public class DemoZonderPredicate {
    public static void main(String[] args) {
        List<Employee> employeeList = Data.getDataAsList();
        RoboMailOldStyle robo = new RoboMailOldStyle();

        System.out.println("\n==== RoboMail Tests 01 ====");
        System.out.println("\n=== Members of HR ===");
        robo.mailAllHr(employeeList);

        System.out.println("\n=== All Sales ===");
        robo.mailAllSales(employeeList);

        System.out.println("\n=== All Sales Executives ===");
        robo.mailSalesExecutives(employeeList);

        System.out.println("\n=== All Sales Employees over 50 ===");
        robo.mailSalesEmployeesOver50(employeeList);

        System.out.println("\n=== All Female Employees ===");
        robo.mailFemaleEmployees(employeeList);

    }
}
