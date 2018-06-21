package model;

import java.util.Comparator;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String toJSON() {
        return "{" +
                "firstName: \"" + firstName + "\", " +
                "lastName: \"" + lastName + "\", " +
                "age: " + age + " " +
                "}";
    }

    public String toXML() {
        return "<person>" +
                "<firstname>" + firstName + "</firstname>" +
                "<lastname>" + lastName + "</lastname>" +
                "<age>" + age + "</age>" +
                "</person>";
    }
}
