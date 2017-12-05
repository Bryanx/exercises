package streaming;

import model.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreaming {
    public static void main(String[] args) {
        //Testdata:
        List<Person> familyList = Arrays.asList(
                new Person("Homer", "Simpson", 45),
                new Person("Marge", "Simpson", 42),
                new Person("Bart", "Simpson", 10),
                new Person("Lisa", "Simpson", 8),
                new Person("Maggie", "Simpson", 1)
        );

        //1) XML:
        String xml =
                "<family data='Simpsons'>" +
                        familyList.stream()
                                .filter(it -> it.getAge() > 40)
                                .map(it -> "<person>" + it.getFirstName() + "</person>")
                                .reduce("", String::concat)
                        + "</family>";

        System.out.println("Voornamen van de ouders (XML):");
        System.out.println(xml);

        //2) Beter XML:
        String xml2 =
                "<family>" +
                        familyList.stream()
                                .filter(it -> it.getAge() > 40)
                                .map(Person::toXML)
                                .reduce("", String::concat)
                        + "</family>";

        System.out.println("\nVolledige data van de ouders (XML):");
        System.out.println(xml2);

        //3) Json:
        String jsonStr = familyList.stream()
                .filter(it -> it.getAge() > 40)
                .map(Person::toJSON)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("\nVolledige data ouders (JSON):");
        System.out.println(jsonStr);

        //4) Json gesorteerd:
        Comparator<Person> BY_FIRST =
                (lhs, rhs) -> lhs.getFirstName().compareTo(rhs.getFirstName());


        String jsonStr2 = familyList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .map(Person::toJSON)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println("\nVolledige data gesorteerd op voornaam (JSON):");
        System.out.println(jsonStr2);

    }
}

