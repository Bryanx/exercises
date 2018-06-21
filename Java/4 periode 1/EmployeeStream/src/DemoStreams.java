import employee.Data;
import employee.Employee;
import employee.Gender;
import employee.Role;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Vervolledig de volgende code. Maak telkens gebruik van een Stream object op basis van myList
 * De verwachte afdruk staat onderaan
 * */
public class DemoStreams {
    public static void main(String[] args) {
        List<Employee> myList = Data.getDataAsList();

        //Opgave 1:
        //...
        System.out.println("Alle vrouwen van Executive volgens leeftijd:");
        myList.stream()
                .filter(e -> e.getGender().equals(Gender.FEMALE) && e.getRole().equals(Role.EXECUTIVE))
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);


        //Opgave 2:
        double result = 0.0;
        //...
        result = myList.stream()
                .filter(e -> e.getDept().equalsIgnoreCase("sales"))
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();
        System.out.printf("\nGemiddelde leeftijd van de Sales werknemers: %.1f\n", result);


        //Opgave 3:
        String str = "";
        //...
        str = myList.stream()
                .filter(e -> e.getRole().equals(Role.MANAGER))
                .map(Employee::getFullName)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("\nAlfabetische opsomming van de managers:\n" + str);

        //Opgave 4:
        //...
        long aantal = 0;
        aantal = myList.stream()
                .filter(e -> e.getGender().equals(Gender.MALE) && e.getDept().equalsIgnoreCase("eng"))
                .count();
        System.out.println("\nHet aantal mannen op de afdeling \"ENG\": " + aantal);
    }
}

/*
Verwachte afdruk:

Alle vrouwen van Executive volgens leeftijd:
Smith Nancy     age: 55 gender: FEMALE   e-mail: phil.smith@example.com         role: EXECUTIVE    dept: HR
Jones Betty     age: 65 gender: FEMALE   e-mail: betty.jones@example.com        role: EXECUTIVE    dept: Sales

Gemiddelde leeftijd van de Sales werknemers: 47,3

Alfabetische opsomming van de managers:
Adams John, Doe John, Johnson James

Het aantal mannen op de afdeling "ENG": 3
 */
