package employee;

import java.util.Arrays;
import java.util.List;

public class Data {
    private static Employee[] employeeArray = {
            new Employee("Bob", "Baker", 23, Gender.MALE, Role.STAFF, "ENG", "bob.baker@example.com"),
            new Employee("Jane", "Doe", 25, Gender.FEMALE, Role.STAFF, "Sales", "jane.doe@example.com"),
            new Employee("John", "Doe", 28, Gender.MALE, Role.MANAGER, "HR", "john.doe@example.com"),
            new Employee("James", "Johnson", 45, Gender.MALE, Role.MANAGER, "Eng", "james.johnson@example.com"),
            new Employee("John", "Adams", 52, Gender.MALE, Role.MANAGER, "Sales", "john.adams@example.com"),
            new Employee("Joe", "Bailey", 62, Gender.MALE, Role.EXECUTIVE, "Eng", "joebob.bailey@example.com"),
            new Employee("Nancy", "Smith", 55, Gender.FEMALE, Role.EXECUTIVE, "HR", "phil.smith@example.com"),
            new Employee("Betty", "Jones", 65, Gender.FEMALE, Role.EXECUTIVE, "Sales", "betty.jones@example.com")
    };

    public static List<Employee> getDataAsList() {
        return Arrays.asList(employeeArray);
    }
}
