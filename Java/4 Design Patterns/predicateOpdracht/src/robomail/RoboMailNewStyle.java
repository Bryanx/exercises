package robomail;

import employee.Employee;
import employee.Gender;
import employee.Role;

import java.util.List;
import java.util.function.Predicate;

public class RoboMailNewStyle {

    public void mail(List<Employee> employeeList, Predicate<Employee> pred) {
        for (Employee employee : employeeList) {
            if (pred.test(employee)) {
                roboMail(employee);
            }
        }
    }

    private void roboMail(Employee employee) {
        System.out.println("Emailing: " + employee.getGivenName()
                + " " + employee.getSurName() + " age " + employee.getAge()
                + " at " + employee.getEmail());
    }

}
